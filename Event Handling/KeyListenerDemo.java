package awtDemo;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyListenerDemo extends Applet implements KeyListener{
	char ch;
	String str;
	//link the KeyListener with Applet
	public void init(){
		addKeyListener(this);
	}
	
	// override all the 3 abstract methods of KeyListener interface 
	public void keyPressed(KeyEvent e)   {   }
	public void keyReleased(KeyEvent e)  {   }
	public void keyTyped(KeyEvent e){
		ch = e.getKeyChar();
		if(ch == 'a')
			str = "a for apple"; 
		else if(ch == 'e')
			str = "e for elephant";   
		else if(ch == 'i')
			str = "i for igloo";  
		else if(ch == 'o')
			str = "o for ox";    
		else if(ch == 'u')
			str = "u for umbrella"; 
		else
			str = "Type only vowels a, e, i, o, u only";  
		repaint();
	} 
	public void paint(Graphics g){
		Font myFont = new Font ("Courier New", 1, 17);
		g.setFont (myFont);
		g.drawString(str, 100, 150);
		showStatus("You typed " + ch + " character");
	}
}