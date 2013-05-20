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
import util.DbConfig;
        
/**
 *
 * @author Agungdlgs
 */
public class Login {
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
    
     public static boolean isUserExist(String username,String password)
            throws ClassNotFoundException,SQLException,NoSuchAlgorithmException
    {
        openDatabase();
        String query = "SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'";
        ResultSet rs = db.getStatement().executeQuery(query);
        int i = 0;
        while (rs.next())
        {
            i++;
        }
        closeDatabase();
        if (i == 1)
            return true;
        else
            return false;
    }
}
