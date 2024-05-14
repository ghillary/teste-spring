FROM openjdk:17-jdk-alpine
RUN mkdir /notificar
WORKDIR /notificar
COPY /demo-pagamentos-worker.jar /notificar/notificar.jar
CMD [ "java", "-jar", "notificar/notificar.jar" ]