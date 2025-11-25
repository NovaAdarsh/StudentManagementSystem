# Student Management System — Java GUI + JDBC

### **Team Name:** CodeNest  
### **Team Members:**  
- **Adarsh**  
- **Divyank Kumar**

---

## 📌 Project Overview

**Student Management System** is a desktop-based Java application built using **Java Swing (GUI)** and **JDBC** for database connectivity.  
It allows institutes to manage student records efficiently with a simple, user-friendly interface.

This project demonstrates:
- Core Java concepts  
- OOP principles  
- GUI development  
- JDBC-based CRUD operations  
- Layered architecture  

---

## 🎯 Features

### ✅ Login System
- Default credentials: **admin/admin**
- Authenticates user to access dashboard

### ✅ Add Student
- Add new student with Name, Age, Course, Email

### ✅ View Students
- Displays all students in a table
- Auto-refresh supported

### ✅ Delete Student
- Delete student entry from table instantly

### ⏳ (Optional for future)
- Update Student functionality

---

## 🛠 Tech Stack

| Component | Technology |
|----------|------------|
| Programming Language | Java 8+ |
| GUI Framework | Swing |
| Database | MySQL |
| Connectivity | JDBC |
| Build/Run | Any IDE or Command-line |

---

## 📁 Project Structure

StudentManagementSystem/
├── src/
│ ├── db/DBConnection.java
│ ├── model/Student.java
│ ├── dao/StudentDAO.java
│ ├── ui/
│ │ ├── LoginFrame.java
│ │ ├── MainDashboard.java
│ │ ├── AddStudentFrame.java
│ │ ├── ViewStudentFrame.java
│ │ └── UpdateStudentFrame.java
│ └── Main.java
├── resources/
│ ├── schema.sql
│ └── app.properties
├── lib/
│ └── (Place JDBC driver jar here)
├── screenshots/
│ └── (Add UI screenshots here)
├── .gitignore
└── README.md

yaml
Copy code

---

## 🗄️ Database Setup

Run the following SQL script in MySQL:

CREATE DATABASE IF NOT EXISTS studentdb;
USE studentdb;

CREATE TABLE IF NOT EXISTS students (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100),
age INT,
course VARCHAR(100),
email VARCHAR(100)
);

INSERT INTO students(name, age, course, email)
VALUES ('Demo User', 20, 'Java', 'demo@gmail.com');

markdown
Copy code

---

## ▶️ How to Run the Project

1. Install Java (JDK 8 or above)  
2. Install MySQL  
3. Run `resources/schema.sql` to create database  
4. Update `DBConnection.java` with your MySQL username/password  
5. Add `mysql-connector-java.jar` to `lib/`  
6. Compile and run:  
   - Using IDE (IntelliJ/Eclipse/NetBeans), OR  
   - Via terminal:  
     ```
     javac -d out -sourcepath src src/Main.java
     java -cp out;lib/mysql-connector-java.jar Main
     ```

**Login Credentials:**  
Username: admin
Password: admin

yaml
Copy code

---

## 🖼 Screenshots

Add the following screenshots inside the `/screenshots` folder:
- login.png  
- dashboard.png  
- add_student.png  
- view_students.png  

These visuals improve your marks.

---

## 🎓 Academic Purpose

This project is created for academic submission to demonstrate:
- Java OOP  
- GUI development  
- JDBC database operations  
- Proper project structure and documentation  

---

## 👨‍💻 Developed By — *Team CodeNest*

- **Adarsh**  
- **Divyank Kumar**
