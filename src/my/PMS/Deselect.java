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
import javax.swing.JOptionPane;

/**
 *
 * @author siddharth thakur
 */
public class Deselect extends javax.swing.JFrame {

    /**
     * Creates new form Deselect
     */
  String na;
    public Deselect(String s) {
        initComponents();
        populate(s);
        na=s;
    }
    void populate(String n)
    {
        try{ 
    Class.forName("com.mysql.jdbc.Driver"); 
     
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","siddharth"); 
     
    //here sonoo is database name, root is username and password 
     
    Statement stmt=con.createStatement(); 
     
    ResultSet rs=stmt.executeQuery("select * from login"); 
     
    while(rs.next()) 
    {
     //System.out.println(rs.getNString(1).toString()+"-"+n);    
        if(rs.getNString(1).toString().equals(n))
        {
            Txtname.setText(rs.getNString(1));
            Textmail.setText(rs.getNString(2));
            TextUname.setText(rs.getNString(3));
            TxtSlot.setText(String.valueOf(rs.getInt(5)));
            //System.out.println(rs.getint(1));
        }
    //System.out.println(rs.getNString(1).toString()); 
    }
    con.close(); 
     
    }catch(Exception e){ System.out.println(e);} 
     
    } 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelName = new javax.swing.JLabel();
        Txtname = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        Textmail = new javax.swing.JTextField();
        labelUname = new javax.swing.JLabel();
        TextUname = new javax.swing.JTextField();
        LabelSlot = new javax.swing.JLabel();
        TxtSlot = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelName.setText("Name ");

        Txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtnameActionPerformed(evt);
            }
        });

        labelEmail.setText("E-mail ID");

        labelUname.setText("User Name");

        LabelSlot.setText("Parking slot");

        TxtSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSlotActionPerformed(evt);
            }
        });

        jButton1.setText("Leave Parking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelName, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(labelUname, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(LabelSlot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextUname, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(Textmail, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(Txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(TxtSlot)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(Txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(Textmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUname)
                    .addComponent(TextUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSlot)
                    .addComponent(TxtSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtnameActionPerformed

    private void TxtSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSlotActionPerformed

    private void updateData(String n) {
             try{ 
    Class.forName("com.mysql.jdbc.Driver"); 
     
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","siddharth"); 
     
    //here sonoo is database name, root is username and password 
     
    Statement stmt=con.createStatement(); 
     
    ResultSet rs=stmt.executeQuery("select * from login"); 
     
    String updateString
                           = "update login set slot = ? where name = ?";
                   System.out.println("2");
                  java.sql.PreparedStatement updateSales = con.prepareStatement(updateString);
             
                 updateSales.setString(1,"0");
                  updateSales.setString(2,n);
            updateSales.executeUpdate();
                 System.out.println("3");
          
             if (updateSales != null) {
            updateSales.close();
            
        }
    //System.out.println(rs.getNString(1).toString()); 
    con.close(); 
    }
    
    
       catch(Exception e){ System.out.println(e);} 
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        release(Integer.parseInt(TxtSlot.getText()));
        updateData(na);
        System.out.println("parking freed");
        System.out.println("Thank you Deselect");
        JOptionPane.showMessageDialog(null, "Thank You!! Space has been freed");
        System.exit(0);
       
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean release(int s)
    {
        try{ 
    Class.forName("com.mysql.jdbc.Driver"); 
     
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","siddharth"); 
     
    //here sonoo is database name, root is username and password 
     
    Statement stmt=con.createStatement(); 
     
    ResultSet rs=stmt.executeQuery("select * from parking"); 
     
  while(rs.next()) 
  {
   //println(rs.getNString(1));
   if(Integer.parseInt(rs.getString(1))==s)
           {
               if(!rs.getNString(2).equals("empty"))
               {
                   String use="empty";
                   String s1=String.valueOf(s);
                   //System.out.println("1");
                   String updateString
                           = "update parking set vacant = ? where slot = ?";
                  // System.out.println("2");
                  java.sql.PreparedStatement updateSales = con.prepareStatement(updateString);
             
                 updateSales.setString(1,use );
                  updateSales.setString(2,s1);
            updateSales.executeUpdate();
                 //System.out.println("3");
          
             if (updateSales != null) {
            updateSales.close();
            
        } 
           
                   //con.createStatement().executeQuery("update parking set vacant = \'in use\' where slot = "+String.valueOf(s));
                    return true;
               }
           }
  }  
    con.close(); 
     
    }catch(Exception e){ System.out.println(e);} return false;
    }
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
            java.util.logging.Logger.getLogger(Deselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deselect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Deselect d= new Deselect("Siddharth");
                       // d.nam="Siddharth";
                       d.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelSlot;
    private javax.swing.JTextField TextUname;
    private javax.swing.JTextField Textmail;
    private javax.swing.JTextField TxtSlot;
    private javax.swing.JTextField Txtname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelUname;
    // End of variables declaration//GEN-END:variables

    
}