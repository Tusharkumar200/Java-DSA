import java.util.Scanner;

public class Occurrences {

  public static void main(String[] args) {
    System.out.println("Lets find the total number in the array");
    int[] lists = ArrayUtility.inputArray();
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("enter the number that you want to count: ");
      int target = input.nextInt();
      int count = list(lists, target);
      System.out.println("total number of " + target + " is :" + count);
    }
  }

  static int list(int[] list, int target) {
    // int[] list={2,5,5,4,8,5,1,0,2,4,2,5,8,2,9,7,4,9,6,3,2,1,4,7,8,5,2,2,0};

    int count = 0;
    for (int i = 0; i < list.length; i++) {

      if (target == list[i]) {
        count++;
      }
    }
    return count;
  }
}