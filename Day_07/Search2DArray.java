import java.util.Scanner;

public class Search2DArray {
  public static void main(String[] args) {
    System.out.println("Welcome to 2D Search \n");
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the number you want to search: ");
      int num = input.nextInt();
      int[][] numArr = ArrayUtility.input2DArray();

      boolean isFound = search(numArr, num);
      if (isFound) {
        System.out.println("Your number was found");
      } else {
        System.out.println("Your number was not  found");
      }
    }
  }

  public static boolean search(int[][] numArr, int num) {
    for (int i = 0; i < numArr.length; i++) {
      for (int j = 0; j < numArr.length; j++) {
        if (num == numArr[i][j]) {
          return true;
        }
      }
    }
    return false;
  }
}
