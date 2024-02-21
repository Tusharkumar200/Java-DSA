import java.util.Scanner;

public class odd_even {
  public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the number: ");
      int num = input.nextInt();
  
      if(num % 2 !=0){
        System.out.println("odd number");
      }
      else{
        System.out.println("Even number");
      }
    }

  }
}
