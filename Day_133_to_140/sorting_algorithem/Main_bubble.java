package sorting_algorithem;

public class Main_bubble {
    public static void main(String[] args) {
        
        int[]arr ={10,5,2,-1,3,8,2,4,11,6};
        // sorting.bubblesort(arr);
        // sorting.selectionsort(arr);
        sorting.insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
