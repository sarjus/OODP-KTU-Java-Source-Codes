package awtDemo;


import java.awt.*;
import java.awt.event.*;
class AdjustmentListenerDemo extends Frame implements AdjustmentListener{
	Scrollbar sb;
	public AdjustmentListenerDemo(){
		setTitle("Scrollbar with AdjustmentListener Demo");
        setLayout(new FlowLayout());
       
        // Create and add scrollbar
        sb=new Scrollbar();
        add(sb);
       // Set the size of the scroll bar
        sb.setPreferredSize(new Dimension(50,250));
       
        // Register the listener with the scroll bar
        sb.addAdjustmentListener(this);
       
        setSize(400,400);
        setVisible(true);
    }
   
      
    // Called whenever the scrollbar value changes
    public void adjustmentValueChanged(AdjustmentEvent ae){
        // Update the title
        setTitle("Current value: "+ae.getValue());
    }
   
    public static void main(String args[]){
        new AdjustmentListenerDemo();
    }
}

