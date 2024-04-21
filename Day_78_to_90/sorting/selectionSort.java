public class selectionSort {
  
  // Time complexity --> O(n^2)

  public static void Selection(int[] nums){
    for (int i = 0; i < nums.length; i++) {
      int minPos = i;
      for (int j = i+1; j < nums.length-1; j++) {
        
        if(nums[minPos] > nums[j]){ // change the < sign to print in dassending order
          minPos = j;
        }
      }
      // swap
      int temp = nums[minPos];
      nums[minPos]= nums[i];
      nums[i] = temp;
    }
  }

  public static void printArray(int [] nums){
    for (int i = 0; i < nums.length-1; i++) {
      System.out.println(nums[i]);
    }
  }
  
  public static void main(String[] args) {
    int nums[] = {5,1,4,8,6,10,2};
    Selection(nums);
    printArray(nums);

  }
}