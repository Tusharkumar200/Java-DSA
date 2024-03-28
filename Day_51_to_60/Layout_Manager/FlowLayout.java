package Layout_Manager;

import javax.swing.JFrame;

public class FlowLayout extends JFrame {

//  Layout Manager = Defines the natural layout for components within a container.
// FlowLayout = places components in a row, sized at their preferred size.
                // if the horizontal space in the container is too small,
                // the FlowLayout class user the next available row.

  JFrame frame = new JFrame();
  frame.setDefaultCloseOperation(JFram.EXIT_ON_CLOSE);
  frame.setSize(500,500);
  frame.setLayout(new FlowLayout());
  frame.setVisible(true);
}
