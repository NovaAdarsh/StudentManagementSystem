# Student Management System (Java Swing + JDBC)
## Description
Simple Student Management desktop application built using Java Swing for UI and JDBC for database connectivity.
## Features
- Login (demo credentials: admin/admin)
- Add Student (Name, Age, Course, Email)
- View Students
- Delete Student
## Tech Stack
- Java 8+
- Swing (GUI)
- MySQL (or any JDBC-compatible DB)
## Setup
1. Create the database:
   - Run `resources/schema.sql` in your MySQL client.
2. Update DB credentials in `src/db/DBConnection.java`.
3. Add MySQL JDBC driver to classpath (put jar into `lib/`).
4. Compile & run:
   ```
   javac -d out -sourcepath src src/Main.java
   java -cp out:lib/mysql-connector-java.jar Main
   ```
## Files to upload to GitHub
- `src/` (all java source files)
- `resources/schema.sql`
- `README.md`
- `screenshots/` (add screenshots)
- `.gitignore`
## Notes
This is a starter project. You can improve by adding validation, better UI, and update functionality.
