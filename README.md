# UnWasted
## Spring Boot Backend

Welcome to UnWasted, a platform designed to connect local producers with the community while tackling food waste. Our mission is to make it easier for producers to share what they have to offer and for consumers to access fresh, local products right where they are.

This repository contains the backend code for a project developed using Spring Boot and Maven. The backend serves as a RESTful API, enabling seamless interaction with a MySQL database. It facilitates data manipulation by receiving and returning JSON payloads.

---

## Table of Contents

- [About](#about)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [API Endpoints](#api-endpoints)
---

## About

This backend is built with Spring Boot and provides a REST API for managing and interacting with data in a MySQL database. 
It is designed to work as a companion to the frontend application (available [here](https://github.com/JoseAntonioMoreira/UnWastedSPA-FrontEnd)) and serves as the core data management layer for the project.

---

## Features

### Implemented Features:

- **RESTful API Controllers:** Handle HTTP requests to perform CRUD operations.
- **MySQL Database Integration:** Stores and retrieves data efficiently.
- **JSON Communication:** Receives and returns JSON for easy integration with frontends.
- **Spring Boot Configuration:** Simplified setup and configuration for rapid development.
---

## Technologies Used

- **Java**: Core programming language.
- **Spring Boot**: Framework for building the REST API.
- **Maven**: Build and dependency management tool.
- **MySQL**: Relational database for persistent storage.
- **Hibernate**: ORM for database interaction.

---

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/JoseAntonioMoreira/UnWasted-BackEnd.git
   ```
2. Navigate to the project directory:
   ```bash
   cd UnWasted-BackEnd
   ```
3. Configure the database connection:
   - Open `src/main/resources/application.properties`.
   - Update the following properties with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```
4. Build the project using Maven:
   ```bash
   mvn clean install
   ```
5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

---

## API Endpoints

### Example Endpoints:

1. **GET /api/producers**
   - Description: Fetch all producers from the database.
   - Response: JSON array of items.

2. **POST /api/producer
   - Description: Add a new producer to the database.
   - Request Body:
     ```json
     {
       "name": "Producer Name",
       "location": "Producer location",
       "address" : "Producer's adress",
       "email" : "Producer email",
       "images" : "Producer photo",
       "phone" : "Producer phone",
       "password": "Secret Password",
       "list_produts" : "List of products, quantity and price"
     }
     ```
   - Response: JSON object of the created item.

3. **PUT /api/items/{id}**
   - Description: Update an existing item.
   - Request Body:
     ```json
     {
       "name": "Updated Producer Name",
       "location": "Updated Producer location",
       "address" : "Updated Producer's adress",
       "email" : "Updated Producer email",
       "images" : "Updated Producer photo",
       "phone" : "Updated Producer phone",
       "password": "Updated Secret Password",
       "list_produts" : "Updated List of products, quantity and price"
     }
     ```
   - Response: JSON object of the updated item.

4. **DELETE /api/items/{id}**
   - Description: Delete an item by ID.
   - Response: Success message.

---

Thank you for exploring this Spring Boot backend! If you have any questions or suggestions, feel free to open an issue or reach out.

