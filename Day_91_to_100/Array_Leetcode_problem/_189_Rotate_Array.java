import java.util.Arrays;

public class _189_Rotate_Array {

  public static void rotate(int nums[],int k){
    
    int len = nums.length;
    int [] result = new int[len];

    for (int index = 0; index < nums.length; index++) {
        result[(index +k) % len] = nums[index];
    }
    
    for (int i = 0; i <len; i++) {
      nums[i] = result[i];

    }
    
    }

  public static void main(String[] args) {
    int[] nums= {1,2,3,4,5,6,7};
    int k=5;
    rotate(nums, k);
    System.out.println(Arrays.toString(nums));
  }
}
