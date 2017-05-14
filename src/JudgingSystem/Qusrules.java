/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JudgingSystem;


import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.event.*;
import java.awt.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author MOUKH_PC
 */
public class Qusrules extends JFrame {
   public static JLabel R1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JButton rbutton;
    private JTextField ruleTxt;  
    private JLabel img;
    
     Connection conn =null;
    Qusrules()
    {
      intcomponent();
        conn=Javaconnect.dbConnection();
        // Refresh();
    
    }
    
    
    public void   intcomponent()
     {
         
         
         
         
         R1 = new JLabel();
    jButton1 = new JButton();
     jButton2 = new JButton();
     jButton3 = new JButton();
   jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    rbutton = new JButton();
    ruleTxt  = new JTextField();
         
         this.setLayout(null);
         
         
         jLabel1.setBounds(22, 11, 120,30);
       jLabel1.setText("Question Size :");
         this.add(jLabel1);
         
         R1.setBounds(180, 11, 60,30);
      // R1.setText("Question Size :");
         this.add(R1);
         
         
          ruleTxt.setBounds(120, 80, 130,30);
       
         this.add(ruleTxt);
         
         
        rbutton.setBounds(290, 80, 163,30);
       rbutton.setText("set question Size :");
       
       rbutton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
      rbuttonActionPerformed(evt);
    
    

    
    }
});
       
       this.add(rbutton); 
         
         
         
         
         
         
         
         
         
         
        jButton1.setBounds(220, 290, 77,30);
       jButton1.setText("BACK");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
    }
});
       
       
       
       
       
       
       
       
       
       
         this.add(jButton1); 
          
         
         jButton2.setBounds(10, 200, 100,30);
       jButton2.setText("OFF");
     jButton2.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
      jButton2ActionPerformed(evt);
    }
});  
       
       
       this.add(jButton2); 
         
         
         
       jButton3.setBounds(10, 240, 100,30);
       jButton3.setText("ON");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
         jButton3ActionPerformed(evt);
    }
});   
       
       
       
       
       
         this.add(jButton3);    
         
         jLabel3.setBounds(10, 160, 140,30);
       jLabel3.setText("Set Exam Status");
         this.add(jLabel3);  
         
          ImageIcon i = new ImageIcon("shr.png");
  img = new JLabel(i);
  
  
  img.setIcon(new javax.swing.ImageIcon(getClass().getResource("k.jpg"))); // NOI18N

  
   this.setSize(600,400);
  
img.setPreferredSize(new java.awt.Dimension(600,400));

img.setBounds(0, 0, 700,550);

  this.setLocationRelativeTo(null);
  this.setResizable(false);
  
  
  this.add(img);
        
         
         
         
        this.setSize(650, 500);
  this.setTitle("QUEStion Rules");
  this.setVisible(true);
    
 
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
      
         
         
         
         
         
         
     }
    
    
    
    
    
    
    
    
    
    
    public void rule1(){
    
   try{
       
       String sql = "SELECT * FROM rules" ;
			 
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
                                        
                                       
					 if(rs.next()){
					// JOptionPane.showMessageDialog(null,"Successfully Login");	
                                           
                                             
                                        
						
                                             // JOptionPane.showMessageDialog(null,"User Name already In taken");
                                               rs.close(); 
                              

					String sql1;
                                   sql1 = "DELETE FROM rules ";
               
               
               Statement statement2;
               statement2 = conn.createStatement();
               //ResultSet rs1;
               //rs1 = statement2.executeQuery(sql1);
               
               statement2.execute(sql1);
                                  statement2.close();
                                        
                                         String sqd = "INSERT INTO rules (qsize  ) VALUES (?) ";
					
					PreparedStatement st;
        
                                      st = conn.prepareStatement(sqd);
                                         st.setString(1,ruleTxt.getText());
                                            //statement.setString(2,s1);
					
					
					st.execute();
					
					//JOptionPane.showMessageDialog(null,"Your Exam is Compleate ... THANK YOU "+Profile.L1.getText());
					
					st.close();
                                        
                                       
                                       	
					 rs.close();	 
					 }
					
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         else{
       
       
       
       
       
       
       
       
       
       
       String sqd = "INSERT INTO rules (qsize) VALUES (?) ";
					
					PreparedStatement st;
        
                                      st = conn.prepareStatement(sqd);
                                         st.setString(1,ruleTxt.getText());
                                            //statement.setString(2,s1);
					
					
					st.execute();
					
					//JOptionPane.showMessageDialog(null,"Your Exam is Compleate ... THANK YOU ");
					
					st.close();
                                        
                                         }
       
       
   }
   
   
   catch(Exception e){
   
   }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void rbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                        

       rule1();

       R1.setText(ruleTxt.getText());


        // TODO add your handling code here:
    }                                       

                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

Admin ae = new Admin();

ae.setVisible(true);

this.setVisible(false);






        // TODO add your handling code here:
    } 
    
    
    
                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         










try{
       
     String sql1;
               sql1 = "DELETE FROM avalable";
               
               
               Statement statement2;
               statement2 = conn.createStatement();
               //ResultSet rs1;
               //rs1 = statement2.executeQuery(sql1);
               JOptionPane.showMessageDialog(null,"Exam has turned OFF !!!!! ");
               statement2.execute(sql1);
               
               //JOptionPane.showMessageDialog(null,"DELETE  data successfully");
               
               
               statement2.close();
   }
   
   
   catch(Exception e22){
   
   }
















        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         


try{
       
       String sql = "SELECT * FROM avalable";
			 
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
                                        
                                       
					 if(rs.next()){
					 //JOptionPane.showMessageDialog(null,"Successfully Login");	
                                           
                                             
                                        
						
                                             // JOptionPane.showMessageDialog(null,"User Name already In taken");
                                               rs.close(); 
                              

					String sql1;
                                   sql1 = "DELETE FROM avalable";
               
               
               Statement statement2;
               statement2 = conn.createStatement();
               //ResultSet rs1;
               //rs1 = statement2.executeQuery(sql1);
               
               statement2.execute(sql1);
                                  statement2.close();
                                        
                                         String sqd = "INSERT INTO avalable (stat  ) VALUES (?) ";
					
					PreparedStatement st;
        
                                      st = conn.prepareStatement(sqd);
                                         st.setString(1,"1");
                                            //statement.setString(2,s1);
					
					JOptionPane.showMessageDialog(null,"Exam has turned ON !!!!! ");
					st.execute();
					
					//JOptionPane.showMessageDialog(null,"Your Exam is Compleate ... THANK YOU "+Profile.L1.getText());
					
					st.close();
                                        
                                       
                                       	
					 rs.close();	 
					 }
					
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         else{
       
       
       
       
       
       
       
       
       
       
       String sqd = "INSERT INTO avalable (stat  ) VALUES (?) ";
					
					PreparedStatement st;
        
                                      st = conn.prepareStatement(sqd);
                                         st.setString(1,"1");
                                            //statement.setString(2,s1);
					
				JOptionPane.showMessageDialog(null,"Exam has turned ON !!!!! ");	
					st.execute();
					
					//JOptionPane.showMessageDialog(null,"Your Exam is Compleate ... THANK YOU "+Profile.L1.getText());
					
					st.close();
                                        
                                         }
       
       
   }
   
   
   catch(Exception e22){
   
   }




        // TODO add your handling code here:
    } 
    
    
     public static void main(String [] args)
   {
       new Qusrules();
   }
    
    
    
     }
    
    
    
    
    
    
    
    
    
    
    
    

