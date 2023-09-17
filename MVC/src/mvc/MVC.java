package mvc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import DataBased.Dbcon;
import view.Student;

public class MVC {
    
    public static void main(String[] args) {
        
//        Student form = new Student();
//        form.setLocationRelativeTo(null);
//        form.setVisible(true);


        Dbcon dbcon = new Dbcon();
        String sql = "insert into students(name,age) values(?,?)";
        
        try {
            PreparedStatement ps = dbcon.getCon().prepareStatement(sql);
            ps.setString(1, "Halim");
            ps.setInt(2, 25);
            
            
            
            ps.executeUpdate();
            dbcon.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
