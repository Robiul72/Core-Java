
package advencjava;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbCoreJava;

public class AdvencJava {

    public static void main(String[] args) {
      
        DbCoreJava java = new DbCoreJava();
             
        String sql = "insert into students (name, age,phone) values (?,?,?)";
        
        try {
            PreparedStatement ps=java.getCon().prepareStatement(sql);
            
            ps.setString(1, "Robiul");
            ps.setInt   (2, 22);
            ps.setString(3, "01911661138");
            
            ps.executeUpdate(); 
            
            System.out.println("OK");
            
        } catch (SQLException ex) {
            Logger.getLogger(AdvencJava.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
