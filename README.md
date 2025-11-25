Student Management System — Java GUI + JDBC
Team Name: CodeNest
Team Members:

Adarsh

Divyank Kumar

📌 Project Overview

Student Management System is a desktop-based Java application built using Java Swing (GUI) and JDBC for database connectivity.
It allows institutes to manage student records efficiently with a simple, user-friendly interface.

This project demonstrates:

Core Java concepts

OOP principles

GUI development

JDBC-based CRUD operations

Layered architecture

🎯 Features
✅ Login System

Default credentials: admin/admin

Simple authentication for accessing the dashboard

✅ Add Student

Add new students with Name, Age, Course, Email

✅ View Students

Table view of all stored students

Auto-refresh option

✅ Delete Student

Remove student records directly from the table

⏳ (Optional for future)

Update Student

🛠 Tech Stack
Component	Technology
Programming Language	Java 8+
GUI Framework	Swing
Database	MySQL
Connectivity	JDBC
Build/Run	Manual or any IDE
📁 Project Structure
StudentManagementSystem/
 ├── src/
 │   ├── db/DBConnection.java
 │   ├── model/Student.java
 │   ├── dao/StudentDAO.java
 │   ├── ui/
 │   │    ├── LoginFrame.java
 │   │    ├── MainDashboard.java
 │   │    ├── AddStudentFrame.java
 │   │    ├── ViewStudentFrame.java
 │   │    └── UpdateStudentFrame.java
 │   └── Main.java
 ├── resources/
 │   ├── schema.sql
 │   └── app.properties
 ├── lib/
 │   └── (Place JDBC driver here)
 ├── screenshots/
 │   └── (Project screenshots)
 ├── .gitignore
 └── README.md

🗄️ Database Setup

Run this SQL script in your MySQL server:

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

▶️ How to Run the Project

Install Java 8 or above

Install MySQL

Import the database using schema.sql

Update DBConnection.java with your DB username & password

Add your mysql-connector-java.jar into the lib/ folder

Run Main.java

From command line or

Using IntelliJ / Eclipse / NetBeans

Login Credentials:

Username: admin  
Password: admin  

🖼️ Screenshots

Place your screenshots inside the /screenshots folder.
Examples to include:

Login screen

Dashboard

Add Student

View Students

(Your college evaluates visuals — include at least 3 images.)

🎓 Academic Purpose

This project is created as part of an academic assignment for demonstrating:

Java OOP

GUI development

JDBC CRUD operations

Code quality and structured design

👨‍💻 Developed By — Team CodeNest

Adarsh

Divyank Kumar
