public class reverse_the_element {
  public static void revere(int []nums){
    for (int i = nums.length-1; i>=0;i--) {
      System.out.print(nums[i]+" ");
    }
  }
  public static void main(String[] args) {
    int nums[] = {1,2,3,4,5};
    revere(nums);
  }
}
