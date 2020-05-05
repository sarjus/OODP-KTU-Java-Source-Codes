package awtDemo;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class EventDelegationDemo extends Applet implements KeyListener {
	String msg="";
	public void init(){
		//Registering Keyboard Listener Interface
		addKeyListener(this);
	}
	// override all the 3 abstract methods of KeyListener interface 
	public void keyPressed(KeyEvent k){
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent k){
		showStatus("Key Realesed");
	}
	public void keyTyped(KeyEvent k){
		msg = msg+k.getKeyChar();
		repaint();
	}
	//Method to display Applet Window
	public void paint(Graphics g)
	{
		g.drawString(msg, 20, 40);
	}

}
