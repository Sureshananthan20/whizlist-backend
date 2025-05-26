# Use official OpenJDK image as base
FROM openjdk:18-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy the jar built by Maven into the container
COPY target/taskManager-0.0.1-SNAPSHOT.jar app.jar

# Expose port your Spring Boot app runs on (default 8080)
EXPOSE 8080

# Command to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
