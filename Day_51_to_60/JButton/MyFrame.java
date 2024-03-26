package JButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
  JButton button;

    MyFrame(){
      ImageIcon icon =new ImageIcon("JButton/logo.jpg");

      button = new JButton();
      button.setBounds(100,100,250,100);
      button.setText("Click Me...");
      button.setFocusable(false);
      button.addActionListener(e -> System.out.println("its is working bro."));
      button.setIcon(icon);
      button.setHorizontalTextPosition(JButton.CENTER);
      button.setFont(new Font("Comic Sans", Font.BOLD,25));
      button.setForeground(Color.yellow);


      this.setTitle("Button testing");  
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      this.setLayout(null);
      this.setSize(500,500); 
      this.setVisible(true);
      this.add(button);
    }

  
  

  }
