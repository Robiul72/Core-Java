/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import model.Student;
import util.DbCon;

/**
 *
 * @author USER
 */
public class StudentDao {

    public static int saveStudent(Student s) throws ClassNotFoundException, SQLException {

        int status = 0;
        String sql = "insert into registration (firstName, lastName, fatherFirstName, fatherLastName, motherFirstName, motheerLastName, gender, dateOfBirth, nid, contact, email, entryDate, address) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

        ps.setString(1, s.getFirstName());
        ps.setString(2, s.getLastName());
        ps.setString(3, s.getFatherFirstName());
        ps.setString(4, s.getFatherLastName());
        ps.setString(5, s.getMotherFirstName());
        ps.setString(6, s.getMotherLastName());
        ps.setString(7, s.getGender());
        ps.setString(8, s.getDateOfBirth());
        ps.setString(9, s.getNid());
        ps.setString(10, s.getContact());
        ps.setString(11, s.getEmail());
        ps.setString(12, s.getEntrtDate());
        ps.setString(13, s.getAddress());

        status = ps.executeUpdate();
        ps.close();
        DbCon.getCon().close();

        System.out.println(status);

        return status;
    }

    public static List<Student> getAllStudent() throws ClassNotFoundException, SQLException {

        List<Student> studentList = new ArrayList<Student>();
        String sql = "select * from registration";
        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Student s = new Student(
                    rs.getInt("id"),
                    rs.getString("firstName"),
                    rs.getString("lastName"),
                    rs.getString("fatherFirstName"),
                    rs.getString("fatherLastName"),
                    rs.getString("motherFirstName"),
                    rs.getString("motherLastName"),
                    rs.getString("gender"),
                    rs.getString("dateOfBirth"),
                    rs.getString("nid"),
                    rs.getString("contact"),
                    rs.getString("email"),
                    rs.getString("entryDate"),
                    rs.getString("address")
            );
            studentList.add(s);
        }
        ps.close();
        DbCon.getCon().close();
        return studentList;

    }
}
