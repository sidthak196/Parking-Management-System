/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author siddharth thakur
 */
public class NewApplet extends Applet implements ActionListener {
    Checkbox c1,c2;
	Button b;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        c1=new Checkbox("Red",false);
		c2=new Checkbox("Green",false);
		b=new Button("Submit");
		add(c1);
		add(c2);
		add(b);
		b.addActionListener(this);
    }

	public void paint(Graphics g)
	{	
		if(c1.getState())
                    setBackground(Color.GREEN);
		else
                    setBackground(Color.RED);
	}
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        String s=ae.getActionCommand();
		if(s.equals("Submit"))
		repaint();
//To change body of generated methods, choose Tools | Templates.
    }
}
