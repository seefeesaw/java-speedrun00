package datatypes;



public class Weekend {
    public enum Weekend_Days {
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Weekend_Days day1 = Weekend_Days.SATURDAY;
        Weekend_Days day2 = Weekend_Days.SUNDAY;

        System.out.println("First day of the weekend: " + day1);
        System.out.println("Second day of the weekend: " + day2);
    }
}
