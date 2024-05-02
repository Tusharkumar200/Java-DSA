package Assignment;

public class Transpose_of_matrix {

  public static void transpose(int[][] matrix){
    
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix.length; col++) {
        // row = row + col;
        // col = row - col;
        // row = row - col;

        System.out.print(" "+ matrix[col][row]);
      }
    }
    
  }
  public static void main(String[] args) {
    int[][] matrix = {{2,4,6},
                      {5,8,10}};

    transpose(matrix);
    System.out.println();
  }
}
