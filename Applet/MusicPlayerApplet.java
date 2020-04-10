package appletDemo;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

 
public class MusicPlayerApplet extends Applet implements ActionListener{
	Button b1;
	public void init(){
		b1 = new Button("Play");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Play")) {
			//playing a song(.wav format) from the same directory in which applet code file is located
			play(getDocumentBase(),"song.wav"); 
		}
			
	}
	public void paint(Graphics g){
		g.drawString("Click on the play button to play the music", 0,80);
		showStatus("Applet playing audio(.wav file)");
	}
}
