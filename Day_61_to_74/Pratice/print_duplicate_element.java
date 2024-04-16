public class print_duplicate_element{

  public static void duplicate(int[] nums){
    for (int i : nums) {
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    System.out.println("Duplicate in Array");
    int nums[] = {1,1,2,3,4,4,5,6,8,7,4};
    int result = duplicate(nums);
    
  }
}