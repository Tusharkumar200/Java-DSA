public class subarraySum_1_BruteForce {
  public static void maxSubarraySum(int number[]){

    // Time - Complexity --> O(n)^3
    
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for (int i = 0; i < number.length; i++) {
      int start = i;
      for (int j = i; j < number.length; j++) {
        int end = j;
        currSum = 0;
        for (int k = start; k <=end; k++) {
          // printing subArray sum
          currSum += number[k];
        }
        
        System.out.println(currSum);
        if(maxSum < currSum){
            maxSum = currSum;
        }
      }
    }
      System.out.println("max sum = "+ maxSum);
    }
        
    
  public static void main(String[] args) {
    int number[] = {2,4,6,8,10};
    maxSubarraySum(number);
  }
}
