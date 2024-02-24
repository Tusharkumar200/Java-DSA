import java.util.Scanner;

public class OccurrencesForEach {
  public static void main(String[] args) {
    int[] arr = {50,10,40,80,30,20,70,50,70,90,50,80};
    System.out.print("Enter the Number : ");
    try (Scanner input = new Scanner(System.in)) {
      int num = input.nextInt();
      int count =0;
      for(int i :arr){
        if(num == i){
          count++;
        }
        
      }
      System.out.println("count is : "+count);
    }
  }
}
