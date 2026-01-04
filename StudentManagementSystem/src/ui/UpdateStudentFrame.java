package ui;

import javax.swing.*;
import dao.StudentDAO;
import model.Student;

public class UpdateStudentFrame extends JFrame {

    private JTextField txtId, txtName, txtAge, txtCourse, txtEmail;
    private JButton btnUpdate;

    public UpdateStudentFrame() {
        setTitle("Update Student");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblId = new JLabel("ID:");
        JLabel lblName = new JLabel("Name:");
        JLabel lblAge = new JLabel("Age:");
        JLabel lblCourse = new JLabel("Course:");
        JLabel lblEmail = new JLabel("Email:");

        txtId = new JTextField();
        txtName = new JTextField();
        txtAge = new JTextField();
        txtCourse = new JTextField();
        txtEmail = new JTextField();

        btnUpdate = new JButton("Update");

        lblId.setBounds(20, 20, 80, 25);
        txtId.setBounds(120, 20, 180, 25);

        lblName.setBounds(20, 55, 80, 25);
        txtName.setBounds(120, 55, 180, 25);

        lblAge.setBounds(20, 90, 80, 25);
        txtAge.setBounds(120, 90, 180, 25);

        lblCourse.setBounds(20, 125, 80, 25);
        txtCourse.setBounds(120, 125, 180, 25);

        lblEmail.setBounds(20, 160, 80, 25);
        txtEmail.setBounds(120, 160, 180, 25);

        btnUpdate.setBounds(120, 200, 100, 30);

        add(lblId); add(txtId);
        add(lblName); add(txtName);
        add(lblAge); add(txtAge);
        add(lblCourse); add(txtCourse);
        add(lblEmail); add(txtEmail);
        add(btnUpdate);

        btnUpdate.addActionListener(e -> updateStudent());

        setVisible(true);
    }

    private void updateStudent() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            String name = txtName.getText().trim();
            int age = Integer.parseInt(txtAge.getText().trim());
            String course = txtCourse.getText().trim();
            String email = txtEmail.getText().trim();

            if (name.isEmpty() || course.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required");
                return;
            }

            Student student = new Student(id, name, age, course, email);
            StudentDAO dao = new StudentDAO();

            if (dao.updateStudent(student)) {
                JOptionPane.showMessageDialog(this, "Student updated successfully");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Update failed");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID and Age must be numbers");
        }
    }
}
