Docker Image Generation for a Simple Spring Boot Application 

Steps to generate docker image

-Write a docker file. Specify all the necessary config(Eg Working dir , Port exposing etc)

Commands:
1) mvn clean   (cleans all files generated during previous build)
2) mvn install (Will generate the JAR file for docker)
3) docker build -t spring-boot-docker.jar .  (Will generate the image)
4) Check if image is created or not(Using command: docker image ls)
5) docker run -p 9090:8080 spring-boot-docker.jar (Runs the container) 

The application will now run on localhost 9090. 

API Calls - The application consists of 3 simple calls

1)POST http://localhost:9090/listoperations/string - Replace the default array with a desired integer array.(Input an integer array in the body)

2)GET  http://localhost:9090/listoperations/sort - Returns the sorted array in the output.

3)GET  http://localhost:9090/listoperations/reverse - Returns the reversed array in the output.

----------------------------------------------------------------------------------

