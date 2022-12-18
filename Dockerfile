# syntax=docker/dockerfile:1.2

# Specify a base image
FROM eclipse-temurin:17-jdk-alpine

# install ssh client and git
RUN apk add --no-cache git

# Create and open directory for code
WORKDIR /usr/fibcalc

# Clone the repository into current dir
RUN git clone https://github.com/maciejzarebski1/FibCalc.git .

# Add executable permissions to Maven wrapper file
RUN chmod +x mvnw

# Build executable .jar file with Maven wrapper
RUN ./mvnw clean package

# Run executable
ENTRYPOINT ["java", "-jar", "/usr/fibcalc/target/FibCalc-v1.jar"]