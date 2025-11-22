#Start with a base image containing Java runtime
FROM openjdk:21-ea

#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="iyed.com"

# Add the application's jar to the image
COPY target/league-microservice-0.0.1-SNAPSHOT.jar league-microservice-0.0.1-SNAPSHOT.jar


# execute the application
ENTRYPOINT ["java", "-jar", "league-microservice-0.0.1-SNAPSHOT.jar"]