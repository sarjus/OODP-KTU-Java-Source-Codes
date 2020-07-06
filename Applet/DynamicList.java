//Write a java AWT based program to display Fibonacci numbers in a List control 
//up to a limit entered using TextField. The event handling as 
//well as code for clearing the components must be provided.
package awtDemo;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DynamicList extends Applet implements ActionListener{
	//Create the awt controls
	TextField textField = new TextField();
	Label label = new Label("Enter the Limit");
	Button button = new Button("Generate");
	Button clearButton = new Button("Clear");
	public void init(){
	  
		//set the awt control positions and size
		label.setBounds(50,50, 150,20); 
        textField.setBounds(200,50, 150,20);  
        button.setBounds(350, 50, 100, 20);
        clearButton.setBounds(450, 50, 100, 20);
		//add awt controls to the frame
        add(textField);
        add(label);
        add(button);
        add(clearButton);
        //Register the button
        button.addActionListener(this);
        clearButton.addActionListener(this);
        //Set frame size
        setSize(600,600);  
        setLayout(null);  
        setVisible(true);  
     }  
	public void actionPerformed(ActionEvent e) { 
		//System.out.println(e.getActionCommand());
		//get the value from the text box in integer format
		int limit = Integer.parseInt(textField.getText());
		//Set the list size based on the text box value
		List list=new List(limit);  
		//Logic for Fibonacci Number generation
		int firtNumber=1;
		int secondNumber =0;
		int thirdNumber;
		for(int i=0;i<limit;i++) {
			thirdNumber = firtNumber+secondNumber;
			//Convert the number to string and add it into the list
			list.add(Integer.toString(thirdNumber));
			firtNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		//Set the size of the list
		list.setBounds(100,100, 75,limit*15);
		//add list to the frame
		add(list); 
		//Code to remove the element 
		if(e.getActionCommand()=="Clear"){
			list.removeAll();
			list.repaint(); 
		}
		
	}
}
