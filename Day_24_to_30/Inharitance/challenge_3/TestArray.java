package Inharitance.challenge_3;

public class TestArray {
  public static void main(String[] args) {
    ArrayOperations opr = new ArrayOperations(new int[]{1,2,3,4});
    ArrayOperations.Statistics statistics = opr.new Statistics();
    System.out.println(statistics.mean());
  }
}
