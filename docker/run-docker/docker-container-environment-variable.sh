# DOCKER CONTAINER ENVIRONMENT VARIABLE

# SETTING ENV MONGODB
docker container create --name mongo-server --publish 27017:27017 --env MONGO_INITDB_ROOT_USERNAME=blackspring --env MONGO_INITDB_ROOT_PASSWORD=blackspring mongo:latest

# SETTING ENV POSTGRESQL
docker container create --name postgresql-server --publish 5432:5432 --env