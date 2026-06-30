#Image for running the java app compiled via graalvm on ubuntu, use distroless for security and smaller, use debian distro for debugging

FROM gcr.io/distroless/base-debian12
#For redhat distribution, use the following line instead of the above line
# FROM registry.access.redhat.com/ubi9/ubi-minimal
WORKDIR /app
EXPOSE 8080
ENV TZ="Asia/Kolkata"
COPY target/employee /app/employee
ENTRYPOINT ["/app/employee"]