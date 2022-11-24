FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/task-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} task-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/task-0.0.1-SNAPSHOT.jar"]