FROM openjdk:8-jre-slim

ADD target/fib-service-*.jar fib-service.jar

EXPOSE 8022

ENTRYPOINT java -jar -Dspring.profiles.active=${ACTIVE_PROFILE} fib-service.jar