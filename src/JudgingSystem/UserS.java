
package JudgingSystem;

//import static Q2aSystem.Ques_subject.admin_Ques_sub_username;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;



public class UserS extends JFrame {
     private JLabel img;
        private javax.swing.JComboBox comboBoxData;
    private javax.swing.JButton go_to_questionFrame;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel select_sub;
    Connection conn =null;
    
  public   UserS()
     {
        conn=Javaconnect.dbConnection();
        initComponents();
        
       ShowCombobox();
     }
  
  public void ShowCombobox(){
		
		try{
			String sql = "SELECT * FROM subject";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			//table.setModel(DbUtils.resultSetToTableModel(result));
			
			while(result.next()){
			
				
				comboBoxData.addItem(result.getString("sub"));
				
				
			}
			
			
			}catch(Exception e1){
				
				e1.printStackTrace();
				
				
			}
		
		
		
		
		
	}
  
  
  
  
   private void comboBoxDataMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    } 
   
   
   
   
   
   
    private void comboBoxDataActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:

        try{

            String sql = "SELECT * from subject where sub=?  ";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1,(String)comboBoxData.getSelectedItem());

            ResultSet result = statement.executeQuery();

            while(result.next()){

                select_sub.setText(result.getString("sub"));
                //name.setText(result.getString("name"));
                //email.setText(result.getString("email"));

            }

            statement.close();

        }catch(Exception e2){

            e2.printStackTrace();

        }

    }                                            

    private void go_to_questionFrameActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:

        question qu =new question();
        //QuestionFrame .subject.setText(select_sub.getText());
        //QuestionFrame .admin_jlabel2.setText(admin_Ques_sub_username.getText());
       qu.setVisible(true);
        this.setVisible(false);

    }                                                   

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Profile q2 =new Profile();

        q2.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }  
   
  
  
  
  
   private void initComponents() {

        comboBoxData = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        select_sub = new javax.swing.JLabel();
        go_to_questionFrame = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

       
     
    comboBoxData.setBounds(40, 80, 190, 30);
        comboBoxData.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Sub" }));
        comboBoxData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
          comboBoxDataMouseClicked(evt);
            }
        });
        comboBoxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               comboBoxDataActionPerformed(evt);
            }
        });
      
        jLabel2.setText("Subject:");
       jLabel2.setBounds(280, 80, 100, 30);
       
       
        select_sub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        select_sub.setBounds(360, 80, 180, 30);
        
        
        go_to_questionFrame.setText("Go To");
       go_to_questionFrame.setBounds( 480, 120,90,30); 
       
        go_to_questionFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              go_to_questionFrameActionPerformed(evt);
            }
        });
      
        
        
        
        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("BACK");
        
       jButton2.setBounds( 260, 180, 90, 30);
       
       
       
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
            }
        });
        
        this.setLayout(null);
        
        this.add(comboBoxData);
        this.add(jLabel2);
        this.add(select_sub);
        this.add(go_to_questionFrame);  
        this.add(jLabel1);
        this.add(jButton2);
        
        
         ImageIcon i = new ImageIcon("shr.png");
  img = new JLabel(i);
  
  
  img.setIcon(new javax.swing.ImageIcon(getClass().getResource("k.jpg"))); // NOI18N

  
   this.setSize(600,400);
  
img.setPreferredSize(new java.awt.Dimension(600,400));

img.setBounds(0, 0, 621,452);

  this.setLocationRelativeTo(null);
  this.setResizable(false);
  
  
  this.add(img);
        
         this.setLocation(300, 150);
        
  this.setSize(621, 452);
  this.setTitle("user");
  this.setVisible(true);
    
 
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
     
       
    }
  
  
  
  
  
  
  
  
  
  
     
     
     public static void main(String[] args) {
         
         new UserS();
        
    }
    
}
