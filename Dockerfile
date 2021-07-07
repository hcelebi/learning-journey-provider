FROM maven:latest AS build
WORKDIR /build
COPY pom.xml /build/pom.xml
COPY src /build/src
RUN mvn clean install -Dpact.verifier.publishResults=true

FROM openjdk:8u292-jdk-buster AS application
COPY --from=build /build/target/learning-journey-provider-*.jar  /app/app.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
