package _praticeForExam;

public class _03_largestInArray {

  public static void largest(int[] nums){
    
    int largest =0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] > largest){
        largest = nums[i];
      }
     
    }
    System.out.println(largest);
    
  }
  public static void main(String[] args) {
    int[] nums = {10,15,45,87,3,2,88,22,77,80,100,104,115};
    largest(nums);
  }
}
