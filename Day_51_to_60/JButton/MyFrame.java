package JButton;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

    MyFrame(){
      JButton button = new JButton();
      button.setBounds(200,100,100,50);
      
      this.setTitle("Button testing");  
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      this.setLayout(null);
      this.setSize(500,500); 
      this.setVisible(true);
      this.add(button);
    }
    

  }
