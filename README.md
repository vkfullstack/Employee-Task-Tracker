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

### 🔵 Swagger UI

![Swagger UI 1](https://github.com/vkfullstack/Employee-Task-Tracker/blob/1dfc433b2d10347a2cedf91ec6e9dbf796eda0ac/Screenshot%202026-05-27%20184852.png?raw=true)

![Swagger UI 2](https://github.com/vkfullstack/Employee-Task-Tracker/blob/1dfc433b2d10347a2cedf91ec6e9dbf796eda0ac/Screenshot%202026-05-27%20184919.png?raw=true)

---

### 🟢 Login API

![Login 1](https://github.com/vkfullstack/Employee-Task-Tracker/blob/1dfc433b2d10347a2cedf91ec6e9dbf796eda0ac/Screenshot%202026-05-27%20184958.png?raw=true)

![Login 2](https://github.com/vkfullstack/Employee-Task-Tracker/blob/1dfc433b2d10347a2cedf91ec6e9dbf796eda0ac/Screenshot%202026-05-27%20185023.png?raw=true)

---

### 🟠 Register API

![Register 1](https://github.com/vkfullstack/Employee-Task-Tracker/blob/1dfc433b2d10347a2cedf91ec6e9dbf796eda0ac/Screenshot%202026-05-27%20185117.png?raw=true)

![Register 2](https://github.com/vkfullstack/Employee-Task-Tracker/blob/1dfc433b2d10347a2cedf91ec6e9dbf796eda0ac/Screenshot%202026-05-27%20185129.png?raw=true)

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
