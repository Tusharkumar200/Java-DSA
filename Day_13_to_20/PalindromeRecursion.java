import java.util.Scanner;

public class PalindromeRecursion {
  public static void main(String[] args) {
     System.out.print("Enter the words : ");
    try (Scanner input = new Scanner(System.in)) {
      String str = input.next();

      System.out.println("Your String is "+ ((isPalindrome(str) ? "Palindrome":"not Palindrome")));
    }
  }
  static boolean isPalindrome(String str){
    if(str.length() <=1){
      return true;
      }
      int lastPos = str.length() -1;
      if(str.charAt(0) != str.charAt(lastPos)){
        return false;
      }
      String newStr = str.substring(1, lastPos);
    return isPalindrome(newStr);
  }
}
