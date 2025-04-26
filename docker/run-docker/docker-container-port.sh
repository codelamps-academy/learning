# PORT FORWARDING

# PULL IMAGE
docker image pull nginx:latest

# CREATE CONTAINER MENGGUNAKAN PORT FORWARDING
docker container create --name nginx-server --publish 8080:80 nginx:latest
