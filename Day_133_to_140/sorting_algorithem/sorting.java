package sorting_algorithem;

public class sorting {
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

    public static void selectionsort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            
            swap(arr,i, minIndex);
        }
    }

    public static void insertionSort(int[] arr){
        
    }
}
