package com.sjcet.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button add,sub,mul,div,cls,eq;
	String s,s1,s2,s3,s4;
	TextField textField;
	int number1, number2, result;
 	Calculator(){
 		GridLayout gridLayout = new GridLayout(4,5);
 		setLayout(gridLayout);
 		textField = new TextField(10);
 		add(textField);
 		b0= new Button("0");
 		add(b0);
 		b1= new Button("1");
 		add(b1);
 		b2= new Button("2");
 		add(b2);
 		b3= new Button("3");
 		add(b3);
 		b4= new Button("4");
 		add(b4);
 		b5= new Button("5");
 		add(b5);
 		b6= new Button("6");
 		add(b6);
 		b7= new Button("7");
 		add(b7);
 		b8= new Button("8");
 		add(b8);
 		b9= new Button("9");
 		add(b9);
 		add= new Button("+");
 		add(add);
 		sub= new Button("-");
 		add(sub);
 		mul= new Button("x");
 		add(mul);
 		div= new Button("/");
 		add(div);
 		eq= new Button("=");
 		add(eq);
 		cls= new Button("C");
 		add(cls);
 		setVisible(true);
 		setSize(500,500);
 		
 		b0.addActionListener(this);
 		b1.addActionListener(this);
 		b2.addActionListener(this);
 		b3.addActionListener(this);
 		b4.addActionListener(this);
 		b5.addActionListener(this);
 		b6.addActionListener(this);
 		b7.addActionListener(this);
 		b8.addActionListener(this);
 		b9.addActionListener(this);
 		add.addActionListener(this);
 		sub.addActionListener(this);
 		mul.addActionListener(this);
 		div.addActionListener(this);
 		cls.addActionListener(this);
 		eq.addActionListener(this);
 		
	}
 	public void actionPerformed(ActionEvent e) {
 		s=e.getActionCommand();
 		if(s.equals("0")|| s.equals("1")|| s.equals("2")|| s.equals("3")
 				|| s.equals("4")|| s.equals("5")|| s.equals("6")|| s.equals("7")|| s.equals("8")
 				|| s.equals("9")) {
 			s1=textField.getText()+s;
 			textField.setText(s1);
 		}
 		if(s.equals("+")) {
 			s2=textField.getText();
 			textField.setText("");
 			s3="+";
 		}
 		if(s.equals("-")) {
 			s2=textField.getText();
 			textField.setText("");
 			s3="-";
 		}
 		if(s.equals("x")) {
 			s2=textField.getText();
 			textField.setText("");
 			s3="x";
 		}
 		if(s.equals("/")) {
 			s2=textField.getText();
 			textField.setText("");
 			s3="/";
 		}
 		if(s.equals("=")) {
 			s4=textField.getText();
 			number1=Integer.parseInt(s2);
 			number2 = Integer.parseInt(s4);
 			if(s3.equals("+")) {
 				result = number1+number2;
 			}
 			if(s3.equals("-")) {
 				result = number1-number2;
 			}
 			if(s3.equals("x")) {
 				result = number1*number2;
 			}
 			if(s3.equals("/")) {
 				result = number1/number2;
 			}
 			textField.setText(String.valueOf(result));
 		}
 		if(s.equals("C")) {
 			textField.setText("");
 		}
 		
 	}
 	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	}

}
