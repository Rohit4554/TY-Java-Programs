import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A1B1DataAndTime  
{
    int num;

    public A1B1DataAndTime()
     {
        num = 0;
    }

    public A1B1DataAndTime(int num) 
    {
        this.num = num;
    }

    public static void main(String[] args) 
    {
        A1B1DataAndTime m1 = new A1B1DataAndTime();
        if (args.length > 0) 
        {
            int n = Integer.parseInt(args[0]);
            A1B1DataAndTime m2 = new A1B1DataAndTime(n);
            System.out.println(m1.num);
            System.out.println(m2.num);
        } 
        else 
        {
            System.out.println("Insufficient arguments");
        }

        // Get current date and time
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();

        // Format 1: 31/08/2021
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + format1.format(now));

        // Format 2: 08-31-2021
        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + format2.format(now));

        // Format 3: Tuesday August 31 2021
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : " + format3.format(now));

        // Format 4: Fri August 31 15:25:59 IST 2021
        SimpleDateFormat format4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is : " + format4.format(now));

        // Format 5: 31/08/21 15:25:59 PM +0530
        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        System.out.println("Current date and time is : " + format5.format(now));

        // Format 6: 15:25:59
        SimpleDateFormat format6 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time is : " + format6.format(now));

        // Format 7: Current week of year is : 35
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Current week of year is : " + weekOfYear);

        // Format 8: Current week of month is : 5
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println("Current week of month is : " + weekOfMonth);

        // Format 9: Current day of the year is : 243
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("Current day of the year is : " + dayOfYear);
    }
}
