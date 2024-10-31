# System Management Books CRUD

This project is a simple CRUD API for managing books in a library system, built using **Spring Boot**, **Spring Data JPA**, **MapStruct**, **Lombok**, and **MySQL**. This application allows users to create, read, update, and delete books, showcasing the power of Spring Boot for rapid application development.

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Project Structure](#project-structure)
- [Database Configuration](#database-configuration)
- [Endpoints and CRUD Operations](#endpoints-and-crud-operations)
- [Contact and Social Links](#contact-and-social-links)
- [License](#license)

---

## Introduction

The **System Management Books CRUD** application allows users to manage books with attributes such as title, author, genre, price, and publication year. By using Spring Boot, Spring Data JPA, and other modern tools, this project provides a robust structure for managing data and demonstrates the flexibility of Spring Boot for rapid, production-ready application development.

## Technologies Used

- **Java 17**
- **Spring Boot 3.3.0** (RESTful APIs)
- **Spring Data JPA** (Database interaction)
- **MapStruct** (Mapping between DTO and Entity)
- **Lombok** (Reducing boilerplate code)
- **MySQL** (Database)

## Setup and Installation

### Prerequisites

- Java 17 or higher
- Maven 3.8.1 or higher
- MySQL

### Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/NSTLRD/book-management.git
   cd book-management
   ```

2. **Build the project**:
   ```bash
   mvn clean install
   ```

3. **Configure the Database**: Update your MySQL credentials in `src/main/resources/application.yml` (see below for details).

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **API Documentation**: Access Swagger UI (if enabled) at:
   ```
   http://localhost:8080/swagger-ui.html
   ```

## Project Structure

```
src
├── main
│   ├── java/com/mentorly/book_management
│   │   ├── controller
│   │   ├── dto
│   │   ├── entity
│   │   ├── mapper
│   │   ├── repository
│   │   └── service
├── resources
│   └── application.yml
└── test
```

- **Controller**: Defines REST endpoints.
- **DTO**: Data Transfer Objects for client-server interaction.
- **Entity**: Represents the database tables.
- **Mapper**: Converts between `Entity` and `DTO` (MapStruct).
- **Repository**: Database access layer (Spring Data JPA).
- **Service**: Business logic.

## Database Configuration

In `src/main/resources/application.yml`, configure the following settings to connect to your MySQL database:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/book_management
    username: your_username
    password: your_password
    driver-class-name: com.mysql.cj.jdbc.Driver

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    database-platform: org.hibernate.dialect.MySQL8Dialect
```

Replace `your_username` and `your_password` with your actual MySQL credentials.

## Endpoints and CRUD Operations

| Method | Endpoint          | Description                |
|--------|--------------------|----------------------------|
| POST   | `/api/v1/books`   | Create a new book          |
| GET    | `/api/v1/books`   | Get a list of all books    |
| GET    | `/api/v1/books/{id}` | Get a book by ID        |
| PUT    | `/api/v1/books/{id}` | Update a book by ID     |
| DELETE | `/api/v1/books/{id}` | Delete a book by ID     |

### Example JSON Request Body for Book Creation

```json
{
  "title": "Spring in Action",
  "author": "Craig Walls",
  "genre": "Technology",
  "price": 45.99,
  "publicationYear": 2022
}
```

## Contact and Social Links

For more projects, tutorials, and resources, connect with us:

- **GitHub**: [Starling Diaz](https://github.com/NSTLRD)
- **Website**: [Mentorly Blog](https://mentorly.blog/)
- **LinkedIn**: [LinkedIn](https://www.linkedin.com/in/starling-diaz-908225181/)
- **Mentorly Academy**: [Mentorly Academy](https://www.mentor-ly.com/)
- **YouTube**: [Mentorly YouTube](https://www.youtube.com/@Mentorly-e3b)

Feel free to contribute to the repository, share your feedback, or reach out if you have any questions.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```

This **README** provides a full overview of the project, installation steps, endpoint details, and links to contact and social media, making it user-friendly and easy to follow for contributors and developers alike. Let me know if any adjustments are needed!