import java.util.Scanner;

public class Month {
   static String month(int month) {
    // switch (month) {
    //   case 1:
    //     System.out.println("January");
    //     break;
    //   case 2:
    //     System.out.println("January");
    //     break;
    //   case 3:
    //     System.out.println("February");
    //     break;
    //   case 4:
    //     System.out.println("April");
    //     break;
    //   case 5:
    //     System.out.println("May");
    //     break;
    //   case 6:
    //     System.out.println("June");
    //     break;
    //   case 7:
    //     System.out.println("July");
    //     break;
    //   case 8:
    //     System.out.println("August");
    //     break;
    //   case 9:
    //     System.out.println("September");
    //     break;
    //   case 10:
    //     System.out.println("October");
    //     break;
    //   case 11:
    //     System.out.println("November");
    //     break;
    //   case 12:
    //     System.out.println("December");
    //     break;

    //   default:
    //     System.out.println("Enter the valid number 1 to 12 only");
        
    //     break;
    // }

  return  switch (month) {
      case 1->"january";
      case 2->"February";
      case 3->"march";
      case 4->"April";
      case 5->"May";
      case 6->"June";
      case 7->"July";
      case 8->"August";
      case 9->"September";
      case 10->"October";
      case 11->"November";
      case 12->"December";
      default -> "Invalid"; 
    };
  
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the number: ");
      int num = input.nextInt();
      String month_checker = month(num);
      System.out.println(month_checker);

    }
  }
}
