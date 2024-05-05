public class _09_largestString {

  public static void largeString(String[] fruits){
    String largest = fruits[0];
    for (int i = 0; i < fruits.length; i++) {
      if(largest.compareTo(fruits[i]) <0){
        largest = fruits[i];
      }
    }
    System.out.println(largest);
  }
  public static void main(String[] args) {
    String [] fruits={"Apple","Banana","Mango"};
    largeString(fruits);
  }
}
