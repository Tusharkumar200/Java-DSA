package challenges.WeekDays;

public class EnumTest {
  public static void main(String[] args) {
    // System.out.println(Day.MONDAY);
    // System.out.println(Day.TUESDAY);
    // System.out.println(Day.WEDNESDAY);
    // System.out.println(Day.THRUSDAY);
    // System.out.println(Day.FIRDAY);
    // System.out.println(Day.SATURDAY);

    for (Day values : Day.values()) {
      System.out.println(values);
    }

    
  }
}
