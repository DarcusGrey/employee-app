#Image for running the java app compiled via graalvm on ubuntu

FROM ubuntu:24.04
WORKDIR /app
COPY target/employee /app/employee
EXPOSE 8080
ENTRYPOINT ["/app/employee"]