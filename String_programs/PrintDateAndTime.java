package String_programs;
import java.util.Calendar;


public class PrintDateAndTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.format("%tB %te, %tY%n", calendar, calendar, calendar);
        System.out.format("%tl:%tM %tp%n", calendar, calendar, calendar);
    }
}
