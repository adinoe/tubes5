/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entity.Task;
import util.DbConfig;
/**
 *
 * @author Agungdlgs
 */
public class ListTask {
     public static DbConfig db;
    
    public static void openDatabase() throws ClassNotFoundException, SQLException
    {
        db = new DbConfig();
        db.createConnection();
    }
    
    public static void closeDatabase() throws SQLException
    {
        db.closeConnection();
    }
    
     public static int getIdUser(String username) throws ClassNotFoundException, SQLException
    {
        int user=0;
        openDatabase();
        String query = "SELECT id_user FROM user WHERE username='"+username+"'";
        ResultSet rs = db.getStatement().executeQuery(query);
        while(rs.next())
        {
            user = rs.getInt("id_user");
        }
        closeDatabase();
      //  System.out.println("id_user ="+user);
        return user;
    }
    
}
