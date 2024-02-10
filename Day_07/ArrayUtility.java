import java.util.Scanner;

public class ArrayUtility {
  public static int[] inputArray(){
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Please enter the number of elements: ");
      int size = input.nextInt();
      int[] num  = new int[size];

      int i=0;
      while(i < size){
        System.out.println("Please enter element no "+ (i+1) + ": ");
        num[i] = input.nextInt();
        i++; 
      }
      return num;
    }
  }
  public static void displayArray(int[] numArray) {
    for(int i=0;i< numArray.length;i++){
      System.out.println(numArray[i] + " ");
    }
    System.out.println();
  }
}
