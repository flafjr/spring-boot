echo "Stopping containers..."

docker-compose down

echo "Tearing down docker containers and volumes... "

docker rm -f "$(docker ps -a -q)"
docker volume rm "$(docker volume ls -q)"

sleep 10