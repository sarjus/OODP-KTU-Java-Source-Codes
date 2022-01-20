package com.sjcet.additionalfeatures;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample extends Frame implements KeyListener{  
    Label label;  
    TextArea textArea;  
    KeyListenerExample(){  
          
        label=new Label();  
        label.setBounds(20,50,100,20);  
        textArea=new TextArea();  
        textArea.setBounds(20,80,300, 300);  
        textArea.addKeyListener(this);  
          
        add(label);add(textArea);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {  
    	label.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
    	label.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) {  
        label.setText("Key Typed");  
    }  
  
    public static void main(String[] args) {  
        new KeyListenerExample();  
    }  
}  
