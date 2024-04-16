public class print_duplicate_element{

  public static int  duplicate(int[] nums){
    for (int i=0 ;i<= nums.length;i++) {
      if(nums[i] == nums[i] +1){
        System.out.println(i);
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    System.out.println("Duplicate in Array");
    int nums[] = {1,1,2,3,4,4,5,6,8,7,4};
    int result = duplicate(nums);
    System.out.println(result);
  }
}