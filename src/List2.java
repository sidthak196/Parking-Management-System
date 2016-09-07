
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author siddharth thakur
 */
public class List2 extends Frame implements ActionListener, ItemListener{
    List l1;
    List l2;
    List2()
    {
        l1=new List(4);
        l2=new List(4);
       l1.add("java");
       l1.add("php");
       l1.add("d");
       l1.add("e");
       add(l1);
       add(new Button(">>"));
       add(l2);
       this.setVisible(true);
       this.setSize(200,200);
       this.setLayout(new FlowLayout());
       this.setForeground(Color.DARK_GRAY);
       l1.addItemListener(this);
       addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    /**
     * @param args the command line arguments
     */
    void call()
    {
                        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        List2 b=new List2(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String s=e.getActionCommand();
        if(s.equals(">>"))
        {
            String s1[]=l1.getSelectedItems();
            for(int i=0;i<s1.length;i++)
            {
                l2.add(s1[i]);
        }
//To change body of generated methods, choose Tools | Templates.
    }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
