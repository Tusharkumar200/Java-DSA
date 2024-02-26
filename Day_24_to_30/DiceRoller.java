import java.util.Random;

class DiceRoller{

  public static int roll(){
    Random rand = new Random();
    int dice = rand.nextInt(1,6); 
    System.out.println(dice);
    return dice;
  }

  public static void main(String[] args) {
    System.out.println("Roll the dice ");
    roll();
    roll();
    roll();
   
    
   
    
  }
}