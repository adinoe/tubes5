/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbox;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class TaskListPanel extends javax.swing.JPanel {

    /**
     * Creates new form TaskListPanel
     */
    
    private JLabel _label;
    private JTable table;
    private static final int MAX_CHECKS = 30;
    private ArrayList<JCheckBox> c = new ArrayList<JCheckBox>();
    private ArrayList<JLabel> title = new ArrayList<JLabel>();
    private ArrayList<JLabel> deadline = new ArrayList<JLabel>();
    private ArrayList<JLabel> description = new ArrayList<JLabel>();
    private ArrayList<JLabel> header = new ArrayList<JLabel>();
    
    ArrayList<String> rowMessage = new ArrayList<String>();
    ArrayList<String> columnMessage = new ArrayList<String>();
    ArrayList<ArrayList<String>> dataMessage = new ArrayList<ArrayList<String>>();
    
    String serverMessage;
    
    public TaskListPanel(String username) {
        initComponents();
        jLabel1.setText(username);
        
        ClientBox b = new ClientBox();
        String m = b.run("localhost", 25000, ClientMessage.listMessage(username));
        
        rowMessage = ParseMessage.parseMessage(m, ";");
        
        for(int i=0; i<rowMessage.size(); i++){
            columnMessage = ParseMessage.parseMessage(rowMessage.get(i), "#");
            dataMessage.add(columnMessage);
        }
        
        boolean stat = false;
        for(int i=0; i<dataMessage.size(); i++){
            
            //for(int j=0; j<dataMessage.get(i).size(); j++){
                //System.out.print(dataMessage.get(i).get(j)+":");
                //row ke 0 id
                if(dataMessage.get(i).get(4).equals("Completed")){
                    stat = true;
                }
                else{
                    stat = false;
                }
                c.add(new JCheckBox("status"+dataMessage.get(i).get(0),stat));
                title.add(new JLabel(dataMessage.get(i).get(1)));
                deadline.add(new JLabel(dataMessage.get(i).get(2)));
                description.add(new JLabel(dataMessage.get(i).get(3)));
            //}
            //System.out.println("");
        }
        
        
        
        JCheckBox checkBox = new JCheckBox("Test"); 
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(0, 4, 10, 10));
        
        JScrollPane checkBoxPanel = new JScrollPane(jPanel);
        header.add(new JLabel("Title"));
        header.add(new JLabel("Deadline"));
        header.add(new JLabel("Description"));
        header.add(new JLabel("Status"));
        for(int i = 0; i < 4; i++){
            header.get(i).setBackground(Color.red);
            jPanel.add(header.get(i));
        }
        
        checkBoxPanel.setBounds(20, 80, 900, 550);
        // Create columns names
	/*
        for(int i = 0; i < 20; i++){
            //title.add(new JLabel(columnMessage.get(0)));
            //deadline.add(new JLabel(columnMessage.get(1)));
            //description.add(new JLabel(columnMessage.get(2)));
            
            c.add(new JCheckBox("Item "+i));
            title.add(new JLabel("Label"+i));
            deadline.add(new JLabel("Label"+i));
            description.add(new JLabel("Label"+i));
        }
        
        */
        for(int i = 0; i < dataMessage.size(); i++){
            //checkBox.setBounds(20, 30*i+50, 100, 30);
            //checkBox.setName("checkBox"+i);
            //checkBox.setVisible(true);
            //checkBoxPanel.add(checkBox);
            
            c.get(i).setBounds(20,20*i,100,30);
            c.get(i).setVisible(true);
            title.get(i).setBounds(20,30*i,200,30);
            title.get(i).setVisible(true);
            jPanel.add(title.get(i));
            deadline.get(i).setBounds(20,30*i,200,30);
            deadline.get(i).setVisible(true);
            jPanel.add(deadline.get(i));
            description.get(i).setBounds(20,30*i,200,30);
            description.get(i).setVisible(true);
            jPanel.add(description.get(i));
            jPanel.add(c.get(i));
            
        }
        
        checkBoxPanel.setAutoscrolls(true);
        checkBoxPanel.setVisible(true);
        this.add(checkBoxPanel);
        eventListenerCheckBox();
        
    }
    public void setStatus(){
        
    }
    
    public boolean getStatus(JCheckBox a){
        return a.isSelected();
    }
    
    public void eventListenerCheckBox(){
        JCheckBox temp = new JCheckBox();
        
        for(int i=0; i<c.size(); i++){
            temp = c.get(i);
            final String stats = "Status Check = "+c.get(i).isSelected();
            System.out.println(stats);
            final String id = dataMessage.get(i).get(0);
            boolean status = getStatus(c.get(i));
            
            /*temp.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    AbstractButton abstractButton = (AbstractButton)actionEvent.getSource();
                    boolean selected = abstractButton.getModel().isSelected();
                    abstractButton.setText(newLabel);
                    System.out.println("Get Action Command "+e.getActionCommand());
                    if(e.getActionCommand().equals("status"+id)){
                        System.out.println(stats);
                    }
                }
                
            });
            * 
            */
            
            ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton)actionEvent.getSource();
                    boolean selected = abstractButton.getModel().isSelected();
                    ClientBox c = new ClientBox();
                    if(actionEvent.getActionCommand().equals("status"+id)){
                        if(selected == true){
                            //kirim pesan id x diubah menjadi status Completed
                            String m = c.run("localhost",25000, ClientMessage.update(id, "Completed"));
                            System.out.println(m);
                        }
                        else{
                            //kirim pesan id x diubah menjadi status Uncompleted
                            String m = c.run("localhost",25000, ClientMessage.update(id, "Uncompleted"));
                            System.out.println(m);
                        }
                    }
                    System.out.println("Selected = "+selected);
                }
            };
            
            temp.addActionListener(actionListener);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setText("Sync");

        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText("List Task");

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(403, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ClientBox c = new ClientBox();
        //c.postMessage("localhost", 25000 , ClientMessage.loginMessage(jTextField1.getText(), jTextField2.getText()));
        String m = c.run("localhost",25000, ClientMessage.logoutMessage());
        System.out.println("Pesan "+m);
        if(m.equals("logout action")){
            LoginPanel p = new LoginPanel();
            ClientMain.removePanel(this);
            ClientMain.changePanel(p);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        System.out.println("test test test");
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
