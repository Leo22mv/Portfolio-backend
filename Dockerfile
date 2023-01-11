FROM amazoncorretto:17-alpine-jdk

MAINTAINER Leo22mv

COPY target/portfolio-backend.jar portfolio-backend.jar

ENTRYPOINT ["java","-jar","/portfolio-backend.jar"]