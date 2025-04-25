#!/usr/bin/env bash

working_directory=$(pwd)
log_file_name="log_$(date +%F-%H%M%S).txt"
mkdir -p logs
touch "logs/$log_file_name"
log_file_path="$working_directory/logs/$log_file_name"

intervals=()
table_names=()

time_series_id=$1
start_time=$2
end_time=$3

# Parse the input intervals.
data=$(echo "$4" | tr -d '[]')
IFS=', ' read -ra intervals <<< "$data"

for i in "${!intervals[@]}"; do
	table_names+=("observations_min_max_id_${time_series_id}_interval_${intervals[$i]}")
done

# Set the database password as an environment variable.
export PGPASSWORD=$7

query_template='CREATE TABLE %s
AS
(
	SELECT time_bucket('"'"'%s'"'"', time) AS time_interval, MAX(value) AS max_aggregate, MIN(value) AS min_aggregate
	FROM observations
	WHERE time >= '"'"'%s'"'"' AND time < '"'"'%s'"'"' AND time_series_id = %s
	GROUP BY time_interval
	ORDER BY time_interval ASC
);
ALTER TABLE %s ADD CONSTRAINT %s PRIMARY KEY(time_interval);
SELECT create_hypertable('"'"'%s'"'"', '"'"'time_interval'"'"', migrate_data => TRUE);'

# Create the pre-computed tables in the TimeScaleDB container.
for i in "${!table_names[@]}"; do
	printf '\n'
	interval="${intervals[$i]} Seconds"
	pkey_name="${table_names[$i]}_pkey"
	printf -v query "${query_template}" "${table_names[$i]}" "${interval}" "${start_time}" "${end_time}" "${time_series_id}" "${table_names[$i]}" "${pkey_name}" "${table_names[$i]}";
	echo "$query";
	docker exec $5 psql -U $6 $8 -c "$query"
done
