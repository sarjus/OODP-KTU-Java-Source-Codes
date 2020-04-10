package appletDemo;
import java.applet.*;
import java.awt.*;
public class HelloWorldApplet {
	public void paint (Graphics g) {
	      g.drawString ("Hello World, Welcome to Applet World", 25, 50);
	      g.repaint();
	   }

}
