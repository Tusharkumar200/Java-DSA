package _praticeForExam;

public class _04_factorial {

  public static int factorial(int nums){
    if(nums <= 0) return 1;
    else return nums*factorial(nums -1);
  }
  public static void main(String[] args) {
    int result = factorial(8);
    System.out.println(result);
  }
}
