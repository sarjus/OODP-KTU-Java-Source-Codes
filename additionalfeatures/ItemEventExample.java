package com.sjcet.additionalfeatures;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

class ItemEventExample {
  public static void main(String args[]) {
    Frame frame = new Frame("ItemEventExample");
    final Checkbox checkbox = new Checkbox("Checkbox 1");
    frame.add(checkbox, BorderLayout.NORTH);
    frame.pack();
    frame.setVisible(true);
    checkbox.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent ie) {
        if (checkbox.getState() == true) {
          JOptionPane.showMessageDialog(null, "checkbox is checked");
        } else {
          JOptionPane
              .showMessageDialog(null, "checkbox is unchecked");
        }
      }
    });
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}
