package Layout_Manager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.awt.FlowLayout;


public class _FlowLayout {

//  Layout Manager = Defines the natural layout for components within a container.
// FlowLayout = places components in a row, sized at their preferred size.
                // if the horizontal space in the container is too small,
                // the FlowLayout class user the next available row.

  public static void main(String[] args) {
    
  JFrame frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500,500);
  
  frame.setLayout(new FlowLayout(FlowLayout.LEADING));
  

  frame.add(new JButton("1"));
  frame.add(new JButton("2"));
  frame.add(new JButton("3"));
  frame.add(new JButton("4"));
  frame.add(new JButton("5"));
  frame.add(new JButton("6"));
  frame.setVisible(true);
  }
}
