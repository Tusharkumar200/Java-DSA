public class Largest_and_Smallest_InArray {
  
  public static int maxNum(int[] number){
      int max = Integer.MIN_VALUE;  // - infinity
      int min = Integer.MAX_VALUE; // + infinity

      // Time complexity ---  O(n)

      for(int i =0; i< number.length;i++){

        if(max <number[i]){
          max = number[i];
          
        }
        if(min > number[i]){
          min = number[i];
        }

      }
      System.out.println("smallest in array "+ min);
      return max;
  }
  public static void main(String[] args) {
    
    int[] number = {5,7,9,4,3,12,15,18,20};
    System.out.println("largest number in array "+maxNum(number)); 
  }
}
