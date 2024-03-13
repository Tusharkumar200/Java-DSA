package challenges.EnhanceTheDay;

public enum Day {
  MONDAY(true),
  TUESDAY(true),
  WEDNESDAY(true),
  THRUSDAY(true),
  FIRDAY(true),
  SATURDAY(false),
  SUNDAY(false);

  private final boolean isWeekDay;
  Day(boolean isWeekDay){
    this.isWeekDay = isWeekDay;
  }

  public String getTyep(){
    return isWeekDay?"WeekDay":"WeekEnd";
  }

}
