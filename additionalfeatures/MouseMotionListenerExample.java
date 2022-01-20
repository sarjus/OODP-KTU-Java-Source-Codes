package com.sjcet.additionalfeatures;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerExample extends Frame implements MouseMotionListener {
	MouseMotionListenerExample(){  
        addMouseMotionListener(this);  
        setSize(300,300);  
        //setLayout(null);  
        setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
    Graphics g=getGraphics();  
    g.setColor(Color.BLUE);  
    g.fillOval(e.getX(),e.getY(),10,10);  
}  
public void mouseMoved(MouseEvent e) {}  
  
public static void main(String[] args) {  
    new MouseMotionListenerExample();  
}  

}
