package file.challenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter file name: ");
      String fileName = input.next();

      try(FileReader reader = new FileReader(fileName)){
        int read;
        while((read = reader.read()) != -1){
          System.out.println((char)read);
        }

      }catch(FileNotFoundException e){
        System.out.printf("%s  Not Found..",fileName);
      }
      catch(IOException e){
        System.out.printf("Error Occure %s",e.getMessage());
      }
    }
  }
}
