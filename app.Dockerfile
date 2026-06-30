#Docker image for running a jar file, not compiled via graalvm

FROM eclipse-temurin:25-jdk-alpine
WORKDIR /app
ENV TZ="Asia/Kolkata"
EXPOSE 8080
COPY target/*.jar app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]