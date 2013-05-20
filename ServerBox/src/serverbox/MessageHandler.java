/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverbox;

import Entity.Task;
import java.util.ArrayList;
import Model.Login;
import Model.ListTask;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class MessageHandler {
    public static ArrayList parseMessage(String message){
        String[] messages = message.split(";");
        ArrayList temp = new ArrayList();
        for(int i = 0; i < messages.length; i++){
            temp.add(messages[i]);
        }
        return temp;
    }
    
    public static String runCommand(ArrayList l) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException{
        String message = " failed";
        if(l.get(0).equals("login")){
            //action login
            boolean isExist = false;
            isExist = Login.isUserExist(l.get(1).toString(), l.get(2).toString());
            if(isExist){
                message = "login successfull";
            }
            else{
                message = "login failed";
            }
        }
        else if(l.get(0).equals("logout")){
            //action logout
            message = "logout action";
        }
        else if(l.get(0).equals("list")){
            //action list task
            ListTask listTask = new ListTask();
            ArrayList<Task> sesuatucuk = ListTask.getTaskAll(ListTask.getIdUser(l.get(1).toString()));
            String msg = ListTask.convertTaskToString(sesuatucuk);
            message = msg;
        }
        else if(l.get(0).equals("post")){
            //action post changes
            message = "post";
        }
        else if(l.get(0).equals("sync")){
            //action sync task
            message = "sync";
        }
        return message;
    }
}
