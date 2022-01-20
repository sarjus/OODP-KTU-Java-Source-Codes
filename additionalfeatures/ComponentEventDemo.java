package com.sjcet.additionalfeatures;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ComponentEventDemo {

	public static void main(String[] args) {Frame frame = new Frame("ComponentEventExample");
    TextArea txtArea = new TextArea();
    Checkbox checkbox1 = new Checkbox("Checkbox 1");
    Checkbox checkbox2 = new Checkbox("Checkbox 2");
    Panel p = new Panel();
    p.add(checkbox1);
    p.add(checkbox2);
    frame.add(txtArea, BorderLayout.CENTER);
    frame.add(checkbox1, BorderLayout.NORTH);
    frame.add(checkbox2, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
    ComponentListener componentListener = new MyComponentListener();
    frame.addComponentListener(componentListener);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}

class MyComponentListener implements ComponentListener {
  public void componentShown(ComponentEvent evt) {
    System.out.println("componentShown");
  }

  public void componentHidden(ComponentEvent evt) {
    System.out.println("componentHidden");
  }

  public void componentMoved(ComponentEvent evt) {
    System.out.println("componentMoved");
  }

  public void componentResized(ComponentEvent evt) {
    System.out.println("componentResized");
  }
}
