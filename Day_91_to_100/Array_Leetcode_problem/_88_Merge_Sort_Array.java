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
  
  public static int[] fastMerge(int[] nums1, int m,int[] nums2, int n){
        int i=0;
        int j=0;
        int[] arr = new int[nums1.length];
        int index =0; // arr 
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                arr[index] = nums1[i];
                index++;
                i++;
            }
            else{
              arr[index] = nums2[j];
              index++;
              j++;

            }
        }
        while(i < m){
          arr[index]=nums1[i];
          index++;
          i++;
        }
        while(j < n){
          arr[index]=nums2[j];
          index++;
          j++;
        }
        return arr;
  }
  public static void main(String[] args) {
    int m=3;
    int n=3;
    int num1[]={1,2,3,0,0,0};
    int num2[] = {2,5,6};

    var st = System.nanoTime();
    // merge(num1,m, num2,n);
    num1 =fastMerge(num1,m, num2,n);
    var et = System.nanoTime();
    System.out.println(Arrays.toString(num1 )+"Time Taken :"+(et+st));
    
  };
}
