#Needed because latest version of liquibase does not have inbuilt drivers
FROM liquibase/liquibase:latest
#Use this for prod, for dev use volume mount in docker-compose.
# COPY db/changelog /liquibase/changelog
COPY ./drivers /liquibase/lib