package file;
import java.io.FileWriter;

public class codeXspotWrite {
  public static void main(String[] args) {
    String fileName = "java-course.txt";
  try(FileWriter fw = new FileWriter(fileName)){
      
      fw.write("This is the best java course..");
      for(int i=1;i<101;i++){
        fw.write("* ");
      }
      fw.flush();
      System.out.println("File Written Successfully ");
     }
     catch(Exception exception){
        System.out.printf("Exception occurred %s \n",exception.getMessage());
    }
  }
}
