#Using the image of JAVA 17
FROM openjdk:17

#Setting the working directory to app
WORKDIR /app

#Copy the target files from the host to the running container
COPY target/spring-boot-docker.jar spring-boot-docker.jar

#Exposing the port 8080 (Spring Boot running on port 8080)
EXPOSE 8080

#Setting entry point to run the application
ENTRYPOINT ["java","-jar","/app/spring-boot-docker.jar"]