import java.util.Scanner;

public class FibonacciRecursion {
  public static void main(String[] args) {
    System.out.print("Enter the Number : ");
    try (Scanner input = new Scanner(System.in)) {
      int count = input.nextInt();
      for(int i=1;i<=count;i++){
        System.out.println(fibonacci(i) + " ");
      }
    }
  }
  static int fibonacci(int position){
    if(position == 1){
      return 0;
    }
    if (position == 2) {
      return 1;
    }
    return fibonacci(position -1) + fibonacci(position -2);
  }
}
