#Image for running the java app compiled via graalvm on ubuntu, use distroless for security and smaller, use debian distro for debugging

FROM gcr.io/distroless/base-debian12
# FROM debian:12-slim
WORKDIR /app
EXPOSE 8080
ENV TZ="Asia/Kolkata"
COPY target/employee /app/employee
ENTRYPOINT ["/app/employee"]