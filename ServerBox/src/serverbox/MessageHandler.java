/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverbox;

import java.util.ArrayList;

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
    
    public static String runCommand(ArrayList l){
        String message = " failed";
        if(l.get(0).equals("login")){
            message = "login action";
        }
        else if(l.get(0).equals("logout")){
            message = "logout action";
        }
        else if(l.get(0).equals("list")){
            message = "list";
        }
        else if(l.get(0).equals("post")){
            message = "post";
        }
        else if(l.get(0).equals("sync")){
            message = "sync";
        }
        return message;
    }
}
