package Assignment;

public class Task {
  public static void bubbleSort(int []nums){
      for (int i = 0; i < nums.length-1; i++) {
        for (int j = 0; j < nums.length-1; j++) {
            if(nums[j] > nums[j+1]){
              int temp = nums[j];
              nums[j] = nums[j+1];
              nums[j+1] = temp;
            }          
        }
      }
  }
  public static void printArray(int []nums){
    for (int index = 0; index < nums.length; index++) {
        System.out.println(nums[index]);
    }
  }
  public static void main(String[] args) {
    int []nums ={50,40,60,10,32,22,80};
    bubbleSort(nums);
    printArray(nums);
  }
}
