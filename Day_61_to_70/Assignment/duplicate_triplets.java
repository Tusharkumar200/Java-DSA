public class duplicate_triplets {
  
  public static int duplicate(int[] nums){
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        for (int k = 0; k < nums.length; k++) {
          
          if(i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0){
            mums[j] nums[k]]
          }
        }
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    int []nums = {-1, 0, 1, 2, -1, -4};
    int result = duplicate(nums);
    System.out.println(result);

  }
}
