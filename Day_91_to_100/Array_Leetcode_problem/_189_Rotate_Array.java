public class _189_Rotate_Array {

  public static void rotate(int nums[],int k){
    int index =0;
    int len = nums.length;
    int newPos=0;
    for(int i=0;i<len;i++){
       newPos = (nums[index]+k)%len;
       index++;

      
       System.out.print(" "+newPos);
    }
  }

  public static void main(String[] args) {
    int[] nums= {1,2,3,4,5,6,7};
    int k=3;
    rotate(nums, k);
    System.out.println(nums);
  }
}
