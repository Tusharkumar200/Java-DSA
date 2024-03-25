package JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
  public static void main(String[] args) {
    // JPanel --> A GUI component that functions as a container to hold other components
    
    JLabel label = new JLabel();
    label.setText("Hii bro..👍");
    label.setVerticalAlignment(JLabel.BOTTOM);
    label.setHorizontalAlignment(JLabel.RIGHT);

    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.blue);
    redPanel.setBounds(250,0,250,250);

    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.red);
    bluePanel.setBounds(0,0,250,250);

    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.green);
    greenPanel.setBounds(0,250,500,250);
    greenPanel.setLayout(new BorderLayout());

    JFrame frame = new JFrame(); //creates a frame
    frame.setTitle("color box");  //title of frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
    frame.setLayout(null);
    frame.setResizable(false); // prevent frame from being resize
    frame.setSize(750,750); //sets x-dimension,y-dimension of frame
    frame.add(redPanel);
    greenPanel.add(label);
    frame.add(bluePanel);
    frame.add(greenPanel);
    frame.setVisible(true); 

  }
}
