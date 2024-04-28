public class spiral {

  public static void printspiral(int matrix[][]){

    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;

    while(startRow <=endRow && startCol <= endCold){
      // Top
      for (int j =startCol;j <=endCol; j++) {
        System.out.println(matrix[startRow] [j]+" ");
      }
    }
    }
  public static void main(String[] args) {
    int matrix[][] = {
      {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  }
}
