FROM eclipse-temurin:17.0.9_9-jdk
WORKDIR /app
COPY target/vaika-0.0.1-SNAPSHOT.jar vaika.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","vaika.jar"]