import java.util.InputMismatchException;
import java.util.Scanner;

public class  Calculator {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      try{

      
      System.out.print("Enter first number");
      int num1 = input.nextInt();
      System.out.print("Enter second number");
      int num2 = input.nextInt();

      int result = num1/num2;
      System.out.println(result);

      }catch(ArithmeticException e){
          System.out.println("number is not divide by zero ");
      }catch(InputMismatchException err){
        System.out.println("enter only number");
      }catch(Exception e){
        System.out.println("this is exception");
      }
      
      }catch(Throwable e){
        System.out.println("this is Throwable");
      }
      finally{System.out.println("Program run successfully");
      }
      
    }
  }
