# Use the official OpenJDK image as a base
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY . .

# Compile the Java program
RUN javac SumOfMaxMin.java

# Command to run the application
CMD ["java", "SumOfMaxMin"]
