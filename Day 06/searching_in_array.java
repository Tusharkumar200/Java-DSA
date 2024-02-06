import java.util.Scanner;

public class searching_in_array {
  public static void main(String[] args) {
    System.out.println("searching in Array");

    try(Scanner input = new Scanner(System.in)){

      System.out.println("Enter the Number that Your want to search.");
      int []arr ={5,4,8,6,4,1,10,50,70,90,40};
      int num = input.nextInt();
      boolean isFound = isFound(arr,num);
      if(isFound){
        System.out.println("your number is present in the array");
      }
      else{
        System.out.println("Number is not present");
      }

    }
  }

  static boolean isFound(int[] arr,int num ){
    
    int index = 0;
    while (index<arr.length) {
      if(arr[index] == num){
        return true;
      }
      index++;
    }

    return false;
  }
}
