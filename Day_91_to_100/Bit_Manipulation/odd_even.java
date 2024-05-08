package Bit_Manipulation;

public class odd_even {
  
  public static void check(int num){
      int bitMask =1;
      if((num & bitMask) ==0){
        System.out.println(num+" this is even number");
      }
      else{
        System.out.println(num+" this is odd number");
      }
  }
  public static void main(String[] args) {
    check(5);
    check(0);
    check(4);
    check(-4);
  }
}
