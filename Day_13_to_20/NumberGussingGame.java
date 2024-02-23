import java.util.*;


public class NumberGussingGame {
  public static void main(String[] args) {
    System.out.println("WELCOME TO GUSSING GAME...!\n");
  Scanner input = new Scanner(System.in);
  Random rand = new Random();
   
        int computer = rand.nextInt(100);     
        System.out.println("computer: "+computer);
        int user;
    while (true) {
      System.out.println("Guss the number");
       user = input.nextInt();
      System.out.println("User: "+ user);
      if(computer == user){
        System.out.println("Your Guss It Right");
        System.out.println("Play Again");

        break;
      }
      else{System.out.println("Wrong Guss . Try again");}
    }
    System.out.println("comp ="+ computer);
    System.out.println("User="+ user);

  }
}
