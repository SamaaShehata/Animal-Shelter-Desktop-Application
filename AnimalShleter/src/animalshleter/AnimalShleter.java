

package animalshleter;

import static animalshleter.login2.ID;//ID from login frame
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimalShleter {

    
    Connection con;
    public static void main(String[] args) {
        AnimalShleter project = new AnimalShleter();
        project.createConnection();
        
               
        new login2().setVisible(true);
    }
    
    void createConnection()
    {
         String url = "jdbc:mysql://127.0.0.1:3306/animalsshelter";
        try {
            con = DriverManager.getConnection(url, "root", "4434544345");
        } catch (SQLException ex) {
            Logger.getLogger(AnimalShleter.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
