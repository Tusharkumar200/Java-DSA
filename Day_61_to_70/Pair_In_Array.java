public class Pair_In_Array {

  public static void pair(int number[]){

    // int totalPairs = 0;
    int totalPairs = number.length;

    for(int i=0; i<number.length;i++){
      int current = number[i];
      for(int j= i+1; j<number.length;j++){
          System.out.print("("+current+","+ number[j]+")");
          totalPairs++;
      }
      System.out.println();
      
    }
    // System.out.println("total pairs = "+ totalPairs);
    System.out.println("total pairs = "+ totalPairs*(totalPairs-1)/2);

  }
  public static void main(String[] args) {
    int number[]= {1,2,3,4,5,6};
    pair(number);
  }
}
