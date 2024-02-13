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

  public static int[][] input2DArray(){
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Please enter the number of rows: ");
      int rows = input.nextInt();
      System.out.print("Please enter the number of columns: ");
      int columns = input.nextInt();
      int[][] numArray  = new int[rows][columns];

      int i=0;
      while(i < rows){
        int j=0;
        while (j<columns) {
          
          System.out.println("Please enter element row:"+ (i+1) + ", column: "+ (j+1) + " :");
          numArray[i][j] = input.nextInt();
          j++;
        }
        i++; 
      }
      return numArray;
    }
  }
  public static void displayArray(int[] numArray) {
    for(int i=0;i< numArray.length;i++){
      System.out.println(numArray[i] + " ");
    }
    System.out.println();
  }
}
