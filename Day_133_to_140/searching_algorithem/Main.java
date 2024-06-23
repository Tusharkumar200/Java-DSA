package searching_algorithem;

public class Main {
    public static void main(String[] args) {
        
        int arr[] = {10, 5, 2, -1, 3};
        int result = Searcher.linearSearch(arr, 2);
        System.out.println("found at index :"+ result);
    }
}
