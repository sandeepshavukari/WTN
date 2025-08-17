public class EnumToString {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        String dayString = day.toString();
        System.out.println("The day is: " + dayString);
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
