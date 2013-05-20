/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbox;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ParseMessage {
    public static ArrayList<String> parseMessage(String message, String delimiter){
        String[] messages = message.split(delimiter);
        ArrayList temp = new ArrayList();
        for(int i = 0; i < messages.length; i++){
            temp.add(messages[i]);
        }
        return temp;
    }

}
