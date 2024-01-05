import java.util.Scanner;

class multiplication_table{
  public static void main(String[] args) {
    System.out.println("Enter the number: ");
    try (Scanner number = new Scanner(System.in)) {
      int table = number.nextInt();
      
      for (int i=1; i<=10 ; i++){
        System.out.println(table + "x"+ i + "="+ table*i);
      }
    }
    
    }
}