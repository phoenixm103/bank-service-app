FROM openjdk:8-jdk-alpine
EXPOSE 6081
WORKDIR /app
COPY target/bank-service-3.jar .
ENTRYPOINT [ "java", "-jar", "bank-service-3.jar" ]