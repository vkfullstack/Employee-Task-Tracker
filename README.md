# 📌 Employee Task Tracker System

A Spring Boot backend project for managing employees and tasks with secure JWT authentication, role-based access, and REST APIs.

---

## 🚀 Features

- User Registration & Login (JWT Authentication)
- Role-based access control (Admin / User)
- Create, Read, Update, Delete Tasks (CRUD)
- Assign tasks to users
- Task status tracking (PENDING, IN_PROGRESS, COMPLETED)
- Secure REST APIs using Spring Security
- Swagger OpenAPI documentation for APIs

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- MySQL
- Swagger OpenAPI
- Maven

---

## 📁 Project Structure

src/
└── main/
    ├── java/
    │   └── com/tracker/
    │       ├── controller/
    │       ├── service/
    │       ├── repository/
    │       ├── model/
    │       ├── dto/
    │       ├── security/
    │       └── config/
    └── resources/

---

## 🔐 Authentication Flow

1. User registers account
2. User logs in with credentials
3. JWT token is generated
4. Token is used to access secured APIs

---

## 📌 API Endpoints

### Auth APIs
- POST /api/register → Register new user  
- POST /api/login → Login and get JWT token  

### Task APIs
- POST /api/tasks → Create task  
- GET /api/tasks → Get all tasks  
- GET /api/tasks/{id} → Get task by ID  
- PUT /api/tasks/{id} → Update task  
- DELETE /api/tasks/{id} → Delete task  

---

## 📸 Screenshots

Create a folder in your project root:

screenshots/

Add images like:
- swagger.png
- login.png
- tasks.png

Example usage in README:

![Swagger UI](screenshots/swagger.png)
![Login API](screenshots/login.png)
![Tasks](screenshots/tasks.png)

---

## ⚙️ How to Run Project

# Clone repository
git clone https://github.com/vkfullstack/Employee-Task-Tracker.git

# Move into project folder
cd Employee-Task-Tracker

# Run Spring Boot application
mvn spring-boot:run

---

## 🧪 Testing APIs

Use:
- Swagger UI → http://localhost:8080/swagger-ui.html
- Postman

---

## 📌 Requirements

- Java 17+
- Maven
- MySQL running
- IDE (IntelliJ / Eclipse / VS Code)

---

## 👨‍💻 Author

Name: Vijay Khetre  
GitHub: https://github.com/vkfullstack  

---

## ⭐ Future Improvements

- Frontend (React)
- Email notifications
- Advanced role permissions
- Dashboard analytics
- Cloud deployment (AWS / Render)
