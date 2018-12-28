FROM wrlennon/alpine-java8-jre:latest

LABEL maintainer=lihaorong


COPY hello-green-0.1.0.jar /opt
 

ENTRYPOINT ["java", "-jar", "/opt/hello-green-0.1.0.jar"]

EXPOSE 8080
