FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-jpa-docker-integration.jar spring-boot-jpa-docker-integration.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-jpa-docker-integration.jar"]