# Basis-Image mit Java 17
FROM eclipse-temurin:17-jdk-alpine
LABEL authors="yukad"

# Arbeitsverzeichnis
WORKDIR /app

# Jar-Datei ins Image kopieren
COPY target/api-gateway-0.0.1-SNAPSHOT.jar app.jar

# Startkommando
ENTRYPOINT ["java","-jar","app.jar"]