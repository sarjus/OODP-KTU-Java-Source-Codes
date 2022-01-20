package com.sjcet.additionalfeatures;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListnerInterfaceDemo extends Frame implements MouseListener{

	public MouseListnerInterfaceDemo(){
		addMouseListener(this); // link the frame with ML
	    setSize(300,300);
	    setVisible(true);
	}
	
	// override the 5 abstract methods of ML
	public void mousePressed(MouseEvent e){
		// do some action to distinguish from other methods
		setBackground(Color.red);
		System.out.println("Mouse is Pressed");
	}
	public void mouseReleased(MouseEvent e){
		setBackground(Color.blue);
	    System.out.println("Mouse is Released");   
	}
	public void mouseClicked(MouseEvent e){
	    setBackground(Color.green);
	    System.out.println("Mouse is Clicked");
	}
	public void mouseEntered(MouseEvent e){
		setBackground(Color.cyan);
	    System.out.println("Mouse is Entered");
	}
	public void mouseExited(MouseEvent e){
		setBackground(Color.magenta);
	    System.out.println("Mouse is Exited");
	}
	public static void main(String args[]){
	     new MouseListnerInterfaceDemo();
	}

}
