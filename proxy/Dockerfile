FROM openjdk:8-jre-slim

ADD target/proxy-*.jar proxy.jar

EXPOSE 8080

ENTRYPOINT java -jar -Dspring.profiles.active=${ACTIVE_PROFILE} proxy.jar