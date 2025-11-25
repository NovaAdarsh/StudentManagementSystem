package db;
import java.sql.*;
public class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    static final String USERNAME = "root";
    static final String PASSWORD = "root";
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
