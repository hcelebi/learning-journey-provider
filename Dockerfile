FROM openjdk:8u292-jdk-buster
COPY /target/learning-journey-provider-0.0.1-SNAPSHOT.jar  /app/app.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
