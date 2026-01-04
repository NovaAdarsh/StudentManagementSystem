package ui;

import javax.swing.*;
import dao.StudentDAO;
import model.Student;

public class AddStudentFrame extends JFrame {

    public AddStudentFrame() {
        setTitle("Add Student");
        setSize(350, 320);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel nameL = new JLabel("Name:");
        nameL.setBounds(20, 20, 80, 25);
        add(nameL);

        JTextField nameF = new JTextField();
        nameF.setBounds(100, 20, 200, 25);
        add(nameF);

        JLabel ageL = new JLabel("Age:");
        ageL.setBounds(20, 60, 80, 25);
        add(ageL);

        JTextField ageF = new JTextField();
        ageF.setBounds(100, 60, 200, 25);
        add(ageF);

        JLabel courseL = new JLabel("Course:");
        courseL.setBounds(20, 100, 80, 25);
        add(courseL);

        JTextField courseF = new JTextField();
        courseF.setBounds(100, 100, 200, 25);
        add(courseF);

        JLabel emailL = new JLabel("Email:");
        emailL.setBounds(20, 140, 80, 25);
        add(emailL);

        JTextField emailF = new JTextField();
        emailF.setBounds(100, 140, 200, 25);
        add(emailF);

        JButton btnAdd = new JButton("Add Student");
        btnAdd.setBounds(100, 200, 140, 30);
        add(btnAdd);

        btnAdd.addActionListener(e -> {
            try {
                String name = nameF.getText().trim();
                String course = courseF.getText().trim();
                String email = emailF.getText().trim();
                int age = Integer.parseInt(ageF.getText().trim());

                // ✅ Validation
                if (name.isEmpty() || course.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "All fields are required");
                    return;
                }

                if (age <= 0) {
                    JOptionPane.showMessageDialog(this, "Age must be greater than 0");
                    return;
                }

                if (!isValidEmail(email)) {
                    JOptionPane.showMessageDialog(this, "Invalid email format");
                    return;
                }

                Student student = new Student(name, age, course, email);
                StudentDAO dao = new StudentDAO();

                if (dao.addStudent(student)) {
                    JOptionPane.showMessageDialog(this, "Student added successfully");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add student");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Age must be a number");
            }
        });

        setVisible(true);
    }

    // ✅ EMAIL VALIDATION METHOD
    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
