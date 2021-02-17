FROM openjdk:8-jre-slim

ADD target/fact-service-*.jar fact-service.jar

EXPOSE 8071

ENTRYPOINT java -jar -Dspring.profiles.active=${ACTIVE_PROFILE} fact-service.jar