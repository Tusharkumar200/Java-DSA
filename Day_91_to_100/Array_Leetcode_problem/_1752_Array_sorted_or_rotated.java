public class _1752_Array_sorted_or_rotated {

public static boolean check(int[] nums){
  int Gcount =0; 

  for (int i = 1; i < nums.length; i++) {
    if(nums[i -1 ]> nums[i]){
      Gcount++;
    }
  }
  int last = nums.length-1;
  if(nums[last] > nums[0]){
    Gcount++;
  }
  return Gcount <=1;
}

  public static void main(String[] args) {
    int nums[]={3,4,5,1,2};
    // int nums[]={1,8,4,2,5,9,0,1};
    
    System.out.println(check(nums));
  }
}
