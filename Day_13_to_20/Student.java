import java.util.Scanner;

public class Student {
  public static void main(String[] args) {
    
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the marks");
      int marks = input.nextInt();
      
      int High =80;
      
      int Low = 50;  

      // if-else
      if(marks >=High){
        System.out.println("High");
      }
      else if(marks >=50 && marks<80 ){
        System.out.println("Moderate");
      }
      else if(marks <Low){
          System.out.println("Low");
      }
      else{
        System.out.println("out of range");
      }

           
      }
    
  }
  
}
