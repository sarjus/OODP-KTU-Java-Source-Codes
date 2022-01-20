package com.sjcet.additionalfeatures;


import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
public class AdjustmentEventDemo extends JPanel  implements AdjustmentListener{
	JScrollBar bar = new JScrollBar(SwingConstants.VERTICAL, 50, 10, 0, 500);
	  
	  public AdjustmentEventDemo() {
	    super();
	    bar.addAdjustmentListener(this);

	    add(bar);
	    
	  }
	  public void adjustmentValueChanged(AdjustmentEvent evt) {

	    int newValue = bar.getValue();
	    System.out.println(newValue);
	    repaint();
	  }
	  public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    frame.add(new AdjustmentEventDemo());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(20,20, 500,500);
	    frame.setVisible(true);
	  }
}
