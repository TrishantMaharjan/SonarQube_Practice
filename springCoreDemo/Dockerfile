FROM openjdk:22-jdk-slim
ARG artifact=target/*.jar
WORKDIR /opt/app
COPY ${artifact} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
