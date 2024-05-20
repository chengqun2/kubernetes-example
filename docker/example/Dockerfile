FROM openjdk:8-jre
MAINTAINER example
RUN mkdir  /example
WORKDIR /example
EXPOSE 8888
COPY ./example /example
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "example.jar"]