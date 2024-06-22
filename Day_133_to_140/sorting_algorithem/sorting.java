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

        for(int i=1; i<arr.length;i++){
            int currentElement = arr[i];
            int j = i-1;

            while(j >= 0 && currentElement < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentElement;
        }
    }

    public static void mergeSort(int arr[]){

        if(arr.length < 2) return;
        int middle = arr.length/2;

        int left[] = new int[middle];
        int right[] = new int[arr.length-middle];

        int index = 0;

        for(int i=0; i<middle; i++){
            left[i] = arr[index++];
            
        }
        for(int i=0; i<arr.length-middle; i++){
            right[i -middle] = arr[index++];
        }

        //sort
        mergeSort(left);
        mergeSort(right);

        // Merge
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr){
     
        int index = 0, i = 0, j = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[index++] = left[i++];
            }else{
                arr[index++] = right[j++];
            }
        }

       while (i < left.length) {
           arr[index++] = left[i++];
        
       }

         while (j < right.length) {
              arr[index++] = right[j++];
         }
    }
}
