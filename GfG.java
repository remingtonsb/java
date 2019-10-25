import java.util.Date;
import java.util.Calendar;
public class GfG {
    // main method
    public static void main(String[] args)
    {

        // creating a Calendar object
        Calendar c1 = Calendar.getInstance();

        // set Month
        // MONTH starts with 0 i.e. ( 0 - Jan)
        c1.set(Calendar.MONTH, 9);

        // set Date
        c1.set(Calendar.DATE, 21);

        // set Year
        c1.set(Calendar.YEAR, 2019);

        // creating a date object with specified time.
        Date dateOne = c1.getTime();

        System.out.println("Date: " + dateOne);

        System.out.println(dateOne.getTime());
    }
}
