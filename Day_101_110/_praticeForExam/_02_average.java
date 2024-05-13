package _praticeForExam;

public class _02_average {
  public static void main(String[] args) {
    _01_sum_of_first_n_natural_numbers natural_numbers = new _01_sum_of_first_n_natural_numbers();
    int num =5;
    int avg = natural_numbers.sumOFNumber(num);
    System.out.println("avg: "+avg/num);
  }
}
