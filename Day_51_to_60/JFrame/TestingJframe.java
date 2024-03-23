import javax.swing.JFrame;

public class TestingJframe{
  public static void main(String[] args) {

    JFrame frame = new JFrame(); //creates a frame
    frame.setTitle("Tushar software");  //title of frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
    frame.setResizable(false); // prevent frame from being resize
    frame.setSize(420,420); //sets x-dimension,y-dimension of frame
    frame.setVisible(true); // make frame visible
  }
}