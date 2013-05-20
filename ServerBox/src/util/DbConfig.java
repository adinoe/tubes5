/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agungdlgs
 */
public class DbConfig {
    private Connection connect = null;
    private Statement statement = null;
    private final String dbname = "lisio";
    private final String mysqluser = "root";
    private final String mysqlpass = "";

    public void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.connect = DriverManager.getConnection("jdbc:mysql://localhost/" + this.dbname , this.mysqluser , this.mysqlpass);
        this.statement = connect.createStatement();
    }

    public Connection getConnect(){
        return this.connect;
    }
    
    public Statement getStatement(){
        return this.statement;
    }

    public void closeConnection() throws SQLException {
        this.connect.close();
        this.statement = null;
    }
    
    public static void main(String[] args){
        try {
            DbConfig d = new DbConfig();
            d.createConnection();
            System.out.println("Connection Success");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found : "+ex.getMessage());
            Logger.getLogger(DbConfig.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("SQL Error : "+ex.getMessage());
            Logger.getLogger(DbConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
