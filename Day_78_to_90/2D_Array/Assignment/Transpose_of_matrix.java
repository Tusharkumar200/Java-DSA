package Assignment;

public class Transpose_of_matrix {

  public static int transpose(int[][] matrix){
    
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length-1; col++) {
        row = row + col;
        col = row - col;
        row = row - col;

        System.out.print(" "+ matrix[row][col]);
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    int[][] matrix = {{2,4,6},
                      {5,8,10}};
    int result = transpose(matrix);
    System.out.print (result);
  }
}
