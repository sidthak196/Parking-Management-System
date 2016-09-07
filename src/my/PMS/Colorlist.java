/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PMS;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author siddharth thakur
 */
public class Colorlist extends Frame implements ItemListener{

    /**
     * @param args the command line arguments
     */
    Choice col;
    String c[]=new String[3];
    Label l;
    Colorlist()
    {
        c[0]="GREEN";
        c[1]="RED";
        c[2]="BLUE";
       l=new Label("hello");
       col=new Choice();
       add(col);
       add(l);
       this.setVisible(true);
       this.setSize(200,200);
       this.setLayout(new FlowLayout());
       this.setForeground(Color.DARK_GRAY);
       
    }
    void call()
    {
         
         
        for(int i=0;i<=2;i++)
        {
            col.insert(c[i],i);
            col.addItemListener(this);
        }
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Colorlist c=new Colorlist();
        c.call();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        int sel=col.getSelectedIndex();
        if(sel==0)
        {
            this .setBackground(Color.GREEN);
            l.setBackground(Color.red);
        }
        if(sel==1)
        {
           // this .setBackground(Color.RED);
           //l.setBackground(Color.white);
            this.setForeground(Color.DARK_GRAY);
            
        }
        if(sel==2)
        {
            this .setBackground(Color.BLUE);
            l.setBackground(Color.red);
            l.setForeground(Color.blue);
        }
        
    }
    
}
