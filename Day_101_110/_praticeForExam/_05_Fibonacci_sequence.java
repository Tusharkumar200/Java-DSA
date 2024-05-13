package _praticeForExam;

class _05_Fibonacci_sequence{

  public static int  Fibonacci(int num){
    int first = 0;
    int second = 1;
    int next=first+second;
    System.out.print(first+" "+second);
    while (next <=num) {
      System.out.print(" "+ next);
      first = second;
      second = next;
      next = first + second;
    }
    System.out.print(" ");
    return 0;
  }
  public static void main(String[] args) {
    int result = Fibonacci(30);
    System.out.println(result);
  }
}