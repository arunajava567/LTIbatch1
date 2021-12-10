FROM openjdk:8

ADD target/springboot-docker-hello.jar springboot-docker-hello.jar

EXPOSE 8090

ENTRYPOINT ["java","-jar","springboot-docker-hello.jar"]