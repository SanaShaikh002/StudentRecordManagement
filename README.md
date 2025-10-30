🎓 Student Record Management System

A simple Java + PostgreSQL project using JDBC that allows users to manage student records — including adding, viewing, updating, and deleting student information.
This project demonstrates basic CRUD operations and database connectivity using JDBC (Java Database Connectivity) — perfect for beginners!

🚀 Features

➕ Add new students

👀 View all student records

✏️ Update existing student details

❌ Delete a student record

💾 Connects to PostgreSQL using JDBC

🧰 Technologies Used

Component	---Technology

1.Programming Language---	Java
2.Database----	PostgreSQL
3.Connector	JDBC Driver---- (postgresql-42.7.8.jar)
4.IDE / Editor	----VS Code or Command Prompt
5.Version Control-----	Git & GitHub

🗂️ Project Structure
StudentRecordManagement/
│
├── src/
│   ├── DBConnection.java
│   └── StudentManagement.java
│
├── lib/
│   └── postgresql-42.7.8.jar
│
├── bin/                # Compiled .class files (auto-generated)
│
└── .gitignore

⚙️ How to Run the Project
1️⃣ Setup Database

Open PostgreSQL and create a database:

CREATE DATABASE studentdb;


Create the table:

CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);

2️⃣ Configure Database Connection

Edit your DBConnection.java file:

String url = "jdbc:postgresql://localhost:5432/studentdb";
String user = "your_postgres_username";
String password = "your_postgres_password";

3️⃣ Compile and Run
# Compile
javac -cp ".;lib\postgresql-42.7.8.jar" -d bin src\*.java

# Run
java -cp "bin;lib\postgresql-42.7.8.jar" StudentManagement

💡 Example Output
===== Student Record Management =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter name: Sana
Enter age: 20
Enter course: BCA
✅ Student added successfully!

🌟 Author

Sana Shaikh
📧 Email: sanashaikh2aug@gmail.com

💻 GitHub: SanaShaikh002

🏁 Future Enhancements

Add GUI using JavaFX or Swing

Add input validation

Add login authentication system

Integrate search functionality

🪄 License

This project is open-source and available under the MIT License
.
