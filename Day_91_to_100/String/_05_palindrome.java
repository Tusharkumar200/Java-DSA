public class _05_palindrome {

  // T.c => O(n)
  public static boolean isPalindrom(String str){

    int n = str.length();
    for (int i = 0; i < n/2; i++) {
      
      if(str.charAt(i) != str.charAt(n-1-i)){
        return false;
      }
          
  }

    return true;
  }
  public static void main(String[] args) {
    String str = "racecar";
    

    if (isPalindrom(str) == true) {
      System.out.println(" this is palindrome ");
    }
    else{
      System.out.println("not ");
    }
    
}
}
