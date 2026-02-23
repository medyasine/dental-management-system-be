FROM eclipse-temurin:17-jre

WORKDIR /app

# change the jar name/path if your jar is different
COPY target/*.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/app/app.jar"]