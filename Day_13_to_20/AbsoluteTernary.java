import java.util.Scanner;

public class AbsoluteTernary {
  public static void main(String[] args) {
    System.out.println("Absolute Value");

    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the number: ");
      int num = input.nextInt();

      int result = num>0?num: -num;
      System.out.println("Absolute Value is : "+ result);
    }
  }
}
