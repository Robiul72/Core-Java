package advancejava;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Form;
import view.StudentRegForm;

public class AdvanceJava {

    public static void main(String[] args) {

        StudentRegForm f =new StudentRegForm();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        
        Form java = new Form();

        String sql = "insert into students (name, age,phone) values (?,?,?)";

        try {
            PreparedStatement ps = java.getCon().prepareStatement(sql);
            ps.setString(1, "Robiul");
            ps.setInt(2, 52);
            ps.setString(3, "01911661138");
            ps.executeUpdate();
            System.out.println(" Ok ");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
            
          

          



    }

}
