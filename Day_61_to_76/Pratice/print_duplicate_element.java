public class print_duplicate_element{
// practice for exam
  public static void  duplicate(int[] nums){
    
    for (int i=0 ;i<= nums.length-1;i++) {
      boolean isDuplicate = false;
      for (int j = i+1; j < nums.length; j++) {
         if(nums[i] == nums[j]){
          isDuplicate = true; 
          
        }
      }
      if(isDuplicate){
        System.out.println(nums[i]+" ");
      }
    }
    System.out.println();
  }
  public static void main(String[] args) {
    System.out.println("Duplicate in Array");
    int nums[] = {1,1,2,3,4,4,5,6,8,7,4};
    duplicate(nums);
  }
}