
package JudgingSystem;

import java.sql.Connection;
import javax.swing.JFrame;
import java.awt.EventQueue;  
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.text.MessageFormat;
import java.awt.print.* ;
import java.text.*;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class ShowQus extends JFrame{
    
    //variables
    
    private JTextField A;
    private JTextField ANS;
    private JTextField B;
    private JTextField C;
    private JTextField D;
    private JTextField Q;
    private JLabel QID;
    private JTextField Sc;
    private JButton cmd_print;
    private JComboBox comboBoxData;
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton7;
    private JDesktopPane jDesktopPane1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JMenu jMenu1;
    private JMenu jMenu10;
    private JMenu jMenu11;
    private JMenu jMenu12;
    private JMenu jMenu13;
    private JMenu jMenu14;
    private JMenu jMenu15;
    private JMenu jMenu16;
    private JMenu jMenu17;
    private JMenu jMenu18;
    private JMenu jMenu19;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenu jMenu5;
    private JMenu jMenu6;
    private JMenu jMenu7;
    private JMenu jMenu8;
    private JMenu jMenu9;
    private JMenuBar jMenuBar1;
    private JMenuBar jMenuBar2;
    private JMenuBar jMenuBar3;
    private JMenuBar jMenuBar4;
    private JMenuBar jMenuBar5;
    private JMenuBar jMenuBar6;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JScrollPane jScrollPane1;
    private JPopupMenu.Separator jSeparator1;
    private JLabel select_sub;
    private JTable table;
    private JTextField textFieldSearch;
     private JLabel img;
    
    
    
    
    
  Connection conn =null;
    public ShowQus() {
        initComponents();
        conn=Javaconnect.dbConnection();
        Refresh();
        ShowCombobox();
        
        
    }
    
    
    //refresh
     public void Refresh(){
		
		try{
			String sql = "SELECT question,a,b,c,d,ans FROM question where subject = '" + select_sub.getText()+" ' " ;
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet result = statement.executeQuery(sql);
			
			table.setModel(DbUtils.resultSetToTableModel(result));
			
			QID.setText("NO Question Selected ");
			}catch(Exception e1){
				
				e1.printStackTrace();
				
				
			}
		
	}
     
     //showcombobox
     
     
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
					
				Refresh();
					
					statement.close();
					
					
					
					
					
					
				}catch(Exception e2){
					
					e2.printStackTrace();
					
				}
				
				
        
    }                                            

    private void textFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void textFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {                                            
        // TODO add your handling code here:

        try{

            String sql = "SELECT *from question where question=?";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1,textFieldSearch.getText());

            ResultSet result = statement.executeQuery();

            //
            if(result.next()){

                 Q.setText(result.getString("question"));
                A.setText(result.getString("a"));
                B.setText(result.getString("b"));
                 C.setText(result.getString("c"));
                D.setText(result.getString("d"));
                 ANS.setText(result.getString("ans"));
                Sc.setText(result.getString("section"));
                 QID.setText(result.getString("qu_id"));
                //statement.close();
            }

            statement.close();

        }catch(Exception e2){

            e2.printStackTrace();

        }

        try{

            String sql = "SELECT *from question where question=?";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1,textFieldSearch.getText());

            ResultSet result = statement.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(result));

            statement.close();

        }catch(Exception e2){

            e2.printStackTrace();

        }

    }                                           

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Admin  l1 =new Admin();

        l1.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        Q.setText(null);
        B.setText(null);
        Sc.setText(null);
        ANS.setText(null);
        A.setText(null);
        C.setText(null);
        D.setText(null);

        textFieldSearch.setText(null);
        Refresh();

    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        //String id=(table.getModel().getValueAt(row,0 )).toString();

        int upd=JOptionPane.showConfirmDialog(null,"Do you want to Update ?","UPDATE",JOptionPane.YES_NO_OPTION );
        if(upd==0){
            try{

                String sql = "Update question set question='"+ Q.getText() +  "',d='"+ D.getText() +"' ,c='"  + C.getText() +"',b='"+ B.getText() +"' ,a='"+ A.getText() +"',section='"+ Sc.getText() +"',ans='"+ ANS.getText()+"'WHERE qu_id='"+QID.getText() +"' ";

                PreparedStatement statement = conn.prepareStatement(sql);

                statement.execute();

                JOptionPane.showMessageDialog(null,"Update  data successfully");

                statement.close();

            }catch(Exception e2){

                e2.printStackTrace();

            }

            Refresh();	//call refresh function
        }

    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        int del=JOptionPane.showConfirmDialog(null,"Do you want to Delete ?","Delete",JOptionPane.YES_NO_OPTION );
        if(del==0){
            try{

                String sql = "DELETE FROM question WHERE question='"+Q.getText() +"' ";

                PreparedStatement statement = conn.prepareStatement(sql);

                statement.execute();

                JOptionPane.showMessageDialog(null,"DELETE  data successfully");

                statement.close();

            }catch(Exception e2){

                e2.printStackTrace();

            }

            Refresh();	//call refresh function
        }

    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        try{
            Refresh();

        }catch(Exception e1){

        }
        Refresh();
    }                                        

    private void cmd_printActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:

        MessageFormat header=new MessageFormat("Employ Details");
        MessageFormat footer=new MessageFormat("page{0,number,integer}");

        try{

            table.print(JTable.PrintMode.NORMAL, header, footer);

        }catch( Exception e1){

            e1.printStackTrace();

        }
    }                                         

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:

        try{

            int row=table.getSelectedRow();
            String id=(table.getModel().getValueAt(row,0 )).toString();

            String sql = "SELECT *from question where question='"+id+"'";          //+id+ means variable
            PreparedStatement statement = conn.prepareStatement(sql);

            ResultSet result = statement.executeQuery();

            while(result.next()){

                Q.setText(result.getString("question"));
                A.setText(result.getString("a"));
                B.setText(result.getString("b"));
                C.setText(result.getString("c"));
                D.setText(result.getString("d"));
                ANS.setText(result.getString("ans"));
                Sc.setText(result.getString("section"));

                QID.setText(result.getString("qu_id"));
            }

            statement.close();

        }catch(Exception e2){

            e2.printStackTrace();

        }
    }                                  

    private void ScActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    

     
     
     
     
     
     
     
     
     
     
     
     
   
     //initialcomponents
     
     
      private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Q = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        comboBoxData = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        QID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldSearch = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        select_sub = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cmd_print = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        A = new javax.swing.JTextField();
        D = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        C = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ANS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Sc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        
       
        
        
        //
        
        
         jLabel1.setText("Question : ");
         
       jLabel1.setBounds(0, 100, 90, -1);
       
        jLabel1.getAccessibleContext().setAccessibleName("ID");

        jLabel2.setText("A");
     jLabel2.setBounds(130, 140, 40, 20);

        Q.setBackground(new java.awt.Color(153, 153, 153));
       Q.setBounds(60, 80, 820, 40);

        B.setBackground(new java.awt.Color(153, 153, 153));
        B.setBounds(220, 160, 132, 22);

        comboBoxData.setBackground(new java.awt.Color(51, 255, 255));
        comboBoxData.setToolTipText("SELECT SUBJECT");
        comboBoxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDataActionPerformed(evt);
            }
        });
       comboBoxData.setBounds(10, 52, 190,25);

        jLabel4.setText("Search:");
       jLabel4.setBounds(670, 50, 70,20);

        QID.setText("NO QUESTION SELECTED ");
        
       QID.setBounds(40, 10, 130, 20);
       
       jLabel6.setBounds(790, 450, -1, -1);

        jLabel7.setText("B");
      jLabel7.setBounds(280, 140, 99,20);

        textFieldSearch.setBackground(new java.awt.Color(204, 204, 204));
        
        textFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSearchActionPerformed(evt);
            }
        });
        textFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSearchKeyReleased(evt);
            }
        });
       textFieldSearch.setBounds(740, 50, 142, 25);

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
       jButton7.setBounds(790, 10, 90, 30);

        select_sub.setText("Question Show Panel");
       select_sub.setBounds(330, 34, 160, 20);

        jLabel3.setText("Current Subject Is:");
       jLabel3.setBounds(330, 20, 160, 20);

        jLabel5.setText("QID :");
       jLabel5.setBounds(10, 10, 60, 20);

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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 260, 870, 230);

        cmd_print.setBackground(new java.awt.Color(51, 255, 51));
        cmd_print.setText("Print");
        cmd_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_printActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cmd_print);
        cmd_print.setBounds(700, 30, 80, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(90, 230, 80, 25);

        A.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.add(A);
        A.setBounds(60, 180, 132, 22);

        D.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.add(D);
        D.setBounds(530, 180, 132, 22);

        jLabel9.setText("D");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(570, 160, 99, 16);

        C.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.add(C);
        C.setBounds(380, 180, 132, 22);

        jLabel8.setText("C");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(430, 160, 99, 16);

        ANS.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.add(ANS);
        ANS.setBounds(680, 180, 132, 22);

        jLabel10.setText("ANS");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(720, 160, 99, 16);

        Sc.setBackground(new java.awt.Color(153, 153, 153));
        Sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Sc);
        Sc.setBounds(380, 230, 132, 22);

        jLabel11.setText("S.CODE:");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(420, 210, 99, 16);

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton4);
        jButton4.setBounds(750, 230, 80, 25);

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(590, 230, 80, 25);

        jButton5.setBackground(new java.awt.Color(51, 255, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton5);
        jButton5.setBounds(240, 230, 80, 25);

       jDesktopPane1.setBounds(0, -20, 890, 530);

        
        
        
        
        
        
        
     //frame add
      this.setLayout(null);
     this.add(jLabel1);
     this.add(jLabel2);
     this.add(Q);
     this.add(B);
     this.add(comboBoxData);
     this.add(jLabel4);
     this.add(QID);
     this.add(jLabel6);
     this.add(jLabel7);
     this.add(textFieldSearch);
     this.add(jButton7);
     this.add(select_sub);
     this.add(jLabel3);
     this.add(jLabel5);
     this.add(jScrollPane1);
     this.add(jDesktopPane1);
     
     
     
     
        
        
        //frame 
       
        
   ImageIcon i = new ImageIcon("shr.png");
  img = new JLabel(i);
  
  
  img.setIcon(new javax.swing.ImageIcon(getClass().getResource("k.jpg"))); // NOI18N

img.setPreferredSize(new java.awt.Dimension(600,400));

img.setBounds(0, 0, 900,550);

  
  
   this.setLocation(300, 150);
  this.add(img);
  
  
  
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
     this.setSize(900, 550);
      this.setVisible(true);
     this.setLocationRelativeTo(null);
     this.setResizable(false);
        
        
        
        
      }
     
     
     public static void main(String[] args) {
        
         
         new ShowQus();
         
         
    }
     
     
     
   
    
}
