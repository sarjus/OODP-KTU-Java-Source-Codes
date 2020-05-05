package awtDemo;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerDemo extends Frame implements ActionListener {
	TextField text = new TextField(20);
	Button b;
	private int numClicks = 0;
	ActionListenerDemo() {
		//used to arrange the components in a line
		setLayout(new FlowLayout());
		//Create a new button and add it to layout 
		b = new Button("Click me");
		add(b);
		//add textfield  to layout
		add(text);
		//Register the listener with the source(button)
		b.addActionListener(this);
    }
	// override the abstract methods of ActionListener interface 
	public void actionPerformed(ActionEvent e) {
		numClicks++;
		text.setText("Button Clicked " + numClicks + " times");
    }
	public static void main(String[] args) {
		ActionListenerDemo myWindow = new ActionListenerDemo();
		myWindow.setSize(350,100);
		myWindow.setVisible(true);
    }
}
