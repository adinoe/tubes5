/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbox;

/**
 *
 * @author Asus
 */
public class ClientMessage {
    public ClientMessage(){
        
    }
    
    public static String loginMessage(String username, String password){
        //message : action;username;password
        String temp = "login;"+username+";"+password;
        return temp;
    }
    
    public static String logoutMessage(){
        //message : logout
        String temp = "logout";
        return temp;
    }
    
    public static String syncMessage(){
        //message : message
        String temp = "sync";
        return temp;
    }
    
    public static String listMessage(String username){
        //message : list;username
        String temp = "list;"+username;
        return temp;
    }
    
    public static String postChange(String id, String username, String value){
        String temp = "post;"+id+";"+username+";"+value;
        return temp;
    }
}
