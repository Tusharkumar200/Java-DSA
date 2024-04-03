public class ReverseingArray {

  // Time complexity --> O(1)
  // space complexity --> O(n)
  
  public static int reverse(int number[]){
    int first = 0;
    int last = number.length-1;

    while(first<last){
      int temp = number[last];
      number[last]= number[first];
      number[first]= temp;

      first++;
      last--;
    }
    return 0;
  }
  public static void main(String[] args) {
    System.out.println("Reversing an array");

    int number[]= {1,2,3,4,5,6};
    reverse(number);
    for (int i=0;i<number.length;i++) {
      System.out.print(" "+number[i]);
    }
    System.out.println();

  }
}
