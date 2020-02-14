# Declare which image to pull
FROM postgres:11.6

# Set default credentials and database
ENV POSTGRES_USER pg_user
ENV POSTGRES_PASSWORD pg_pass
ENV POSTGRES_DB tennis

RUN apt-get update
RUN apt-get install -y dos2unix

VOLUME [ "/docker-entrypoint-initdb.d" ]

COPY docker-entrypoint.sh /docker-entrypoint.sh
RUN dos2unix /docker-entrypoint.sh