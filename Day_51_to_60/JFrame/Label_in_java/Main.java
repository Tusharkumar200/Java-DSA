package Label_in_java;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
  public static void main(String[] args) {

    ImageIcon image = new ImageIcon("Label_in_java/model.jpg");
    Border border = BorderFactory.createLineBorder(Color.green,3);
    JLabel label = new JLabel();  //create a label

    label.setText("Hello Bro,Do You code");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.RIGHT);  //set text position left,right,center of imageIcon
    label.setVerticalTextPosition(JLabel.TOP);  //set top ,botton ,center of ImageIcon
    label.setForeground(new Color(54,18,91));
    label.setFont(new Font("MV Boli",Font.PLAIN,20));
    label.setBackground(Color.black);
    label.setOpaque(true);
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER); //set vertical positon of icon+ text within label
    label.setHorizontalAlignment(JLabel.CENTER); //set horizontal positon of icon+ text within label


    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.getContentPane().setBackground(new Color(144,255,180));
    frame.setVisible(true);
    frame.add(label);
  }
}
