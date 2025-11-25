package ui;
import javax.swing.*;
import dao.StudentDAO;
import model.Student;
public class AddStudentFrame extends JFrame {
    public AddStudentFrame(){
        setTitle("Add Student");
        setSize(350,320);
        setLocationRelativeTo(null);
        setLayout(null);
        JLabel nameL = new JLabel("Name:");
        nameL.setBounds(20,20,80,25);
        add(nameL);
        JTextField nameF = new JTextField();
        nameF.setBounds(100,20,200,25);
        add(nameF);
        JLabel ageL = new JLabel("Age:");
        ageL.setBounds(20,60,80,25);
        add(ageL);
        JTextField ageF = new JTextField();
        ageF.setBounds(100,60,200,25);
        add(ageF);
        JLabel courseL = new JLabel("Course:");
        courseL.setBounds(20,100,80,25);
        add(courseL);
        JTextField courseF = new JTextField();
        courseF.setBounds(100,100,200,25);
        add(courseF);
        JLabel emailL = new JLabel("Email:");
        emailL.setBounds(20,140,80,25);
        add(emailL);
        JTextField emailF = new JTextField();
        emailF.setBounds(100,140,200,25);
        add(emailF);
        JButton save = new JButton("Save");
        save.setBounds(100,200,90,30);
        add(save);
        JButton close = new JButton("Close");
        close.setBounds(210,200,90,30);
        add(close);
        save.addActionListener(e -> {
            try {
                String name = nameF.getText();
                int age = Integer.parseInt(ageF.getText());
                String course = courseF.getText();
                String email = emailF.getText();
                Student s = new Student(name, age, course, email);
                StudentDAO dao = new StudentDAO();
                boolean ok = dao.addStudent(s);
                JOptionPane.showMessageDialog(this, ok ? "Saved successfully" : "Error saving");
            } catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Please enter valid data.");
            }
        });
        close.addActionListener(e -> dispose());
    }
}
