package dao;
import db.DBConnection;
import model.Student;
import java.sql.*;
import java.util.*;
public class StudentDAO {
    public boolean addStudent(Student s) {
        String sql = "INSERT INTO students(name, age, course, email) VALUES (?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getCourse());
            ps.setString(4, s.getEmail());
            return ps.executeUpdate() > 0;
        } catch (Exception e) { e.printStackTrace(); }
        return false;
    }
    public List<Student> getAllStudents(){
        List<Student> list = new ArrayList<>();
        String sql = "SELECT id,name,age,course,email FROM students";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while(rs.next()){
                list.add(new Student(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
            }
        } catch(Exception e){ e.printStackTrace(); }
        return list;
    }
    public boolean updateStudent(Student s){
        String sql = "UPDATE students SET name=?, age=?, course=?, email=? WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getCourse());
            ps.setString(4, s.getEmail());
            ps.setInt(5, s.getId());
            return ps.executeUpdate() > 0;
        } catch(Exception e){ e.printStackTrace(); }
        return false;
    }
    public boolean deleteStudent(int id){
        String sql = "DELETE FROM students WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch(Exception e){ e.printStackTrace(); }
        return false;
    }
    public boolean updateStudent(Student student) {
    String query = "UPDATE students SET name=?, age=?, course=?, email=? WHERE id=?";
    try (Connection con = DBConnection.getConnection();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setString(1, student.getName());
        pst.setInt(2, student.getAge());
        pst.setString(3, student.getCourse());
        pst.setString(4, student.getEmail());
        pst.setInt(5, student.getId());

        return pst.executeUpdate() > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

}
