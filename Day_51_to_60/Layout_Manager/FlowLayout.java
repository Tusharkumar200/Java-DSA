package Layout_Manager;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowLayout {

//  Layout Manager = Defines the natural layout for components within a container.
// FlowLayout = places components in a row, sized at their preferred size.
                // if the horizontal space in the container is too small,
                // the FlowLayout class user the next available row.

  public static void main(String[] args) {
    
  JFrame frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500,500);
  frame.setLayout((LayoutManager) new FlowLayout());
  frame.add(new JButton("1"));
  frame.setVisible(true);
  }
}
