FROM java:8-jdk-alpine
COPY ./target/Editique-1.0.0.jar  /usr/
WORKDIR /usr/
RUN sh -c 'touch Editique-1.0.0.jar'
ENTRYPOINT ["java, "-jar", "Editique-1.0.0.jar"]