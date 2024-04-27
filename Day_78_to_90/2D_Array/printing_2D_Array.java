import java.util.Scanner;

public class printing_2D_Array {
  public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    int n = matrix.length;
    int m = matrix[0].length;

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the matrix ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <m; j++) {
          matrix[i][j] = input.nextInt();
      }
    }

    // OutPut

    for (int i = 0; i <n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}
