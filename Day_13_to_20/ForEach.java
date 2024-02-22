public class ForEach {
  public static void main(String[] args) {
    int[] myArray = new int[]{
        1,2,3,4,5,6,7
    };

    String[] name = new String[]{
      "Tushar", "Aman", "Rohan","Ankit"
    };

    for (int i : myArray) {
      System.out.println(i);
    }

    for(String j: name){
      System.out.println(j);
    }
  }
}
