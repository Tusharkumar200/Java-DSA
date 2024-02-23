import java.util.*;

public class MultiplectionTable {
  public static void main(String[] args) {
    System.out.println("enter the Table : ");
    table();
  }
  public static void table(){
    try (Scanner input = new Scanner(System.in)) {
      int num = input.nextInt();
      for(int i =1; i<=10;i++){
        System.out.println(num+" X "+i+" = "+num*i);
      }
    }

  }
}
