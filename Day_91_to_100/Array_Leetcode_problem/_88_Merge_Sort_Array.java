import java.util.Arrays;

public class _88_Merge_Sort_Array {

  public static void merge(int[] num1, int m,int[] num2, int n){
      int index =0;
      for(int i=m; i<num1.length;i++){
        num1[i] = num2[index];
        index++;
      }
       Arrays.sort(num1);
       

  }
  public static void main(String[] args) {
    int m=3;
    int n=3;
    int num1[]={1,2,3,0,0,0};
    int num2[] = {2,5,6};
    merge(num1,m, num2,n);
    System.out.println(Arrays.toString(num1));
  }
}
