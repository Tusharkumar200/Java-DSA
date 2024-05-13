package _praticeForExam;

public class _01_sum_of_first_n_natural_numbers {

  public static int sumOFNumber(int num){
    int sum =0;
    for (int i = 0; i <= num; i++) {
       System.out.println(i);
       sum += i;
    }
    
    return sum;
  }
  public static void main(String[] args) {
    sumOFNumber(6);
  }
}
