/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.AssigneeTask;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entity.Task;
import Entity.User;
import com.mysql.jdbc.Statement;
import java.util.ArrayList;
import util.DbConfig;
/**
 *
 * @author Agungdlgs
 */
public class ListTask {
     public static DbConfig db;
    // membuka koneksi ke database
    public static void openDatabase() throws ClassNotFoundException, SQLException
    {
        db = new DbConfig();
        db.createConnection();
    }
    // menutup koneksi ke database
    public static void closeDatabase() throws SQLException
    {
        db.closeConnection();
    }
    // mendapatkan id user dari username
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
     // mendapatkan username dari id user
     public static String getUsernameUser(int id_user) throws ClassNotFoundException, SQLException
     {
         String temp = null;
         openDatabase();
         String query = "SELECT username FROM user WHERE id_user='"+id_user+"'";
         ResultSet rs = db.getStatement().executeQuery(query);
        while(rs.next())
        {
            temp = rs.getString("username");
        }
        closeDatabase();
        return temp;
     }
     // mendapatkan semua task yang dimiliki oleh user tertentu
     public static ArrayList<Task> getTaskAll(int id_user) throws ClassNotFoundException, SQLException
    {
        ArrayList<Task> creator = getTaskCreator(id_user);
        ArrayList<Task> assignee = getTaskAssignee(id_user);
        ArrayList<Task> temp = new ArrayList<Task>();
        temp.addAll(creator);
        temp.addAll(assignee);
        openDatabase();
        return temp;
    }
     // mendapatkan kumpulan task dimana user tersebut berperan sebagai pembuat task
    public static ArrayList<Task> getTaskCreator(int id_user) throws ClassNotFoundException, SQLException
    {
        openDatabase();
        ArrayList<Task> temp = new ArrayList<Task>();
        String query = "SELECT * FROM task WHERE id_user="+id_user;
        ResultSet rs = db.getStatement().executeQuery(query);
        while(rs.next())
        {
            Task cmt=null;
            cmt=new Task(rs.getInt("id_task"), id_user,rs.getString("title"),rs.getString("deadline"),rs.getString("description"),rs.getString("tags"),rs.getString("status"),rs.getInt("id_category"));
            temp.add(cmt);
            System.out.println("creator = "+cmt.getTitle());
        }
        closeDatabase();
        return temp;
    }
    // mendapatkan kumpulan task dimana user tersebut berperan sebagai assigneenya
    public static ArrayList<Task> getTaskAssignee(int id_user) throws ClassNotFoundException, SQLException
    {
        ArrayList<AssigneeTask> idTask = getIdAssignee(id_user);
        ArrayList<Task> temp = new ArrayList<Task>();
        openDatabase();
        
        ResultSet rs = null;
        String query = "";
        int tempIdTask  = 0;
        int i = 0;
        while (i<(idTask.size()))
        {
            tempIdTask = idTask.get(i).getIdTask();
            query = "SELECT * FROM task WHERE id_task="+tempIdTask;
            rs = db.getStatement().executeQuery(query);
            while(rs.next())
            {
               Task cmt = null;
               cmt=new Task(tempIdTask,rs.getInt("id_user"),rs.getString("title"),rs.getString("deadline"), rs.getString("description"), rs.getString("tags"),rs.getString("status"),rs.getInt("id_category"));
               temp.add(cmt);
               System.out.println("task = "+temp.get(i).getTitle());
            }
            i++;
        }
        closeDatabase();
        return temp;
    }
    // mendapatkan kumpulan id task dimana user berperan menjadi assignee di task tersebut
    public static ArrayList<AssigneeTask> getIdAssignee(int id_user) throws ClassNotFoundException, SQLException
    {
        openDatabase();
        String querty = "SELECT id_task FROM assignee_task WHERE id_user='"+id_user+"'";
        ResultSet rs = db.getStatement().executeQuery(querty);
        ArrayList<AssigneeTask> temp = new ArrayList<AssigneeTask>();
        while(rs.next())
        {
            AssigneeTask cmt = null;
            cmt=new AssigneeTask(rs.getInt("id_task"),id_user);
            temp.add(cmt);
        }
        closeDatabase();
        return temp;
    }
   
    // mendapatkan kumpulan usernmae dari user yang termasuk assignee dalam suatu task tertentu
    public static String getAssigneeMember (int id_task ) throws ClassNotFoundException, SQLException
    {
        openDatabase();
        String query = "SELECT id_user FROM assignee_task WHERE id_task='"+id_task+"'";
        ResultSet rs = db.getStatement().executeQuery(query);
        String temp="";
        while (rs.next())
        {
            temp = temp + getUsernameUser(rs.getInt("id_user")) + ",";
        }
        closeDatabase();
        return temp;
    }
    // mendapatkan judul kategori tertentu dari id kategorinya
    public static String getTitleCategory(int id_category) throws SQLException, ClassNotFoundException
    {
        openDatabase();
        String temp=null;
        String query = " SELECT title FROM category WHERE id_category='"+id_category+"'";
        ResultSet rs = db.getStatement().executeQuery(query);
        while (rs.next())
        {
            temp = rs.getString("title");
        }
        closeDatabase();
        return temp;
    }
    // mengubah hasil query select komponen2 task ke dalam bentuk string untuk diparsing sesuai kebutuhan
    public static String convertTaskToString (ArrayList<Task> list) throws ClassNotFoundException, SQLException
    {
        String temp = "";
        int i = 0;
        int tempIdTask;
         while (i<(list.size()))
        {
            //tempIdTask = list.get(i).getIdTask();
            temp = temp + 
                   list.get(i).getIdTask()+ '#'+ 
                   list.get(i).getTitle() + '#' + 
                   list.get(i).getDeadline() + '#' + 
                   list.get(i).getDescription() + '#' + 
                   list.get(i).getStatus() + '#' + 
                   list.get(i).getTags() + '#' + 
                   getTitleCategory(list.get(i).getIdCategory()) + '#' +
                   getUsernameUser(list.get(i).getIdUser()) + '#' + 
                   getAssigneeMember(list.get(i).getIdTask()) +';';
            i++;
        }
        return temp;
    }
    // merubah status tugas
    public static void updateStatus(int id_task,String status) throws ClassNotFoundException, SQLException
    {
        openDatabase();
        String query = "UPDATE task SET status='"+status+"' WHERE id_task='"+id_task+"'";
        Statement stmt = (Statement) db.getConnect().createStatement();
        int executeUpdate = stmt.executeUpdate(query);
        closeDatabase();
    }
     public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        ArrayList<Task> sesuatucuk = getTaskAll(3);
        String message = convertTaskToString(sesuatucuk);
        //updateStatus(1,"Completed");
        System.out.print(message);
    }
    
}
