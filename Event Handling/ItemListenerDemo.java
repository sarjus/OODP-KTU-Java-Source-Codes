package awtDemo;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ItemListenerDemo extends Applet implements ItemListener {
	String msg = "";
	Checkbox windows, android, solaris, mac;
	public void init() {
		Font myFont = new Font ("Courier New", 1, 20);
		windows = new Checkbox("Windows", true);
		android = new Checkbox("Android",true);
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("Mac OS");
		
		android.setFont(myFont);
		windows.setFont(myFont);
		solaris.setFont(myFont);
		mac.setFont(myFont);
		
		add(windows);
		add(android);
		add(solaris);
		add(mac);
		
		windows.addItemListener(this);
		android.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	//Display current state of the check boxes.
	public void paint(Graphics g) {
		Font myFont = new Font ("Courier New", 1, 20);
		g.setFont (myFont);
		msg = "Current state: ";
		g.drawString(msg, 6, 140);
		msg = " Windows: " + windows.getState();
		g.drawString(msg, 6, 160);
		msg = " Android: " + android.getState();
		g.drawString(msg, 6, 180);
		msg = " Solaris: " + solaris.getState();
		g.drawString(msg, 6, 200);
		msg = " Mac OS: " + mac.getState();
		g.drawString(msg, 6, 220);
	}
}

