public class _04_charAt {

  // for length we use length() function
  public static void printLetters(String str){
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    }
  }
  public static void main(String[] args) {
    String str = "This is Text";
    char result = str.charAt(0);
    System.out.println("position at : "+result);

    printLetters("text are : "+str);
  }
}
