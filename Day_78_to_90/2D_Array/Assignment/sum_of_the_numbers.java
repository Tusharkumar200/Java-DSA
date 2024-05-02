package Assignment;

class sum_of_the_numbers {

  public static int sumOfRow(int[][] array){
    
    int sum=0;
    for (int row = 1; row < array.length-1; row++) {
      for (int col = 0; col < array[0].length; col++) {
        System.out.print(" \n"+array[row][col]);
        sum += array[row][col];
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
    int array[][]= {{1,4,9},
                    {11,4,3},
                    {2,2,3} };

    int result = sumOfRow(array);
    System.out.println(" sum of row : "+result);
  }
}
