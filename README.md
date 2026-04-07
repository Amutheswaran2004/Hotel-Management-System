# Hotel Booking System

A microservices-based Hotel Booking System built with Java and Spring Boot.

## Architecture

This project is designed using a microservices architecture to ensure scalability and maintainability. Various domains of the booking process are separated into independent, loosely coupled services communicating via REST endpoints (using OpenFeign) and managed by a centralized Netflix Eureka Discovery Server.

## Technologies & Tools

- **Java 21**
- **Spring Boot 3.4.8**
- **Spring Cloud** (Netflix Eureka Client & Server, OpenFeign)
- **H2 Database** (In-memory SQL database for straightforward local development)
- **Maven** (Build and Dependency Management)

## Modules Overview

The system is composed of the following microservices:

1. **`eureka-server`**
   - Acts as the central Service Registry and Discovery Server using Spring Cloud Netflix Eureka. All other microservices register themselves dynamically here.

2. **`user-module`**
   - Manages user profiles, credentials, and user data. 

3. **`roomManagement-module`**
   - Handles room inventory, room details, tracking real-time room availability, and hotel-wide room configurations.

4. **`reservation-module`**
   - Manages user bookings, orchestrating availability checks with the room module and maintaining comprehensive reservation records.

5. **`payment-module`**
   - Deals with simulating and recording payment processing and transactions during or after the reservation phase.

## How to Run Locally

### Prerequisites
- **JDK 21** installed and configured on your machine.
- **Maven** installed (or utilize your IDE's integrated Maven support).

### Steps to Run

1. **Start the Service Registry:**
   - Navigate to the `eureka-server` module.
   - Run the application (via your IDE or `mvn spring-boot:run`).
   - Wait for it to initialize completely (typically accessible at `http://localhost:8761`).

2. **Start the Modules:**
   - Launch the individual microservices: `user-module`, `payment-module`, `reservation-module`, and `roomManagement-module`.
   - Wait for them to register successfully with the Eureka Server.

3. **Access the Databases:**
   - By default, the services use an in-memory H2 database.
   - You can inspect tables and data by navigating to the `/h2-console` endpoint on each module's respective running port.

## Future Roadmap
- Integration with powerful **Spring Security** and **JWT (JSON Web Tokens)** for strict user Authentication and cross-service Authorization limits.