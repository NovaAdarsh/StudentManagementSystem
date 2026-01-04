# Student Management System

## Team Name
CodeNest

## Team Members
- Adarsh  
- Divyank Kumar  

## Description
Student Management System is a desktop-based Java application developed using Java Swing and JDBC with MySQL.  
It allows users to manage student records through a simple graphical interface while demonstrating core Java and OOP concepts.

## Features
- Login Authentication (admin / admin)
- Add Student
- View Students
- Update Student
- Delete Student
- Input Validation
- Error Handling

## Technologies Used
- Java
- Swing (GUI)
- MySQL
- JDBC

## Project Structure
src/
├── db/DBConnection.java
├── dao/StudentDAO.java
├── model/Student.java
├── ui/
│ ├── LoginFrame.java
│ ├── MainDashboard.java
│ ├── AddStudentFrame.java
│ ├── ViewStudentFrame.java
│ └── UpdateStudentFrame.java
└── Main.java

## Database Setup
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100),
age INT,
course VARCHAR(100),
email VARCHAR(100)
);

## How to Run
1. Install JDK and MySQL
2. Run the database script
3. Update database credentials in DBConnection.java
4. Add MySQL JDBC driver to project
5. Run Main.java

## Screenshots
Screenshots of Login, Dashboard, Add Student, View Students, and Update Student are included in the screenshots folder.

## Purpose
This project is developed for academic and hackathon submission to demonstrate Java GUI and JDBC-based CRUD operations.
