import java.util.Scanner;

public class Student {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the marks");
      int marks = input.nextInt();

      String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
      System.out.println(category);

    }

  }

}
