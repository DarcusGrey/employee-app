#Needed because latest version of liquibase does not have inbuilt drivers
FROM liquibase/liquibase:latest
COPY ./drivers /liquibase/lib