FROM openjdk:17
EXPOSE 8080
ADD target/logi-dashboard.jar logi-dashboard.jar
ENTRYPOINT ["java","-jar","/logi-dashboard.jar"]