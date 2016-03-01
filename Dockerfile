FROM java:8-jdk
MAINTAINER mlabouardy <mohamed@labouardy.com>

COPY socialnetwork-service-1.0.jar /

EXPOSE 8080
CMD ["java", "-jar", "/socialnetwork-service-1.0.jar"]
