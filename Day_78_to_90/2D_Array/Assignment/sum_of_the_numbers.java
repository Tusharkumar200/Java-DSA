package Assignment;

class sum_of_the_numbers {

  public static int sumOfRow(int[][] array){
    
    int sum=0;
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[0].length; col++) {
        if(row ==2){
          sum += row;
        }
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
    int array[][]= {{1,4,9},
                    {11,4,3},
                    {2,2,3} };

    int result = sumOfRow(array);
    System.out.println(result);
  }
}
