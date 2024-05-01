package Assignment;

public class printing_number {
    public static int printNumber(int[][] array,int key){
      int count =0;
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[0].length; j++) {
            if(key == array[i][j]){
               count++;
            }
        }
      }
      return count;
  }
  public static void main(String[] args) {
    int[][] array = {{4,7,8},
                     {8,8,7}};   
    int key = 7;
    int result = printNumber(array,key); 
    System.out.println("count of 7 is: "+result);
  }
}
