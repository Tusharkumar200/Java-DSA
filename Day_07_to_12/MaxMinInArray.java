

public class MaxMinInArray {
  public static void main(String[] args) {
    System.out.println("Lets find the Max and Min in the array");
    int[] num = { 10, 20, 50, 40, 60, 70,100,200,80,99,1 };

    int Maxs = max(num);
    int Mins = min(num);
    System.out.println("Max number is : " + Maxs);
    System.out.println("Mins number is : " + Mins);
  }

  static int max(int[] num) {
    if (num.length == 0) {
      return Integer.MIN_VALUE;
    }
    int max = num[0];

    for (int i  = 1; i < num.length; i++) {
      if (max < num[i]) {
        max = num[i];
      }
    }
    return max;

  }

  static int min(int[] num) {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < num.length; i++) {
      if (min > num[i]) {
        min = num[i];

      }
    }
    return min;
  }
}
