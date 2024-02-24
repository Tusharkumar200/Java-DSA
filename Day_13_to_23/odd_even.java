import java.util.Scanner;

public class odd_even {
  public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the number: ");
      int num = input.nextInt();
  
      String result = num %2 ==0?"Even":"Odd";
      System.out.println("Number is "+ result);
    }

  }
}
