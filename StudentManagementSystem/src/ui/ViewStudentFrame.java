package ui;
import javax.swing.*;
import javax.swing.table.*;
import dao.StudentDAO;
import model.Student;
import java.util.List;
import java.awt.event.*;
public class ViewStudentFrame extends JFrame {
    JTable table;
    DefaultTableModel model;
    public ViewStudentFrame(){
        setTitle("View Students");
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(null);
        model = new DefaultTableModel(new String[]{"ID","Name","Age","Course","Email"},0);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(10,10,560,300);
        add(sp);
        JButton refresh = new JButton("Refresh");
        refresh.setBounds(200,320,100,30);
        add(refresh);
        JButton delete = new JButton("Delete");
        delete.setBounds(320,320,100,30);
        add(delete);
        refresh.addActionListener(e -> loadData());
        delete.addActionListener(e -> {
            int row = table.getSelectedRow();
            if(row==-1){ JOptionPane.showMessageDialog(this,"Select a row"); return; }
            int id = (int)model.getValueAt(row,0);
            dao.StudentDAO dao = new dao.StudentDAO();
            boolean ok = dao.deleteStudent(id);
            JOptionPane.showMessageDialog(this, ok ? "Deleted" : "Delete failed");
            loadData();
        });
        loadData();
    }
    private void loadData(){
        model.setRowCount(0);
        StudentDAO dao = new StudentDAO();
        List<Student> list = dao.getAllStudents();
        for(Student s: list){
            model.addRow(new Object[]{s.getId(), s.getName(), s.getAge(), s.getCourse(), s.getEmail()});
        }
    }
}
