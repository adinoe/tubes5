/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbox;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class ClientMain{
    public static JFrame frame;
    public static void changePanel(Component p){
        frame.add(p);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void removePanel(Component p){
        frame.remove(p);
    }
        
    public static void main(String[] args){
        frame = new JFrame("Frame in Java Swing");
        LoginPanel p = new LoginPanel();
        changePanel(p);
    }
}
