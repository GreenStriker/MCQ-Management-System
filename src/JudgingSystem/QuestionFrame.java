
package JudgingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class QuestionFrame extends javax.swing.JFrame  {
    
    
     private javax.swing.JTextField a;
    public static javax.swing.JLabel admin_jlabel2;
    private javax.swing.JTextField ans;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField question;
    private javax.swing.JTextField section;
    public static javax.swing.JLabel subject;
     private JLabel img;
    

    
    Connection conn =null;
    
    public QuestionFrame() {
       initComponents();
        
        conn=Javaconnect.dbConnection();
    }
    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       int insert=JOptionPane.showConfirmDialog(null,"Do you want to Insert ?","INSERT",JOptionPane.YES_NO_OPTION );
				if(insert==0){
				
				try{
					
					String sql = "INSERT INTO question (question,a,b,c,d,ans,subject,section,username,date,time) VALUES (?,?,?,?,?,?,?,?,?,now(),now())";
					
					PreparedStatement statement = conn.prepareStatement(sql);
					//statement.setString(1,Id.getText());
					statement.setString(1,question.getText());
					statement.setString(2,a.getText());
					statement.setString(3,b.getText());
                                        statement.setString(4,c.getText());
                                        statement.setString(5,d.getText());
                                        statement.setString(6,ans.getText());
                                        statement.setString(7,subject.getText());
                                        statement.setString(8,section.getText());
                                        statement.setString(9,admin_jlabel2.getText());
					statement.execute();
					
					JOptionPane.showMessageDialog(null,"Save data successfully");
					
					statement.close();
					
					
				    
                                        
                                        question.setText(null);
					a.setText(null);
					b.setText(null);
                                        c.setText(null);
                                        d.setText(null);
                                        ans.setText(null);
                                       
                                        
                        	
					
					
				}catch(Exception e2){
					
					e2.printStackTrace();
					
				}
				

				//Refresh();    //call refresh function	
				
			}	 
        
        
        
        
    }                          
    
    
    
    
    
     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

Ques_subject q2 =new Ques_subject();


q2.setVisible(true);

this.setVisible(false);


    }                                        

    
    
    
    
     private void initComponents() 
    {
    
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        question = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        d = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        section = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        admin_jlabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jButton3.setText("jButton3");
        
        
        
        //variable and event
        
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("           Question Upload");
        jLabel1.setBounds(200, 10, 340, 40);

        jLabel2.setText("Question:");
        jLabel2.setBounds(20, 70, 100, 30);

        question.setBackground(new java.awt.Color(0, 255, 255));
        question.setBounds(80, 60, 630, 80);

        jLabel3.setText("a.");
       jLabel3.setBounds(140, 180, 30, 20);

        a.setBackground(new java.awt.Color(255, 255, 0));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              // aActionPerformed(evt);
            }
        });
       a.setBounds(160, 180, 150, 30);

        jLabel4.setText("c.");
        jLabel4.setBounds(140, 260, 150, 30);

        b.setBackground(new java.awt.Color(255, 255, 0));
        b.setBounds(400, 180, 160, 30);

        jLabel5.setText("b.");
      jLabel5.setBounds(370, 180,  150, 30);

        c.setBackground(new java.awt.Color(255, 255, 0));
        c.setBounds(160, 250, 150, 30);

        jLabel6.setText("d.");
       jLabel6.setBounds(370, 260, 150, 30);

        d.setBackground(new java.awt.Color(255, 255, 0));
        d.setBounds(400, 250, 160, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
            }
        });
      jButton1.setBounds(310, 370, 90, 40);

        jLabel7.setText("SUBJECT:");
       jLabel7.setBounds(600, 10, 60, 30);

        subject.setText("Subject");
       subject.setBounds(660, 10, 130, 30);

        jLabel8.setText("QUESTION SET:");
        jLabel8.setBounds(430, 290, 110, 20);

        section.setBackground(new java.awt.Color(153, 153, 0));
        section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              // sectionActionPerformed(evt);
            }
        });
       section.setBounds(400, 320, 160, 30);

        jLabel9.setText("UserName:");
       jLabel9.setBounds(10, 10, 80, 20);

        admin_jlabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        admin_jlabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        admin_jlabel2.setBounds(80, 10, 120, 30);

        jLabel10.setText("Answer:");
       jLabel10.setBounds(100, 330, 70, 20);

        ans.setBackground(new java.awt.Color(0, 153, 0));
       ans.setBounds(160, 320, 150, 30);
      jLabel11.setBounds(330, 480, 400, 2);

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setText("BACK");
        
        jButton2.setBounds(310, 440, 90, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
            }
        });
        
        
        
jLabel11 = new javax.swing.JLabel();

jLabel11.setBounds(330, 460, 400, 20);

        
        
        //add frame
        
        
          this.setLayout(null);
        this.add(jLabel1);
        
        this.add(jLabel2);
        
        this.add(question);
        this.add(jLabel3);
        this.add(a);
        this.add(jLabel4);
        this.add(b);
        this.add(jLabel5);
        this.add(c);
        this.add(jLabel6);
        this.add(d);
        this.add(jButton1);
        this.add(jLabel7);
        this.add(subject);
        this.add(jLabel8);
        this.add(section);
        this.add(jLabel9);
        this.add(admin_jlabel2);
        this.add(jLabel10);
        this.add(ans);
        this.add(jLabel11);
        this.add(jButton2);
        this.add(jLabel11);
        //main frame
     
   ImageIcon i = new ImageIcon("shr.png");
  img = new JLabel(i);
  
  
  img.setIcon(new javax.swing.ImageIcon(getClass().getResource("k.jpg"))); // NOI18N

img.setPreferredSize(new java.awt.Dimension(600,400));

img.setBounds(0, 0, 800,560);

  
  this.setLocationRelativeTo(null);
  this.setResizable(false);
  
  this.add(img);
  
   this.setLocation(300, 150);
     
        
  this.setSize(800, 560);
  this.setTitle("QUESTION FRAME");
  this.setVisible(true);
    
 
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    
    
    }
    
    
   
    
    public static void main(String[] args) {
        new QuestionFrame();
    }
    
}
