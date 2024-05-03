import java.util.*;

public class input_String {
  public static void main(String[] args) {
    System.out.println("enter your name ");
    try (Scanner input = new Scanner(System.in)) {
      String name = input.nextLine();

      System.out.println("your Name is : "+ name);
    }
  }
}
