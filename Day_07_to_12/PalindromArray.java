public class PalindromArray {
  public static void main(String[] args) {
    System.out.println("Welcome to Palindrome Checker \n");
    int[] numArr = ArrayUtility.inputArray();
    boolean isPalin = isPalindrome(numArr);
    if(isPalin){
      System.out.println("Your array is Palindrome");
    }
    else{
      System.out.println("Your array is not Palindrome");
    }
  }

  public static boolean isPalindrome(int[] numArr){
    for(int i=0; i<numArr.length/2; i++){
      if(numArr[i] != numArr[numArr.length -1 -i]){
        return false;
      }
    }
    return true;
  }
}
