package file;

import java.io.FileReader;

public class codeXspotRead {
  public static void main(String[] args) {
    String fileName = "java-course.txt";

    try(FileReader reader = new FileReader(fileName)){
      int read =0;
      do{
        read = reader.read();
        System.out.println((char)read);
      }while(read != -1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
