
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Admin extends JFrame{
      private JLabel img;
    public static JLabel L11;
    private JTextField email;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
      private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JTextField name;
    private JTextField password;
    private JTable table;
     private JScrollPane jScrollPane1;
   private JLabel   jLabel6;
    
       private JButton               jButton7;
    
    Connection conn =null;
    Admin()
    {
      intcomponent();
        conn=Javaconnect.dbConnection();
         Refresh();
         Refresh123();
    
    }
    
    public void close(){
    
    WindowEvent WinClosingEventeEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(WinClosingEventeEvent);
    
    
    }
    
    
    public void Refresh(){
		try{
		String sql = "SELECT *from admin where username='"+L11.getText()+"'";          //+id+ means variable
					PreparedStatement statement = conn.prepareStatement(sql);
				     
					
					
					
					
					ResultSet result = statement.executeQuery();
					
					
					
					while(result.next()){
					
						
						//Id.setText(result.getString("id"));
                                                password.setText(result.getString("password"));
						name.setText(result.getString("username"));
						email.setText(result.getString("email"));
						
						
					}
					
				
					
					statement.close();
					
					
					
					
					
					
				}catch(Exception e2){
					
					e2.printStackTrace();
					
				}
				
				
		
		
		
		
	}  
    
    
    
    
    
   public void   intcomponent()
     {
     
         jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();
        L11 = new JLabel();
        name = new JTextField();
        password = new JTextField();
        email = new JTextField();
        jButton3 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jButton4 = new JButton();
        jButton5 = new JButton();
         jButton6 = new JButton();
        jLabel5 = new JLabel();
      jScrollPane1 = new JScrollPane();
        this.setLayout(null);
     
        
        jLabel6 = new JLabel();

jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

//jLabel6.setForeground(new java.awt.Color(255, 255, 255));
jLabel6.setForeground(Color.red);

jLabel6.setText("MARKS :");

jLabel6.setBounds(420, 120, 140, 30);

this.add(jLabel6);
        
      jButton7 = new JButton();

jButton7.setBackground(new java.awt.Color(0, 0, 204));

jButton7.setForeground(new java.awt.Color(255, 255, 255));

jButton7.setText("DELET MARKS FOR NEW EXAM");

jButton7.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton7ActionPerformed(evt);
    }
});
jButton7.setBounds(350, 400, 230, 30);
this.add(jButton7 );
 
        
         jLabel1.setBounds(10, 50, 300, 30);
         //username
         jLabel1.setText("ADMIN NAME,PASSWORD SHOW BOX:");
         
         L11.setBounds(110, 40, 390, 20);

   //show username
   
         jLabel2.setBounds(130, 130, 50, 20);
         jLabel2.setText("NAME:");
  //nametext
        name.setBounds(100, 150, 130, 30);

    //passordlabel
    
        jLabel3.setBounds(127, 200, 90,20);
       jLabel3.setText("PASSWORD :");

     //passordtext
     
       password.setBounds(100, 220, 130, 30);
       
       
       //email label
       jLabel4.setBounds(140, 270, 90, 20);
       jLabel4.setText("EMAIL :");

   email.setBounds(100, 290, 130, 30);

//show button
   

 jButton3.setBounds(110, 360, 90, 35);
   jButton3.setText("SHOW");

jButton3.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        showActionPerformed(evt);
    }
});


//logout button


jButton4.setBounds(480, 450, 100, 35);
jButton4.setText("LOG OUT");
jButton4.setForeground(Color.red);
jButton4.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
       logoutActionPerformed(evt);
    }
});


  //showuser
  
  jButton1.setBounds(360, 20, 130, 35);
  jButton1.setText("Show User");

jButton1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
       showuserActionPerformed(evt);
    }
});



//upload question


jButton2.setBounds(500, 20, 130, 35);
jButton2.setText("Upload Question");

jButton2.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        uploadQuestionActionPerformed(evt);
    }
});

// rules 

 jButton6.setBounds(500, 70, 130, 35);
   jButton6.setText("Question Rules");

jButton6.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton6ActionPerformed(evt);
    }
});








//edit question


jButton5.setBounds(360,70, 130, 35);
jButton5.setText("EDIT QUESTION");

jButton5.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        editQuestionActionPerformed(evt);
    }
});


   
  //add components
 this.add(jLabel1);
  
  //this.add(L11);
  this.add(jLabel2);

  this.add(name);
  this.add(jLabel3);
  this.add(password);
  this.add(jLabel4);
  
  this.add(email);
  
  this.add(jButton3);
  
  
  this.add(jButton4);
  this.add(jButton1);
  this.add(jButton2);
  this.add(jButton5);
  this.add(jButton6);
  
  this.add(jScrollPane1);
  
  
   ImageIcon i = new ImageIcon("shr.png");
  img = new JLabel(i);
  
  
  img.setIcon(new javax.swing.ImageIcon(getClass().getResource("k.jpg"))); // NOI18N

img.setPreferredSize(new java.awt.Dimension(600,400));

