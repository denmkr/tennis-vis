FROM openjdk:8-jdk-alpine

EXPOSE 8080

RUN apk update
RUN apk add maven

# WORKDIR tennis-backend/
# RUN mvn package

ARG JAR_FILE=tennis-backend/target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]