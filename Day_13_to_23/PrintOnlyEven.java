import java.util.Scanner;

public class PrintOnlyEven {
  public static void main(String[] args) {

    System.out.print("Enter the Number : ");
    try (Scanner input = new Scanner(System.in)) {
      int num = input.nextInt();

      for (int i = 1; i <= num; i++) {
        if(i%2!=0){
          continue;
        }
        System.out.println(i);
      }
    }
  }
}
