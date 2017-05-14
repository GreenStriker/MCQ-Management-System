
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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static JudgingSystem.Admin.L11;
import java.util.Random;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class question extends JFrame{
    private JLabel img;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private ButtonGroup buttonGroup4;
    private final JPanel item1 = new javax.swing.JPanel();
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JRadioButton jRadioButton_a;
    private JRadioButton jRadioButton_b;
    private JRadioButton jRadioButton_c;
    private JRadioButton jRadioButton_d;
    private JLabel option_a;
    private JLabel option_b;
    private JLabel option_c;
    private JLabel option_d;
    private JButton panel1;
    private JButton panel2;
    private JLabel question1;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Random r1 = new Random();
     int pos = 0;
     int key = 0;
     int mark = 0;
     int limit = 1;
     int tm ;
     String ans;
     String sg;
    Connection conn =null;
    public question() {
        initComponents();
          conn=Javaconnect.dbConnection();
          
          
          start();
          
          
          
          
           try{
					
					//int row=table.getSelectedRow();
					//String id=(table.getModel().getValueAt(row,0 )).toString();
				String lmt;	

					String sql = "SELECT *from rules ";          //+id+ means variable
					Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
					
					
					
					while(rs.next()){
					
						
						//Id.setText(result.getString("id"));
                                          lmt = String.valueOf( rs.getString("qsize"));
						limit = Integer.parseInt(lmt);
						
						
					}
					
				
					
					statement.close();
					
					
					
					
					
					
				}catch(Exception e2){
					
					e2.printStackTrace();
					
				}
          
          
          
          
          
          
          
          
          
          
          
    }

    
    
   public void  initComponents(){
   
   
   
   
   
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
              panel1 = new JButton();
           question1 = new JLabel();
            option_d = new JLabel();
            option_a = new JLabel();
            option_b = new JLabel();
            option_c = new JLabel();
      jRadioButton_a = new JRadioButton();
      jRadioButton_b = new JRadioButton();
      jRadioButton_c = new JRadioButton();
      jRadioButton_d = new JRadioButton();
             jLabel1 = new JLabel();
             jLabel4 = new JLabel();
             jLabel5 = new JLabel();
             jLabel6 = new JLabel();
             jLabel2 = new JLabel();
            jButton1 = new JButton();
              panel2 = new JButton();
            jButton3 = new JButton();
            jButton4 = new JButton();
  
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 
  // this.add(item1);
   panel1.setBackground(new java.awt.Color(255, 0, 51));
        panel1.setText("GO BACK");
        panel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel1ActionPerformed(evt);
            }
        });
       panel1.setBounds(530, 10, 90, 30);
       question1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255), 3));
       
       question1.setBounds(10, 50, 680, 80);
       this.add(question1);
       
       
     option_d.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
     option_d.setBounds(220, 300, 200, 30);
       this.add(option_d); 
     

        option_a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
     option_a.setBounds(220, 150, 200, 30);
       this.add(option_a);
        

        option_b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
      option_b.setBounds(220, 200, 200, 30);
       this.add(option_b);
       
       this.add(panel1);

        option_c.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
       option_c.setBounds(220, 250, 200, 30);
       this.add(option_c);
        
  
       
       
       buttonGroup3.add(jRadioButton_a);
        jRadioButton_a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_aActionPerformed(evt);
            }
        });
        
        jRadioButton_a.setBounds(430, 150, 60, 30);
       this.add(jRadioButton_a);
       
       
       
       
       buttonGroup3.add(jRadioButton_b);
        jRadioButton_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_bActionPerformed(evt);
            }
        });
        
        jRadioButton_b.setBounds(430, 200, 60, 30);
       this.add(jRadioButton_b);
        
        
        
        buttonGroup3.add(jRadioButton_c);
        jRadioButton_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_cActionPerformed(evt);
            }
        });
        
        
         jRadioButton_c.setBounds(430, 250, 60, 30);
       this.add(jRadioButton_c);
        
        
        
        
        
        buttonGroup3.add(jRadioButton_d);
        jRadioButton_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_dActionPerformed(evt);
            }
        });
        
           jRadioButton_d.setBounds(430, 300, 60, 30);
       this.add(jRadioButton_d);
        
        
        
        
       
       
       jLabel1.setText("a.");
       
       jLabel1.setBounds(180, 160, 30, 30);
       this.add(jLabel1);
        
       
      
        jLabel4.setText("b.");
        
        jLabel4.setBounds(180, 210, 60, 30);
       this.add(jLabel4);
        
        
        jLabel5.setText("c.");
        
        jLabel5.setBounds(180, 260, 60, 30);
       this.add(jLabel5);
        
        
        jLabel6.setText("d.");
        
        jLabel6.setBounds(180, 310, 60, 30);
       this.add(jLabel6);
        
        
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Panel 1");
        
        jLabel2.setBounds(280, 10, 130, 30);
       this.add(jLabel2);
        
       
        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jButton1.setBounds(340, 410, 100, 30);
      // this.add(jButton1);
        
       
        panel2.setBackground(new java.awt.Color(255, 153, 51));
        panel2.setText("PREVIOUS");
        panel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel2ActionPerformed(evt);
            }
        });
        
        panel2.setBounds(230, 410, 100, 30);
     //  this.add(panel2);
        
       
        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setText("LAST");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        jButton3.setBounds(450, 410, 100, 30);
      // this.add(jButton3);
        
        
        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setText("FRIEST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        
        jButton4.setBounds(118, 410, 100, 30);
      // this.add(jButton4);
        
        
    //    getContentPane().add(item1, "card3");

       
        ImageIcon i = new ImageIcon("shr.png");
  img = new JLabel(i);
  
  
  img.setIcon(new javax.swing.ImageIcon(getClass().getResource("k.jpg"))); // NOI18N

  
   this.setSize(600,400);
  
img.setPreferredSize(new java.awt.Dimension(600,400));

img.setBounds(0, 0, 700,550);

  this.setLocationRelativeTo(null);
  this.setResizable(false);
  
  
  this.add(img);
         this.setLocation(300, 150);
         
   this.setLayout(null);
   this.setSize(700, 550);
  //item1.setSize(740, 450);
       
       
       
       
       
   
   
   
   }
     
     
     
     
     
     
     
     
      public void clean(){
    
    
    
    
    buttonGroup3.clearSelection();
    
    
    
    
    }
      
      
      
      public void start(){
      
      
      showItem(pos);  
       
        item1.setVisible(true);
      
      
      }
      
    
    public List<JudgingSystem.Item> getItemsList()
    {
        try {
            //Connection connection = getConnection();

            String sql = "SELECT * from question where  subject ='"+UserS.select_sub.getText()+"'" ;          //+id+ means variable
            PreparedStatement statement = conn.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            List <JudgingSystem.Item> list = new ArrayList<>();

            JudgingSystem.Item item;

            while(rs.next())
            {
               item = new JudgingSystem.Item(rs.getString("question"),rs.getString("a"),
                      rs.getString("b"),rs.getString("c"),rs.getString("d"),rs.getString("ans"));
               
               list.add(item);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
      public void showItem(int index)
    {
        question1.setText(getItemsList().get(index).getQuestion());
        option_a.setText(getItemsList().get(index).getA());
        option_b.setText(getItemsList().get(index).getB());
        option_c.setText(getItemsList().get(index).getC());
        option_d.setText(getItemsList().get(index).getD());
        String s0;
        s0 = String.valueOf(getItemsList().get(index).getA());
         String s2;
        s2 = String.valueOf(getItemsList().get(index).getB());
        String s3;
        s3 = String.valueOf(getItemsList().get(index).getC());
         String s4;
        s4 = String.valueOf(getItemsList().get(index).getD());
      String sans;
        sans = String.valueOf(getItemsList().get(index).getAns());
          
        
        if(s0.equals(sans)){
        
        key = 1;
        
        }
        if(s2.equals(sans)){
        
        key = 2;
        
        }
        if(s3.equals(sans)){
        
        key = 3;
        
        }
        if(s4.equals(sans)){
        
        key = 4;
        
        }
        
        
    }
    
  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pos++;
     
        
       
           
              //limit = 2;
              
//   JOptionPane.showMessageDialog(null,"limit  " + limit);
        
        
        
       
        
        
        
        
        if(pos >= getItemsList().size())
        {
            
            //JOptionPane.showMessageDialog(null,"1st  " );
            //pos = getItemsList().size()-1;
            
            flanv();
               

                
            
         clean();
            
            
        }
        
        
        else {
            
             if(limit == 0) {
            //JOptionPane.showMessageDialog(null,"2st  " );
        showItem(pos);
        clean();
        }
        else{
                // JOptionPane.showMessageDialog(null,"3st  " );
    if(pos >= limit)
        {
            //JOptionPane.showMessageDialog(null,"4st  " );
            //pos = getItemsList().size()-1;
            
            flanv();
            
            
         
         clean();   
            
        }
    
    else {
    //JOptionPane.showMessageDialog(null,"5st  " );
    showItem(pos);
    clean();
    }
                 
                 
                 
                 
                 
    }
        
  clean();   
    }                                        
    }
    
    
    
    
    
    
    public void change(){
    
     // jRadioButton_a.setSelected(true);     ;
     
    
    
    
    
    pos++;
     
        
          clean();
        
        
        
        if(pos >= getItemsList().size())
        {
            
            //JOptionPane.showMessageDialog(null,"1st  " );
            //pos = getItemsList().size()-1;
            
            flanv();
               

                
            
         clean();
            
            
        }
        
        
        else {
            
             if(limit == 0) {
            //JOptionPane.showMessageDialog(null,"2st  " );
        showItem(pos);
        clean();
        }
        else{
                // JOptionPane.showMessageDialog(null,"3st  " );
    if(pos >= limit)
        {
            //JOptionPane.showMessageDialog(null,"4st  " );
            //pos = getItemsList().size()-1;
            
            flanv();
            
            
         
         clean();   
            
        }
    
    else {
    //JOptionPane.showMessageDialog(null,"5st  " );
    showItem(pos);
    clean();
    }
                 
                 
                 
                 
                 
    }
        
  clean();   
    }                    
    
    }
    
    
    
    
    
    
    
    
    
    private void jRadioButton_aActionPerformed(java.awt.event.ActionEvent evt) {                                               

if(key==1){

mark = mark+1;
//tm = mark * 100 / limit ;
}

    change();    // TODO add your handling code here:
    }                                              

    private void panel1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
UserS s =new UserS();

s.setVisible(true);
        //menu.setVisible(true);
        this.setVisible(false);

    }                                      

    private void panel2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
pos--;
        if(pos < 0)
        {
            pos = 0;
        }
        showItem(pos);        // TODO add your handling code here:
    }                                      

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 pos = getItemsList().size() - 1;
        showItem(pos);        // TODO add your handling code here:
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 pos = 0;
        showItem(pos);        // TODO add your handling code here:
    }                                        

    private void jRadioButton_dActionPerformed(java.awt.event.ActionEvent evt) {                                               
if(key==4){

mark = mark+1;

//tm = mark * 100 / limit ;
}    

change();
// TODO add your handling code here:
    }                                              

    private void jRadioButton_bActionPerformed(java.awt.event.ActionEvent evt) {                                               
if(key==2){

mark=mark+1;


}        // TODO add your handling code here:
  change();  }                                              

    private void jRadioButton_cActionPerformed(java.awt.event.ActionEvent evt) {                                               
if(key==3){

mark=mark+1;


}        // TODO add your handling code here:
   change(); }                                              

    public void flanv(){
    String s11 = String.valueOf(mark);
    
try { 
  JOptionPane.showMessageDialog(null,"You Got : "+mark);

    
                                    tm = mark * 100 / limit ;
                                    
       if(tm >= 90)       {   sg = "A+"; }                      
       else if(tm >= 85)       {   sg = "A"; }                               
        else if(tm >= 80)       {   sg = "B+"; }                            
        else if(tm >= 75)       {   sg = "B"; }                            
         else if(tm >= 70)       {   sg = "C+"; }                           
        else if(tm >= 65)       {   sg = "C"; }                            
       else if(tm >= 60)       {   sg = "D+"; }                             
       else if(tm >= 50)       {   sg = "D"; }                             
        else   {   sg = "F"; }                            
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    String query=" select * from marks where username=? ";
					PreparedStatement pst;
                                                pst= conn.prepareStatement(query);
					pst.setString(1, Profile.L1.getText());
					//pst.setString(2, passwordField.getText());
					
                                        
					
                                         ResultSet    rs=pst.executeQuery();
                                        
                                       
					 if(rs.next()){
					 //JOptionPane.showMessageDialog(null,"Successfully Login");	
                                            rs.close();
                                             pst.close();
                                            close();
						
                                               JOptionPane.showMessageDialog(null,"!!!!!ERROR YOU HAVE ALREADY COMPLETED YOUR EXAM ");
                                                //  NewJFrame1 n=new NewJFrame1();
        
                                                  //NewJFrame1.L1.setText(this.username.getText());
                                            
                                                  //Profile n=new Profile();
                                                  //Profile.L1.setText(this.username.getText());
                                                  //n.setVisible(true);
                                                 
                                                  
							
						 
					 }
					 else{
    
    
    
    
    
    
   // int tt =  ;
    
     // tm = mark * 100 / limit ;
    System.out.println(tm);
    
String s1 = String.valueOf(mark);

String s2 = String.valueOf(tm);
                                      String sqd = "INSERT INTO marks (username , marks , Avg , Grade ) VALUES (?,?,?,?) ";
					
					PreparedStatement statement;
        
                                      statement = conn.prepareStatement(sqd);
                                         statement.setString(1,Profile.L1.getText());
                                            statement.setString(2,s1);
					statement.setString(3,s2);
					statement.setString(4,sg);
                                        
                                        
					statement.execute();
					
					//JOptionPane.showMessageDialog(null,"Your Exam is Compleate ... THANK YOU "+Profile.L1.getText());
					
					statement.close();
                        
                                         }}


 catch (Exception ex) {
           //JOptionPane.showMessageDialog(null,"not saved");
        }

Log_in lh = new Log_in();
lh.setVisible(true);

this.setVisible(false);

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
  
    
    
    /**
     * @param args the command line arguments
     */
    public void close(){
    
    WindowEvent WinClosingEventeEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(WinClosingEventeEvent);
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   public static void main(String [] args)
   {
       new question();
   } 
    
    
    
}
