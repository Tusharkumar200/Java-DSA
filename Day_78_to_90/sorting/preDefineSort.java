import java.util.*;

public class preDefineSort{

  public static void preDef(int nums[]){
    for (int i = 0; i < nums.length-1; i++) {
      for (int j = 0; j < nums.length-1-i; j++) {
          if(nums[j] > nums[j+1]){
            int temp = nums[j+1];
            nums[j+1] = nums[j];
            nums[j]=temp;
          }
      }
    }
  }

  public static void printArray(int[] arr){
    for (int index = 0; index < arr.length; index++) {
        System.out.println(" "+ index);
    }
  }
  public static void main(String[] args) {
    System.out.println("preDefineSort algo");
    int nums[] = {5,1,4,8,6,0,2};
    Arrays.sort(nums);
    Arrays.sort(nums,0,3);
    // Arrays.sort(nums,Collections.reverseOrder());

    printArray(nums);
    
  }
}