import java.util.Scanner;

public class MergeTwoSortedArray {
  public static void main(String[] args) {
    System.out.println("Welcome to Merging Sorted Arrays \n");
    int[] arr1 = inputArray();
    int[] arr2 = inputArray();
    System.out.println("line 6");
    int[] mergedArr = merge(arr1,arr2);
    System.out.println("Your merged array is: ");
    System.out.println("line 8");
    ArrayUtility.displayArray(mergedArr);
  }

  
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

    public static int[] merge(int[] arr1,int[] arr2){
          int newSize = arr1.length + arr2.length;
          int[] newArr = new int[newSize];
          int i=0,j=0,k=0;
          while(i<arr1.length || j<arr2.length){
            if(j==arr2.length || (i<arr1.length && arr1[i]<arr2[j])){
              newArr[k] =arr1[i];
              i++;
              k++;
            }
            else{
              newArr[k] =arr2[j];
              k++;
              j++;

            }
          }
          return newArr;
    }
}
