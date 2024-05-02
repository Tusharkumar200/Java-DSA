package Assignment;

public class Transpose_of_matrix {

  public static void printMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
              System.out.print (matrix[i][j] +" ");
            }
            System.out.println();
        }
  }
  public static void main(String[] args) {

    int row = 2;
    int col = 3;
    int[][] matrix = {{2,4,6},
                      {5,8,10}};

    

    int [][] transpose = new int[col][row];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }

    printMatrix(transpose);
    System.out.println();
  }
}
