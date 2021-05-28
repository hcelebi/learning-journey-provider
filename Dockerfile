FROM openjdk:8u292-jdk-buster
COPY /target/learning-journey-provider-0.0.1-SNAPSHOT.jar  /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Main.java
CMD ["java", "Main"]