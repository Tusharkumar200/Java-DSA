package JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
  JButton button;
  JLabel label;
    MyFrame(){
      ImageIcon icon =new ImageIcon("JButton/logo.jpg");
      ImageIcon icon2 =new ImageIcon("JButton/logo.jpg");

      label = new JLabel();
      label.setIcon(icon2);
      label.setBounds(150,250,150,150);
      label.setVisible(false);

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
      this.add(label);
    }

    public void actionPerformed(ActionEvent e){
          if(e.getSource() == button){
            label.setVisible(true);
          }
    } 
  

  }
