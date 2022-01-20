package com.sjcet.additionalfeatures;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
	    System.out.println("Command: " + e.getActionCommand());
	    int modifiers = e.getModifiers();
	    System.out.println("\tALT : "
	        + checkMod(modifiers, ActionEvent.ALT_MASK));
	    System.out.println("\tCTRL : "
	        + checkMod(modifiers, ActionEvent.CTRL_MASK));
	    System.out.println("\tMETA : "
	        + checkMod(modifiers, ActionEvent.META_MASK));
	    System.out.println("\tSHIFT: "
	        + checkMod(modifiers, ActionEvent.SHIFT_MASK));
	    Object source = e.getSource();
	    if (source instanceof JButton) {
	      JButton jb = (JButton) source;
	      System.out.println("JButton: " + jb.getText());
	    }
	  }

	  private boolean checkMod(int modifiers, int mask) {
	    return ((modifiers & mask) == mask);
	  }
	}

public class ActionEventDemo {
	public static void main(String args[]) {
	    JFrame frame = new JFrame();

	    JButton button = new JButton("Click and "
	    		+ "holding alt, control, and shift key");
	    button.addActionListener(new MyActionListener());
	    frame.add(button);
	    frame.pack();
	    frame.setVisible(true);
	  }

}
