/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PMS;

import java.time.LocalDateTime;
import javax.mail.MessagingException;
import static my.PMS.EmailSender.sendMail;



/**
 *
 * @author siddharth thakur
 */
public class Email {
    public int slot;
    String mail;
    String name;
    Email(int s,String n,String m)
    {
        slot=s; 
        mail=m;
        name=n;
    }
    public void emailSend() throws MessagingException
    {
        EmailSender e=new EmailSender();
        String message="Greeting "+name+"!!\n"
                + "You have booked a parking space with slotno "+String.valueOf(slot)+" at Symbiosis";
        LocalDateTime ldt = LocalDateTime.now();
        String date="\nDate ->"+ldt.getDayOfMonth()+"-"+ldt.getMonth()+"-"+ldt.getYear();
        String time="\nTime ->"+ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond();
        message=message +date+time+"\n Have a great day!\n Team PMS";
        boolean s= sendMail("siddharth196@yahoo.co.in","@thakur96",message,mail);
       if(s)
           System.out.println("sent");
       else
           System.out.println("no");
    }
    
}
