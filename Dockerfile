FROM openjdk:17-jdk-slim


COPY ./target/spring-boot-assignment.jar  .

RUN chmod +x ./spring-boot-assignment.jar

ENTRYPOINT ["java","-jar","spring-boot-assignment.jar"]