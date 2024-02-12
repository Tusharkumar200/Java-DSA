public class SumAverage2DArray {
  public static void main(String[] args) {
    System.out.println("Welcome to sum and average of 2D Array \n");
    int[][] numArr = ArrayUtility.input2DArray();
    long sum=sum(numArr);
    double avg = average(numArr);
    System.out.println("Your sum of array is: "+ sum);
    System.out.println("Your average of array is: "+avg);
  }
  static double average(int[][] numArr){
    if(numArr.length==0){
      return 0;
    }
    int rows = numArr.length;
    int cols = numArr[0].length;
    double size = rows * cols;
    return sum(numArr)/size;
  }
  static long sum(int[][] numArr){
    long sum = 0;
    for(int i=0; i<numArr.length;i++){
      for(int j=0;j<numArr.length;j++){
        sum += numArr[i][j];
      }
    }
    return sum;
  }
}
