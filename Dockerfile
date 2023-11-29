FROM openjdk:17
WORKDIR /usr/src/myapp
COPY target/logi-dashboard-1.0-SNAPSHOT.jar /usr/src/myapp
CMD ["java", "-jar", "/usr/src/myapp/logi-dashboard-SNAPSHOT.jar"]