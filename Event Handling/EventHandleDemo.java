package awtDemo;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class  EventHandleDemo extends Frame implements ActionListener{
	TextField textField;
	EventHandleDemo(){
		textField = new TextField();
		textField.setBounds(60,50,170,20);
		Button button = new Button("I am Java");
		button.setBounds(90,140,75,40);
		//1
		button.addActionListener(this);
		add(button);
		add(textField);
		setSize(250,250);
		setLayout(null);
		setVisible(true);
	}
	String generateString() {
		Random rand = new Random();
		String randomString = null;
		String[] myList = new String[] { "I am Simple", "I am Object-Oriented","I am Portable", "I am Platform independent", "I am Robust" };
		int INDEXn = rand.nextInt(myList.length);
		for (int i = 0; i < INDEXn; i++) {
			randomString = (String) (myList[INDEXn]);
		}
		return randomString;
		
	}
	public void actionPerformed(ActionEvent e){
		String feature = generateString();
		textField.setText(feature);
	}
	public static void main(String args[]){
		new EventHandleDemo();
	}

}


