FROM openjdk:latest

ADD target/spring-project-db-lab-6-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
