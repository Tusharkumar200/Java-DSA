public class Printing_SubArray {

  public static void subarray(int number[]){
    int ts = 0;
    int sum=0;
    for (int i = 0; i < number.length; i++) {
      int start = i;
      for (int j = i; j < number.length; j++) {
        int end = j;
        for (int k = start; k <=end; k++) {
          System.out.print(number[k]+" ");
          sum = sum+number[k];
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subarray is: "+ts);
    System.out.println("sum of total subarray is: "+sum);
  }
  public static void main(String[] args) {
    int number[] = {2,4,6,8,10};
    subarray(number);
  }
}
