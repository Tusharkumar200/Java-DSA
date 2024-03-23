import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;


public class MyFrame extends TestingJframe {
  
  
  MyFrame(){
    this.setTitle("Tushar software");  //title of this
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
    this.setResizable(false); // prevent this from being resize
    this.setSize(420,420); //sets x-dimension,y-dimension of this
    this.setResizable(true); // make this visible

    ImageIcon image = new ImageIcon("logo.jpg"); // create a Image-Icon
    this.setIconImage(image.getImage()); // change icone of this
    this.getContentPane().setBackground(new Color(144,255,180)); // change color of background
  }

  private Frame getContentPane() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getContentPane'");
  }

  private void setIconImage(Image image) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setIconImage'");
  }

  private void setSize(int i, int j) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setSize'");
  }

  private void setDefaultCloseOperation(int exitOnClose) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setDefaultCloseOperation'");
  }

  private void setResizable(boolean b) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setResizable'");
  }

  private void setTitle(String string) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
  }
  
}
