package com.sjcet.additionalfeatures;
import java.awt.*;
import java.awt.event.*;

public class FocusAdapterExample {
  Label label;

  public FocusAdapterExample() {
    Frame frame = new Frame();
    Button Okay = new Button("Okay");
    Button Cancel = new Button("Cancel");
    Okay.addFocusListener(new MyFocusListener());
    Cancel.addFocusListener(new MyFocusListener());
    frame.add(Okay, BorderLayout.NORTH);
    frame.add(Cancel, BorderLayout.SOUTH);
    label = new Label();
    frame.add(label, BorderLayout.CENTER);
    frame.setSize(450, 400);
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public class MyFocusListener extends FocusAdapter {
    public void focusGained(FocusEvent fe) {
      Button button = (Button) fe.getSource();
      label.setText(button.getLabel());
    }
  }

  public static void main(String[] args) {
    FocusAdapterExample fc = new FocusAdapterExample();
  }
}