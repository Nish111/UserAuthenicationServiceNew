# UserAuthenticationService

## Overview
The **UserAuthenticationService** ensures secure user authentication and authorization for the eCommerce platform. It provides JWT-based authentication for users and services.

---

## Features
- JWT-based token generation and validation
- Role-based access control
- Integration with Redis for token storage

---

## Technologies Used
- **Java 8**
- **Spring Boot**
- **JWT**
- **Redis**

---

## API Endpoints
- **POST** `/api/v1/auth/login`: Authenticate and generate a token.
- **POST** `/api/v1/auth/logout`: Revoke a token.
- **GET** `/api/v1/auth/validate`: Validate a token.

---

