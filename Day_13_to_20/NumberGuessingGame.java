import java.util.*;

public class NumberGuessingGame {
  public static void main(String[] args) {
    System.out.println("WELCOME TO GUESSING GAME...!\n");
    try (Scanner input = new Scanner(System.in)) {
      Random rand = new Random();
  
          int computer = rand.nextInt(100);     
          int user;
          // int count=0;
          int lifeLine = 5;
          String status = " victory ";
          System.out.println("Guess the number between 0 to 100 ");
          do{
            System.out.println("Your Have "+ lifeLine +" lifeLine") ;
            user = input.nextInt();
           System.out.println("User: "+ user);

           if(user< computer ){
            System.out.println("Guess More then It ");
           }
           else if(user > computer){
            System.out.println("Guess less then It ");
           }
          //  count++;
           lifeLine--;
           if (lifeLine ==0) {
            System.out.println("Life Finish");
            break;
           }
                 
          }while (computer !=user);
         if(computer==user){
           System.out.println("Your Guess It Right"); }
        
        System.out.println("-----------------------");
        System.out.println("-------DASHBOARD-------");
        System.out.println("comp ="+computer);
        System.out.println("User= "+ user);
        
          // System.out.println("Count = "+count);
          System.out.println("LifeLine = "+lifeLine +" safe");
          if(computer == user){

            System.out.println("Status = "+ status);
          }
          else{
            status = "Lose";
            System.out.println("Status = "+ status);
          }
          System.out.println("Let's Play Again");
       
    }

  }
}