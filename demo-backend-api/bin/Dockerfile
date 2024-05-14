FROM openjdk:17-jdk-alpine
RUN mkdir /pagar
WORKDIR /pagar
COPY /demo-backend-api.jar /pagar/pagar.jar
CMD [ "java", "-jar", "pagar/pagar.jar" ]