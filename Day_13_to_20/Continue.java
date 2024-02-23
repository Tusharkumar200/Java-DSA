

public class Continue {
  public static void main(String[] args) {
    int arr[] ={1,2,-5,7,8,9,-4,6,2};
    int sum =0;
    for (int i : arr) {
      if (i<0) {
        continue;
      }
      sum +=i;
    }
    System.out.println("Sum is : "+sum);
  }
}
