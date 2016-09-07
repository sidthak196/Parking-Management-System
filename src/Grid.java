
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javafx.scene.control.PasswordField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author siddharth thakur
 */
public class Grid extends Frame implements ActionListener {

    /**
     * @param args the command line arguments
     */Button b;
    Grid()
    {   
        setLayout(new GridLayout(3,2));
        add(new Label("Name"));
        add(new TextField(""));
        add(new Label("password"));
        add(new TextField());
        add(new Button("OK"));
        b=new Button("Cancel") ;
        add(b);
        b.addActionListener(this);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Grid s=new Grid();
        s.setSize(200,200);
        s.setVisible(true);
    }
    
}
