public class LinerSearch {

  public static int search(int numbers[] , int key){
    for (int i : numbers) {
      if(numbers[i] == key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] numbers = {1,5,8,4,10,55,3,4,54,22};
    int key = 10;

    int index =  search(numbers, key);

    if(index == -1){
      System.out.println("key is not found");
    }
    else{
      System.out.println("key is at index "+ index);
    }
  }
}
