
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
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
public class NewMain extends Frame{

    /**
     * @param args the command line arguments
     */
    NewMain()
    {
        setLayout(new BorderLayout());
        add(new Button("Button1"),BorderLayout.CENTER);
        add(new Button("Button2"),BorderLayout.EAST);
        add(new Button("Button3"),BorderLayout.WEST);
        add(new Button("Button4"),BorderLayout.NORTH);
        add(new Button("Button5"),BorderLayout.SOUTH);
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
        NewMain ob=new NewMain();
        ob.setSize(200, 200);
        ob.setVisible(true);
    }
    
}
