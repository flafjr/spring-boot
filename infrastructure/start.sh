#!/bin/bash

sh ./stop.sh

echo
echo
printf "Starting docker containers...\n\n"

docker-compose up -d

docker-compose logs

printf "Done!\n"
