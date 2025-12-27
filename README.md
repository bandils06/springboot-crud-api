# Spring Boot CRUD API

This project is a backend application built using **Spring Boot** to revise and strengthen core concepts.  
It provides **RESTful APIs** to perform **CRUD (Create, Read, Update, Delete)** operations on a database.

The project follows standard backend development practices and is intended for learning and hands-on practice.

---

## Features

- RESTful API design
- CRUD operations on database entities
- Spring Boot architecture
- Layered structure (Controller, Service, Repository)
- Easy to extend for real-world use cases

---

## Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

## Project Structure
src/main/java
            └── com.example.demo.appOne
                ├── controller
                ├── service
                ├── repository
                └── model
src/main/resources
                └── application.properties
                └── data.sql

---

## API Endpoints (Sample)

| Method | Endpoint | Description |
|------|--------|------------|
| POST | `/api/products` | Create a new record |
| GET | `/api/products` | Get all records |
| GET | `/api/products/{id}` | Get record by ID |
| PUT | `/api/products/{id}` | Update record |
| DELETE | `/api/products/{id}` | Delete record |
