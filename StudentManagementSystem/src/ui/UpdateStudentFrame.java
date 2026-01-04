package ui;

import javax.swing.*;
import dao.StudentDAO;
import model.Student;

public class UpdateStudentFrame extends JFrame {

    private JTextField idF, nameF, ageF, courseF, emailF;

    public UpdateStudentFrame() {
        setTitle("Update Student");
        setSize(350, 350);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel idL = new JLabel("Student ID:");
        idL.setBounds(20, 20, 100, 25);
        add(idL);

        idF = new JTextField();
        idF.setBounds(130, 20, 180, 25);
        add(idF);

        JLabel nameL = new JLabel("Name:");
        nameL.setBounds(20, 60, 100, 25);
        add(nameL);

        nameF = new JTextField();
        nameF.setBounds(130, 60, 180, 25);
        add(nameF);

        JLabel ageL = new JLabel("Age:");
        ageL.setBounds(20, 100, 100, 25);
        add(ageL);

        ageF = new JTextField();
        ageF.setBounds(130, 100, 180, 25);
        add(ageF);

        JLabel courseL = new JLabel("Course:");
        courseL.setBounds(20, 140, 100, 25);
        add(courseL);

        courseF = new JTextField();
        courseF.setBounds(130, 140, 180, 25);
        add(courseF);

        JLabel emailL = new JLabel("Email:");
        emailL.setBounds(20, 180, 100, 25);
        add(emailL);

        emailF = new JTextField();
        emailF.setBounds(130, 180, 180, 25);
        add(emailF);

        JButton btnUpdate = new JButton("Update Student");
        btnUpdate.setBounds(110, 230, 140, 30);
        add(btnUpdate);

        btnUpdate.addActionListener(e -> updateStudent());

        setVisible(true);
    }

    private void updateStudent() {
        try {
            int id = Integer.parseInt(idF.getText().trim());
            String name = nameF.getText().trim();
            int age = Integer.parseInt(ageF.getText().trim());
            String course = courseF.getText().trim();
            String email = emailF.getText().trim();

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
                JOptionPane.showMessageDialog(this, "Student ID not found");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID and Age must be numbers");
        }
    }
}
