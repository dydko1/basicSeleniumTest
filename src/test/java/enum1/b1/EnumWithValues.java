package enum1.b1;

public class EnumWithValues {

  public static void main(String[] args) {
    WeekDays weekdays = WeekDays.WEDNESDAY;
    System.out.println(weekdays.getDaysGreeting());
    if (weekdays.isWeekend()) {
      doYourTaskForWeekEnds();
    } else {
      doYourTaskForWeekDays(weekdays);
    }
  }

  private static void doYourTaskForWeekEnds() {
      System.out.println("Relax and Enjoy! It's Weekend :)");
  }

  private static void doYourTaskForWeekDays(WeekDays weekdays) {
      System.out.println("Ohh! It's a weekday. Have to work!");
  }
}