package com.sjcet.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCounterDemo extends Frame implements ActionListener {
	private Label labelCount;//Label Component
	private TextField textFieldCount;
	private Button buttonCount;
	private int count=0;
	AWTCounterDemo() {
		setLayout(new FlowLayout());
		
		labelCount = new Label("Counter");
		add(labelCount);
		
		textFieldCount = new TextField(count+"",10);
		textFieldCount.setEditable(false);
		add(textFieldCount);
		
		buttonCount = new Button("Count");
		add(buttonCount);
		
		buttonCount.addActionListener(this);
		
		setTitle("AWT Counter");
		setSize(250,100);
		setVisible(true);
	}
public void actionPerformed(ActionEvent e) {
	++count;
	textFieldCount.setText(count +"");
}
public static void main(String[] args) {
	AWTCounterDemo app = new AWTCounterDemo();
	}
}
