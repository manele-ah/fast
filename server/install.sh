#!/usr/bin/env bash

# Check if the input command exists.
command_exists() {
	command -v "$@" >> $log_file_path 2>&1
}

# Get a given property from an input file.
get_property() {
	property_file=$1
	property_key=$2
	property_value=`cat $property_file | grep -w "$property_key" | cut -d'=' -f2`
	echo $property_value
}

# Install the required dependencies.
# For now, only the Ubuntu's package manager is supported.
install_dependencies() {
	user="$(id -un 2>>$log_file_path || true)"

	# Check if the script is running with root permissions.
	if [ "$EUID" -ne 0 ]; then
			cat <<-EOF | tee -a $log_file_path
			Error: This script needs the ability to run commands as root.
			EOF
			exit 1
	fi

	# Get the distribution name.
	if type lsb_release >> $log_file_path 2>&1; then
		distribution=$(lsb_release -si)
	elif [ -f /etc/centos-release ]; then
		distribution='CentOS'
	fi

	# Check if the docker command exists.
	if command_exists docker; then
		cat <<-EOF | tee -a $log_file_path
		Warning: The "docker" command appears to already exist on this system.
		You may press Ctrl+C now to abort this script.
		EOF
		( set -x; sleep 5 )
	fi

	# Install the required dependencies.
	if [ $distribution == 'Ubuntu' ]; then
		printf "\nInfo: Removing older versions of Docker.\n\n"
		apt-get remove -y docker docker-engine docker.io containerd runc 2> >(tee -a $log_file_path >&2) 
		printf "\nInfo: Installing Docker.\n\n"
		apt-get update 2> >(tee -a $log_file_path >&2) 
		apt-get install -y sshpass openssh-server apt-transport-https ca-certificates curl gnupg lsb-release software-properties-common 2> >(tee -a $log_file_path >&2) 
		mkdir -p /etc/apt/keyrings
		curl -fsSL https://download.docker.com/linux/ubuntu/gpg | gpg --dearmor --yes -o /etc/apt/keyrings/docker.gpg
		echo "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | tee /etc/apt/sources.list.d/docker.list > /dev/null
		apt-get update 2> >(tee -a $log_file_path >&2)
		apt-cache policy docker-ce
		apt-get install -y docker-ce docker-ce-cli containerd.io docker-compose-plugin 2> >(tee -a $log_file_path >&2) 
	fi
}

# Set up the lists of files needed for Docker, Apache and TimeScaleDB.
set_up() {
	for file_name in "${framework_environment_path}/*.env"; do
		framework_environment_files+=(${file_name//$'\n'/})
	done
	for file_name in "${time_scale_db_environment_path}/*.env"; do
		time_scale_db_environment_files+=(${file_name//$'\n'/})
	done
	for file_name in "${web_server_configuration_path}/*_data_manager_database.properties"; do
		web_server_configuration_files+=(${file_name//$'\n'/})
	done
	docker_directory=$(get_property "${framework_environment_files[0]}" 'DOCKER_DIRECTORY')
}

# Copy the generated configuration files into their respective directories.
copy_files() {
	printf "\nInfo: Copying necessary files.\n\n"
	# cp -R ./docker "$docker_directory" >> $log_file_path 2>&1
	cp "${framework_environment_files[0]}" "$docker_directory/environment.env" >> $log_file_path 2>&1
	cp "${time_scale_db_environment_files[0]}" "$docker_directory/time_scale_db/environment.env" >> $log_file_path 2>&1
	cp "${web_server_configuration_files[0]}" "$docker_directory/apache/fr.ubo.fast.data.manager-0.0.1-SNAPSHOT/WEB-INF/conf/database.properties" >> $log_file_path 2>&1
}

# Generate the war file for the Data Manager web service.
create_war() {
	printf "\nInfo: Generating war file.\n\n"
	current_folder=$(pwd)
	cd "$docker_directory/apache/fr.ubo.fast.data.manager-0.0.1-SNAPSHOT/" && jar -cvf "../fr.ubo.fast.data.manager-0.0.1-SNAPSHOT.war" * >> $log_file_path 2>&1
	cd "$current_folder"
}

# Run Docker and start the database and web server services.
run_docker() {
	time_scale_db_up=false
	apache_up=false
	systemctl enable docker.service
	systemctl enable containerd.service
	systemctl start docker
	docker compose --file "$docker_directory/docker_compose.yml" --env-file "$docker_directory/environment.env" up -d | tee -a $log_file_path 2>&1
	while [ "$time_scale_db_up" = false ] || [ "$apache_up" = false ]; do
		if [ $(docker inspect -f {{.State.Running}} timescaledb) ]; then
			echo "TimeScaleDB is running."
			time_scale_db_up=true
		else
			echo "TimeScaleDB is not running."
		fi
		if [ $(docker inspect -f {{.State.Running}} apache) ]; then
			echo "Apache is running."
			apache_up=true
		else
			echo "Apache is not running."
		fi
		( set -x; sleep 2 )
	done
}

distribution=''
log_file_path=''
log_file_name="log_$(date +%F-%H%M%S).txt"

working_directory=''
docker_directory=''
configuration_files_path='./conf'
framework_environment_path="$configuration_files_path/docker"
time_scale_db_environment_path="$configuration_files_path/time_scale_db"
web_server_configuration_path="$configuration_files_path/web_server"
framework_environment_files=()
time_scale_db_environment_files=()
web_server_configuration_files=()

working_directory=$(pwd)
mkdir -p logs
touch "logs/$log_file_name"
log_file_path="$working_directory/logs/$log_file_name"
install_dependencies
set_up
copy_files
create_war
run_docker
trap "exit" SIGINT

