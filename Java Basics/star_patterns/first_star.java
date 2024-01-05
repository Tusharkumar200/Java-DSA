import java.util.Scanner;

class first_star{
  public static void main(String[] args) {
    System.out.println("enter no of stars");
    Scanner stars = new Scanner(System.in);
    int star = stars.nextInt();

    for (int i=0; i<=star;i++){
      for(int j = 0; j<i ;j++){

        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }
}