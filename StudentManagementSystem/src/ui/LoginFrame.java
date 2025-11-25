package ui;
import javax.swing.*;
import java.awt.event.*;
public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Login - Student Management");
        setSize(350,180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel userL = new JLabel("Username:");
        userL.setBounds(20,20,80,25);
        add(userL);
        JTextField userF = new JTextField();
        userF.setBounds(100,20,200,25);
        add(userF);
        JLabel passL = new JLabel("Password:");
        passL.setBounds(20,55,80,25);
        add(passL);
        JPasswordField passF = new JPasswordField();
        passF.setBounds(100,55,200,25);
        add(passF);
        JButton login = new JButton("Login");
        login.setBounds(100,95,90,25);
        add(login);
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(210,95,90,25);
        add(cancel);
        login.addActionListener(e -> {
            String user = userF.getText();
            String pass = new String(passF.getPassword());
            // simple demo check
            if("admin".equals(user) && "admin".equals(pass)){
                dispose();
                new MainDashboard().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials. Use admin/admin for demo.");
            }
        });
        cancel.addActionListener(e -> System.exit(0));
    }
}
