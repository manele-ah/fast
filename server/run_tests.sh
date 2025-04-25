#!/usr/bin/env bash

client_username=$1
client_hostname=$3
client_password=$2
server_directory='/usr/share/fast/conf'
client_directory='"/C:/Program Files/Fast/"'
client_jar='"C:\Program Files\Fast\configuration_client.jar"'

sshpass -p $client_password scp -rv $server_directory ${client_username}@${client_hostname}:"$client_directory"

sshpass -p $client_password ssh ${client_username}@${client_hostname} "java -jar $client_jar"

