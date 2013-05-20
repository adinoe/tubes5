/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverbox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ServerBox {

    /**
     * @param args the command line arguments
     */
    
    private static Socket socket;
    
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
 
            int port = 25000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server Started and listening to the port 25000");
 
            //Server is running always. This is done using this while(true) loop
            while(true)
            {
                //Reading the message from the client
                socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String message = br.readLine();
                System.out.println("Message received from client is "+message);
 
                //Multiplying the number by 2 and forming the return message
                ArrayList command = MessageHandler.parseMessage(message);
                String returnMessage = MessageHandler.runCommand(command)+"\n";
                /*try
                {
                    int numberInIntFormat = Integer.parseInt(message);
                    int returnValue = numberInIntFormat*2;
                    returnMessage = String.valueOf(returnValue) + "\n";
                }
                catch(NumberFormatException e)
                {
                    //Input was not a number. Sending proper message back to client.
                    returnMessage = "Please send a proper number\n";
                }
                * 
                */
                
                /*OutputStream os1 = socket.getOutputStream();
                OutputStreamWriter osw1 = new OutputStreamWriter(os1);
                BufferedWriter bw1 = new BufferedWriter(osw1);

                String number = "5";

                String sendMessage = number + "\n";
                bw1.write(sendMessage);
                bw1.flush();
                * 
                */
 
                //Sending the response back to the client.
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(returnMessage);
                //System.out.println("Message sent to the client is "+returnMessage);
                bw.flush();
                
                
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e){}
        }
    }
}
