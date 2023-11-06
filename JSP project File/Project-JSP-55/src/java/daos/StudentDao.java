/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;
import util.DbCon;

/**
 *
 * @author USER
 */
public class StudentDao {

    DbCon con;

    public StudentDao(DbCon con) {
        this.con = con;
    }

    public static int saveStudent(Student s) throws ClassNotFoundException {

        int status = 0;

        String sql = "insert into student(firstName, lastName) values(?,?) ";

        try {
            PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

            ps.setString(1, s.getFirstName());
            ps.setString(2, s.getLastName());

            status = ps.executeUpdate();
            ps.close();
            DbCon.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static List<Student> getAllStudent() throws ClassNotFoundException, SQLException {

        List<Student> studentList = new ArrayList<Student>();

        String sql = "select * from student";

        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Student s = new Student(
                    rs.getInt("id"),
                    rs.getString("firstName"),
                    rs.getString("lastName")
            );

            studentList.add(s);
        }

        rs.close();
        ps.close();
        DbCon.getCon().close();

        return studentList;
    }

    public static Student getStudentById(int id) throws ClassNotFoundException, SQLException {

        Student s = new Student();

        String sql = "select * from student where id = ? ";

        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            s.setId(rs.getInt("id"));
            s.setFirstName(rs.getString("firstName"));
            s.setFirstName(rs.getString("lastName"));
        }

        rs.close();
        ps.close();
        DbCon.getCon().close();

        return s;
    }

}
