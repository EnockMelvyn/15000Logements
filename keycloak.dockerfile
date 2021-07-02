FROM jboss/keycloak:13.0.1

COPY export_keycloak_15000.json /tmp/export_keycloak_15000.json

ENV KEYCLOAK_USER admin
ENV KEYCLOAK_PASSWORD admin

ENV KEYCLOAK_IMPORT /tmp/export_keycloak_15000.json