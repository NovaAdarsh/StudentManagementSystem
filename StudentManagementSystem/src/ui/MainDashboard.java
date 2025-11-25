package ui;
import javax.swing.*;
import java.awt.event.*;
public class MainDashboard extends JFrame {
    public MainDashboard(){
        setTitle("Student Management - Dashboard");
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel heading = new JLabel("Student Management System");
        heading.setBounds(140,10,250,30);
        add(heading);
        JButton addBtn = new JButton("Add Student");
        addBtn.setBounds(50,80,150,40);
        add(addBtn);
        JButton viewBtn = new JButton("View Students");
        viewBtn.setBounds(300,80,150,40);
        add(viewBtn);
        addBtn.addActionListener(e -> new AddStudentFrame().setVisible(true));
        viewBtn.addActionListener(e -> new ViewStudentFrame().setVisible(true));
    }
}
