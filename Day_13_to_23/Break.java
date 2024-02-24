import java.util.Scanner;

public class Break {
  public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {    

      while(true){
        System.out.println(" enter your command " );
        
      String command = input.nextLine();
        if (command.equalsIgnoreCase("exit")) {
          break;
        }
      }
      System.out.println("Exit successfully...");
     }
  }
}
