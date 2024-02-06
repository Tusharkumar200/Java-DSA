class Array_concept {
  public static void main(String[] args) {

    // syntax of an array
    int[] myArray = { 1, 2, 3, 4, 5 };

    // System.out.println(myArray[0]);
    // System.out.println(myArray[1]);

    int[] secondArray = new int[10];
    int a = secondArray[0] = 10;
    int b = secondArray[1] = 20;
    int c = secondArray[2] = 30;
    int d = secondArray[3] = 40;
    int e = secondArray[4] = 50;

    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(d);
    // System.out.println(e);

    // Array Traversal

    for (int i = 0; i < secondArray.length; i++) {
      System.out.println(secondArray[i]);
    }

  }

}