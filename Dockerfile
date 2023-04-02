# syntax=docker/dockerfile:1

FROM williamyeh/java8:latest
MAINTAINER mayucheng
COPY target/maven-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]