package _praticeForExam;

public class _01_sum_of_first_n_natural_numbers {

  public static void sumOFNumber(int num){
    int sum =0;
    for (int i = 0; i <= num; i++) {
       System.out.println(i);
       sum += i;
    }
    System.out.println("sum is: "+sum);
  }
  public static void main(String[] args) {
    sumOFNumber(6);
  }
}
