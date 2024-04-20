class bubbleSort{
    public static void bubble(int nums[]){
      for (int i = 0; i < nums.length-1; i++) {
        for (int j = 0; j < nums.length-1-i; j++) {
            if(nums[j] > nums[j+1]){
              int temp = nums[j+1];
              nums[j+1] = nums[j];
              nums[j]=temp;
            }
        }
      }
    }

    public static void printArray(int[] arr){
      for (int index = 1; index < arr.length; index++) {
          System.out.println(" "+ index);
      }
    }
  public static void main(String[] args) {
      int nums[] = {5,1,4,8,6,0,2};
      bubble(nums);
      printArray(nums);
  }
}