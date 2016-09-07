/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author siddharth thakur
 */
public class Radio extends Applet implements ItemListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Checkbox m,f;
    CheckboxGroup gender;
    String s;
    public void init() {
        // TODO start asynchronous download of heavy resources
        gender =new CheckboxGroup();
        m=new Checkbox("Male",false,gender);
         f=new Checkbox("Female",false,gender);
         
         add(m);
         add(f);
         m.addItemListener(this);
         f.addItemListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void itemStateChanged(ItemEvent e) {
        String st=e.getItem().toString();
        if(st.equals("Male"))
            s="Male";
        else
            s="Female";
        repaint();
    }
    public void paint(Graphics g)
    {
        String p=s+" Selected";
        g.drawString(p,100,100);
    }
}
/*Alternatively we can use g.drawString(cg.getSelectedCheckbox().getlabel(),100,100) in paint and just call paint in acionperformed*/