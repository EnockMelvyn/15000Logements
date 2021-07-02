FROM mysql:8.0

COPY ./db15000.sql /docker-entrypoint-initdb.d/

EXPOSE 8085