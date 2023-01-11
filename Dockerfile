FROM amazoncorretto:17-alpine-jdk

MAINTAINER Leo22mv

COPY target/Portfolio-backend.jar Portfolio-backend.jar

ENTRYPOINT ["java","-jar","/Portfolio-backend.jar"]