img.setBounds(0, 0, 650,600);

  
  this.setLocationRelativeTo(null);
  this.setResizable(false);
  
  this.add(img);
  
  
  
  
  
   this.setLocation(300, 150);
 this.setSize(650, 600);
  this.setTitle("Admin Profile");
  this.setVisible(true);
    
 
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
     
     
  
  
  
  
table = new JTable();

table.setBackground(new java.awt.Color(255, 255, 0));

table.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
    },
    new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
    }
));



table.addAncestorListener(new javax.swing.event.AncestorListener() {
    public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
    }
    public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        tableAncestorAdded(evt);
    }
    public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
    }
});
table.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableMouseClicked(evt);
    }
});

jScrollPane1.setViewportView(table);

  jScrollPane1.setBounds(300, 150, 310, 240);
  
  
  
  
  
  
     }
   
   
   
   
   
   
              
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         


    try {
               String sql1;
               sql1 = "DELETE FROM marks";
               
               
               Statement statement2;
               statement2 = conn.createStatement();
               //ResultSet rs1;
               //rs1 = statement2.executeQuery(sql1);
               
               statement2.execute(sql1);
               
               //JOptionPane.showMessageDialog(null,"DELETE  data successfully");
               
               
               statement2.close();
               
               Refresh123();
               
               
               
               
             
               
               
               // TODO add your handling code here:
           } catch (SQLException ex) {
               Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
           }













        // TODO add your handling code here:
    }                                        

   
   
   
   
   
   
   
   
   
   
   
   private void showActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
           try{
					
					//int row=table.getSelectedRow();
					//String id=(table.getModel().getValueAt(row,0 )).toString();
					

					String sql = "SELECT *from admin where username='"+L11.getText()+"'";          //+id+ means variable
					PreparedStatement statement = conn.prepareStatement(sql);
				     
					
					
					
					
					ResultSet result = statement.executeQuery();
					
					
					
					while(result.next()){
					
						
						//Id.setText(result.getString("id"));
                                                password.setText(result.getString("password"));
						name.setText(result.getString("username"));
						email.setText(result.getString("email"));
						
						
					}
					
				
					
					statement.close();
					
					
					
					
					
					
				}catch(Exception e2){
					
					e2.printStackTrace();
					
				}
				
				
        
        
        
        
    }                                        
   
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:

        try{

            int row=table.getSelectedRow();
            String id=(table.getModel().getValueAt(row,0 )).toString();

            String sql = "SELECT *from employ where id='"+id+"'";          //+id+ means variable
            PreparedStatement statement = conn.prepareStatement(sql);

            ResultSet result = statement.executeQuery();

            while(result.next()){

                //Id.setText(result.getString("id"));
                name.setText(result.getString("name"));
                email.setText(result.getString("email"));

            }

            statement.close();

        }catch(Exception e2){

            e2.printStackTrace();

        }

    }                                  

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {                                    
        // TODO add your handling code here:
    }                  
   private void logoutActionPerformed(java.awt.event.ActionEvent evt) {                                         
Log_in  l1 =new Log_in();

l1.setVisible(true);
this.setVisible(false);


        
    }
   
    public void Refresh123(){
		
		try{
                  //Admin a= new Admin();  
                    
        //jLabel7.setText(Admin.L11);
			String sql = "SELECT * FROM marks order by marks DESC ";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			table.setModel(DbUtils.resultSetToTableModel(result));
			
			
			}catch(Exception e1){
				
				e1.printStackTrace();
				
				
			}
		
		
		
		
		
	}
    
    
   
   
   
   
   // rules 
   
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        
        
        
        
        
    
           try {
               String sql1;
               sql1 = "DELETE FROM rules ";
               
               
               Statement statement2;
               statement2 = conn.createStatement();
               //ResultSet rs1;
               //rs1 = statement2.executeQuery(sql1);
               
               statement2.execute(sql1);
               
               //JOptionPane.showMessageDialog(null,"DELETE  data successfully");
               
               
               statement2.close();
               
               
               
               
               
               
             Qusrules q = new Qusrules();
              q.setVisible(true);
              this.setVisible(false);
               
               
               
               // TODO add your handling code here:
           } catch (SQLException ex) {
               Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
           }
    }               
   
   
   
   
   
   
   
   //user show in
   
   private void showuserActionPerformed(java.awt.event.ActionEvent evt) {                                         
   




  Showdata s = new Showdata();

  s.setVisible(true);
     
  this.setVisible(false);




        
    }      
   
   //upload question
   
   
   private void uploadQuestionActionPerformed(java.awt.event.ActionEvent evt) {                                         
  Ques_subject q1 = new Ques_subject();
  q1.setVisible(true);
  this.setVisible(false);


        
    }                                        

   //edit question
   
 private void   editQuestionActionPerformed(java.awt.event.ActionEvent evt) {                                         

  ShowQus q = new ShowQus();
  
  q.setVisible(true);
  this.setVisible(false);



 }
   
   
   
   public static void main(String [] args)
   {
       new Admin();
   }
    
}
