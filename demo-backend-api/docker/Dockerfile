FROM openjdk:17-jdk-alpine
RUN mkdir /pagar
WORKDIR /pagar
COPY /demo-backend-api\target\demo-backend-api-0.0.1-SNAPSHOT.jar /pagar/pagar.jar
CMD [ "java", "-jar", "pagar/pagar.jar" ]