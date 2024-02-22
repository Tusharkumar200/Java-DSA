import java.util.Scanner;

public class Recursion {
  public static void main(String[] args) {
    System.out.println("factorial of a number");
    try (Scanner input = new Scanner(System.in)) {
      int number = input.nextInt();
      long fact = factorial(number);
      System.out.println("factorial of a number is : "+fact);
    }
  }
  static long factorial(int number){
    
    if(number==1){
      return 1;
    }
      return number*factorial(number -1);
    }
}
