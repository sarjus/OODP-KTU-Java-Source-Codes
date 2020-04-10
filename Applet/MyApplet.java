package appletDemo;

import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet 
{
	public void init()
	{
		System.out.println("Applet initialized");
	}
	public void start()
	{
		System.out.println("Applet execution started");
	}
	public void stop()
	{
		System.out.println("Applet execution stopped");
	}
	public void paint(Graphics g)
	{
		System.out.println("Painting...");
	}
	public void destroy()
	{
		System.out.println("Applet destroyed");
	}
}