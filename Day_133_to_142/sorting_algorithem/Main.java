package sorting_algorithem;

public class Main {
    public static void main(String[] args) {
        
        int[]arr ={10,5,2,-1,3};
        // sorting.bubblesort(arr);
        // sorting.selectionsort(arr);
        // sorting.insertionSort(arr);
        // sorting.mergeSort(arr);
        sorting.quickSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
