package sorting_algorithem;

public class bubble_sort {
    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubblesort(int[] arr){
       for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1] >arr[j]){
                    swap(arr, j-1, j);
                }
            }
       }
    }
}
