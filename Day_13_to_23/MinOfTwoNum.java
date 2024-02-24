import java.util.Scanner;

public class MinOfTwoNum {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the number 1");
      int num1 = input.nextInt();
      System.out.println("Enter the number 2");
      int num2 = input.nextInt();
      MinOfTwoNum ternarry = new MinOfTwoNum();
      int result = ternarry.minNum(num1,num2);
      System.out.println(" minimun value is "+ result);
    }

  }
   int minNum(int num1, int num2){
  
    return num1 < num2 ? num1:num2;
  }
}
