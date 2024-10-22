# Project: Spring Boot Kafka Microservices with Docker Integration

## Overview
In this project, I developed a Spring Boot application that demonstrates the power of asynchronous messaging with **Apache Kafka**. The application consists of two core services:

### Producer Service
- Pushes messages to Kafka topics.
- Implements an event-caller class to facilitate one-to-one communication between components.

### Consumer Service
- Listens to Kafka topics and processes the consumed messages in real-time.

## Docker Integration
I configured Kafka in a Docker environment, using a `docker-compose` YAML file to initialize both the Kafka server and the Kafka UI for easier management and monitoring.

## Key Technologies Used
- **Spring Boot**: For developing microservices.
- **Kafka**: To enable an event-driven architecture.
- **Docker**: For containerization and deployment.
- **Kafka UI**: To monitor and interact with Kafka topics.

## Features
- Asynchronous message processing between services.
- Real-time message consumption and processing.
- Easy management of Kafka services through Docker.

## Conclusion
This project showcases my ability to design scalable microservices, configure Kafka with Spring Boot, and deploy the solution using Docker.

Feel free to reach out if you have any questions or need further information!
