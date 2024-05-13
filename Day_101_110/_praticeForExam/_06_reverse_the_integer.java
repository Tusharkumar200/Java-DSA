package _praticeForExam;

public class _06_reverse_the_integer {

  public static int reverse(int num){
    int reverse =0;
    while(num !=0){
      int digit = num %10;
      reverse *= 10 + digit;
      num /=10;
    }
    System.out.println( reverse);
    return reverse;
   
  }
  public static void main(String[] args) {
    int num = 12345;
        
    System.out.println("Reversed number: " + reverse(num));
    
  }

}
