# For creating a docker image on redhat distribution compiled via graalvm

FROM registry.access.redhat.com/ubi9/ubi-minimal
WORKDIR /app
COPY target/employee /app/employee
ENV TZ="Asia/Kolkata"
EXPOSE 8080
ENTRYPOINT ["/app/employee"]