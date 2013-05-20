/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbox;

import java.awt.Component;
import java.awt.Toolkit;
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
        Toolkit tk = Toolkit.getDefaultToolkit();  
        int xSize = ((int) tk.getScreenSize().getWidth());  
        int ySize = ((int) tk.getScreenSize().getHeight());  
        frame.setSize(xSize, ySize);
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
