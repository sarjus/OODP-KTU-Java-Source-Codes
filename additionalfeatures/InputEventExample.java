package com.sjcet.additionalfeatures;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class InputEventExample {
  public static void main(String args[]) {
    Frame frame = new Frame("InputEventExample");
    Button button = new Button("A");
    frame.add(button, BorderLayout.NORTH);
    frame.pack();
    frame.setVisible(true);
    button.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent me) {
        int mode = me.getModifiersEx();
        if ((mode & InputEvent.BUTTON1_DOWN_MASK) == InputEvent.BUTTON1_DOWN_MASK) {
          System.out.println("Left button pressed.");
        }
        if ((mode & InputEvent.BUTTON2_DOWN_MASK) == InputEvent.BUTTON2_DOWN_MASK) {
          System.out.println("Middle button pressed.");
        }
        if ((mode & InputEvent.BUTTON3_DOWN_MASK) == InputEvent.BUTTON3_DOWN_MASK) {
          System.out.println("Right button pressed.");
        }
      }

      public void mouseReleased(MouseEvent me) {
        System.out.println("mouseReleased " + me.getX());
      }
    });
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}
