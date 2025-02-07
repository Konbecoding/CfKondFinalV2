# Coding Factory Final Project

## Description

This my final CF project its a Spring Boot application that includes a custom authentication system implementing Spring Security, Users can register, log in, and access the Tetris game. 

## Technologies & Features

- **Back-End:** Spring Boot, Spring Security, Spring Data JPA  
- **Database:** MySQL  
- **Front-End:** HTML, CSS w/ Thymeleaf  
- **Build Tool:** Gradle  
- **Containerization:** Docker (Docker Compose)

## Prerequisites

Before running the application, make sure that you have the following installed:

1. **Java 17++** : [Download Here](https://adoptium.net/)  
2. **Gradle** : [Download Here](https://gradle.org/install/)  
3. **IDE** : Use IntelliJ IDEA, Eclipse, or any preferred IDE that supports Spring Boot.  
4. **Docker** : [Download Here](https://www.docker.com/get-started)  

## Build & Deployment

Make sure that you have installed all the prerequisites listed above and download or clone the repository.
After that open your IDE and type “./gradlew build” in the terminal in order to build a launchable .JAR file, after making sure that it has been created in the “build/libs” directory type “docker-compose up” in the terminal, open any preferred browser and navigate to http://localhost:8080 to access the application. 
