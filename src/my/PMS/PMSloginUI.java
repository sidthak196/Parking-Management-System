/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PMS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import my.ExceptionHandling.*;

import javax.swing.JOptionPane;

/**
 *
 * @author siddharth thakur
 */
public class PMSloginUI extends javax.swing.JFrame {

    /**
     * Creates new form PMSloginUI
     */
   
    public PMSloginUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LUserid = new javax.swing.JLabel();
        TxtUserId = new javax.swing.JTextField();
        LPassword = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        LPMS = new javax.swing.JLabel();
        Lloginp = new javax.swing.JLabel();
        Jpassword = new javax.swing.JPasswordField();
        BtnRegister = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LUserid.setText("User ID");

        TxtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUserIdActionPerformed(evt);
            }
        });

        LPassword.setText("Password");

        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        LPMS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LPMS.setText("Parking Management System");

        Lloginp.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Lloginp.setText("Login Page");

        Jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JpasswordActionPerformed(evt);
            }
        });

        BtnRegister.setText("Register");
        BtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(LPMS)
                .addGap(73, 73, 73))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(Lloginp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LPassword)
                    .addComponent(LUserid)
                    .addComponent(BtnRegister))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnLogin)
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TxtUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(Jpassword)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LPMS)
                .addGap(18, 18, 18)
                .addComponent(Lloginp)
                .addGap(24, 24, 24)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LUserid)
                    .addComponent(TxtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPassword)
                    .addComponent(Jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLogin)
                    .addComponent(BtnRegister))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(BtnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
   
   
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnExitActionPerformed
    //private final String s="Password";
     private int checkNumbers(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isDigit(c))
            {
               // JOptionPane.showMessageDialog(null,"Number");
                return 1;
        }
          
    }
          return 0;
    }
     public boolean getUser(String username)
     {
         try{ 
    Class.forName("com.mysql.jdbc.Driver"); 
     
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","siddharth"); 
     
    //here sonoo is database name, root is username and password 
     
    Statement stmt=con.createStatement(); 
     
    ResultSet rs=stmt.executeQuery("select * from login"); 
     
    while(rs.next()) 
    {
        if(rs.getNString(3).toString().equals(username))
            return true;
    }
     
    con.close(); 
     
    }catch(Exception e){ System.out.println(e);}
         return false;
}
      public boolean getPass(String pass)
     {
         try{ 
    Class.forName("com.mysql.jdbc.Driver"); 
     
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","siddharth"); 
     
    //here sonoo is database name, root is username and password 
     
    Statement stmt=con.createStatement(); 
     
    ResultSet rs=stmt.executeQuery("select * from login"); 
     
    while(rs.next()) 
    {
       
        if(rs.getNString(4).toString().equals(pass))
            return true;
    }
     
    con.close(); 
     
    }catch(Exception e){ System.out.println(e);}
         return false;
}
     public String[] getname(String username)
     {
         String arr[]=new String[3];
     try{ 
    Class.forName("com.mysql.jdbc.Driver"); 
     
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","siddharth"); 
     
    //here sonoo is database name, root is username and password 
     
    Statement stmt=con.createStatement(); 
     
    ResultSet rs=stmt.executeQuery("select * from login"); 
     
    while(rs.next()) 
    {
       
        if(rs.getNString(3).toString().equals(username))
        {
            arr[0]=rs.getNString(1);
             arr[1]=rs.getNString(2);
             arr[2]=String.valueOf(rs.getInt(5));
            return arr;
        }
    }
     
    con.close(); 
     
    }catch(Exception e){ System.out.println(e);}
         return null;
}
     
    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        String name,pass;
        
            name=(TxtUserId.getText());
           try{  
         if(1==checkNumbers(name))
            {
                Nonumbers nonum=new Nonumbers("Cannot Enter Numbers in user name");
                throw(nonum);
                
            }
         }catch(Nonumbers n)
         {
                JOptionPane.showMessageDialog(null,String.valueOf(n.getMessage()));
         }
           if(getUser(name)==true)
           {
               
            pass=String.valueOf(Jpassword.getPassword());
            
            if(getPass(pass)==true)
            {   
                    JOptionPane.showMessageDialog(null,"Welcome "+name);
                   
                   String get[]=getname(name);
                  if(get[2].equals("0"))
                  {
                   Selection select=new Selection();
                    select.na=get[0];
                    select.em=get[1];
                   System.out.println(select.na);
                     select.setVisible(true);
                        this.setVisible(false);
                  }
                  else
                  {
                      
                      Deselect d=new Deselect(get[0]);
                      this.dispose();
                      d.setVisible(true);
                  }
                  
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Incorrect password !!please try again");
            }
           }
           else
           {
               JOptionPane.showMessageDialog(null,"USER ID does not Exist!!please try again");
           }
    }//GEN-LAST:event_BtnLoginActionPerformed
   
        
    private void TxtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUserIdActionPerformed
        // TODO add your handling code here:
        // String id=TxtUserId.getText();
         
    }//GEN-LAST:event_TxtUserIdActionPerformed

    private void BtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisterActionPerformed
        // TODO add your handling code here:
        Register object=new Register();
        object.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegisterActionPerformed

    private void JpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JpasswordActionPerformed
        // TODO add your handling code here:
        
        BtnLoginActionPerformed(evt);
    }//GEN-LAST:event_JpasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PMSloginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PMSloginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PMSloginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PMSloginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PMSloginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnRegister;
    private javax.swing.JPasswordField Jpassword;
    private javax.swing.JLabel LPMS;
    private javax.swing.JLabel LPassword;
    private javax.swing.JLabel LUserid;
    private javax.swing.JLabel Lloginp;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JTextField TxtUserId;
    // End of variables declaration//GEN-END:variables
}