public class insertionSort {
  public static void insertion(int[] nums){
    for (int i = 1; i < nums.length; i++) {
      int curr=nums[i];
      int pre = i-1;

      // finding out the correct position to insert
      while (pre >=0 && nums[pre] > curr) {
        nums[pre+1] = nums[pre];
        pre--;
      }
      // instertion
      nums[pre+1] =curr;

    }
  }
  public static void printArray(int [] nums){
    for (int i = 0; i < nums.length-1; i++) {
      System.out.println(nums[i]);
    }
  }

  public static void main(String[] args) {
    
  
  int nums[] = {5,1,4,8,6,10,2};
  insertion(nums);
  printArray(nums);
  }
}

