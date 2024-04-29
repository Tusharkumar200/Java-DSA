class largestElement{

  public static int large(int[] a){
    int max = Integer.MIN_VALUE;
    for (int i : a) {
      if(i>max){
        max=i;
      }
    }
    return max;
  }
  public static void main(String []args){
   
    int a[] = {1,5,7,9,4,56,15,35};
    int result = large(a);
    System.out.println(result);
  

  }
}