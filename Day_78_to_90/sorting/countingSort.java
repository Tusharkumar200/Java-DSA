public class countingSort {

  public static void counting(int[] nums){
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
        largest = Math.max(largest,nums[i]);
    }

    int count[] = new int[largest+1];
    for (int i = 0; i < nums.length; i++) {
      count[nums[i]]++;
    }
  }
  public static void main(String[] args) {
    int [] nums={1,5,2,4,7,8,3};
  }
}
