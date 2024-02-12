import java.util.Scanner;

class DeleteFromArray {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Welcome to Array Deletion\n");
      int[] numArr = ArrayUtility.inputArray();
      System.out.println("Now,Enter the number you want to delete: ");
      int numToDelete = input.nextInt();
       int newArr = deleteNumber(numArr, numToDelete);
      System.out.println("Here is your new array ");
      ArrayUtility.displayArray(newArr);
    }
  }

  static int deleteNumber(int[] numArr, int numToDelete) {
    int occ = Occurrences.list(numArr, numToDelete);
    if (occ == 0) {
      return numArr;
    }
    int newSize = numArr.length - occ;
    int[] nuwArr = new int[newSize];

    int i = 0, j = 0;
    while (i < numArr.length) {
      if (numArr[i] != numToDelete) {
        newArr[j] = numArr[i];
        j++;
      }
      i++;
    }

    return newArr;
  }
}