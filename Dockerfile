FROM openjdk:17
EXPOSE 8080
ADD target/eclaimcustomerbusinessservice.jar  eclaimcustomerbusinessservice.jar
ENTRYPOINT ["java","-jar","/eclaimcustomerbusinessservice.jar"]