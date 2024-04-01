public class LinerSearch {

  public static int search(int numbers[] , int key){
    for (int i : numbers) {
      if(i == key){
        System.out.println("number found at "+ i);
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    int[] numbers = {1,5,8,4,10,55,3,4,54,22};
    int key = 10;

    search(numbers, key);
  }
}
