FROM maven:3.8.3-openjdk-17
ARG artifact=target/*.jar
WORKDIR /opt/app
COPY ${artifact} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
