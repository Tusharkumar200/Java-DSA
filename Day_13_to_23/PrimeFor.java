import java.util.Scanner;

public class PrimeFor {
  public static void main(String[] args) {
    System.out.print("Enter the number :");
    try (Scanner input = new Scanner(System.in)) {
      int num = input.nextInt();
      System.out.println(isPrime(num)?"Prime": "Not Prime");
    }
  }
  static boolean isPrime(int num){
      for (int i=2; i<num; i++){
        if(num%2==0){
          return false;
        }
        
      }
    return true;
  }
}
