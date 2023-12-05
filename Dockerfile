
FROM maven:3.8.4-openjdk-11-slim AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean install -DskipTests

FROM openjdk:11-jre-slim

WORKDIR /app

COPY - from=build /app/target/logi-dashboard.jar .

CMD ["java", "-jar", "logi-dashboard.jar"]