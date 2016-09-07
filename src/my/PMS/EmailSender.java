/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PMS;
//import javax.mail.

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/**
 *
 * @author siddharth thakur
 */
public class EmailSender {
    public static boolean sendMail(String from,String password,String mes,String to) throws MessagingException
    {
     
            String host="smtp.mail.yahoo.com";
            Properties prop=System.getProperties();
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.host",host);
            prop.put("mail.smtp.user",from);
            prop.put("mail.smtp.password", password);
            prop.put("mail.smtp.port",587);
            prop.put("mail.smtp.auth", "true");
            Session session=Session.getDefaultInstance(prop,null);
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
  
    String filename = "Ticket.txt";//change accordingly 
    DataSource source = new FileDataSource(filename); 
    
  try{  
    messageBodyPart2.setDataHandler(new DataHandler(source));  
    messageBodyPart2.setFileName(filename); 
    
  }catch(Exception e){
      System.out.println(e.getMessage());
  }
   BodyPart messageBodyPart1 = new MimeBodyPart();  
    messageBodyPart1.setText(mes);  
   Multipart multipart = new MimeMultipart();    
    multipart.addBodyPart(messageBodyPart2);
    multipart.addBodyPart(messageBodyPart1);
            MimeMessage message=new MimeMessage(session);
              try {
            message.setFrom(new InternetAddress(from));
            InternetAddress toAddress=new InternetAddress(to);
            message.addRecipient(Message.RecipientType.TO, toAddress);
            message.setSubject("Hello From PMS!!");
            message.setText(mes);
             message.setContent(multipart ); 
            Transport tran=session.getTransport("smtp");
            tran.connect(host,from,password);
            tran.sendMessage(message, message.getAllRecipients());
            tran.close();
            return true;
            
        } catch (MessagingException ex) {
            Logger.getLogger(EmailSender.class.getName()).log(Level.SEVERE, null, ex);
        }
              return false;
    }
    /*public static void main(String args[])
    {
       boolean s= sendMail("siddharth196@yahoo.co.in","@thakur96","mast email bheja java se!!:P","shivam.kumar@sitpune.edu.in");
       if(s)
           System.out.println("sent");
       else
           System.out.println("no");
            
    }*/
}
