import java.util.Arrays;

public class _283_moves_Zero {
  
  public static void approch1(int[] nums){
    int index =0; 
    for(int i=0; i<nums.length;i++){
    if(nums[i] !=0){
  
      nums[index] = nums[i];
      index++;
      }
    }
    for (int i = index; i < nums.length; i++) {
      nums[i]=0;
    }
  }

  public static void approch2_bubble(int[] nums){
    int index = 0;
    for (int i = 0; i < nums.length; i++) {

        if(nums[i] !=0){
          int temp = nums[i];
          nums[i] = nums[index];
          nums[index] = temp;
          index++;
        }
  }
  }
  public static void main(String[] args) {
    int nums[]={0,1,0,3,12};
    // approch1(nums);
    approch2_bubble(nums);
    System.out.println(Arrays.toString(nums));
  }
}
