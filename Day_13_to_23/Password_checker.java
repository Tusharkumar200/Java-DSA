import java.util.Scanner;

public class Password_checker {
  public static void main(String[] args) {
    try(Scanner input = new Scanner(System.in)){
      
      String password;

      do{
        System.out.println(" Enter the Password ");
        password = input.next();
      }while(!password_checkPoint(password));
      System.out.println("Thanks for entering correct password");
    
    }
  }
  static boolean password_checkPoint(String password){
    return password.length()> 8;

  }
}