public class MaxInt_in_Array {
  public static void main(String[] args) {
    int[] arr = {50,10,40,80,30,20,70};
    int max =Integer.MIN_VALUE;
   for(int i:arr){
    if(max < i){
      max = i;
    }
    }
   
    System.out.println(max);
   }
  }

