FROM openjdk:8-jdk-alpine
MAINTAINER mcdeden <mcdeden@gmail.com>
VOLUME /tmp
EXPOSE 8211
ADD target/*.jar Progress.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Progress.jar"]