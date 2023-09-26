FROM amazoncorretto:21-alpine-jdk

LABEL org.opencontainers.image.source=https://github.com/minova-afis/aero.minova.cors.test
LABEL company="AFIS GmbH & Co. KG"
LABEL maintainer=schafferhans@minova.aero

WORKDIR /application
ADD target/cors.test-*-exec.jar /application/cors-test.jar

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

EXPOSE 8080
EXPOSE 8081
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/application/cors-test.jar"]