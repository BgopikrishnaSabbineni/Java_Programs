import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static java.text.SimpleDateFormat.*;

public class DateConv {

    public static void main(String[] args) throws ParseException {
       Date d=new Date();

        System.out.println(d);
        System.out.println();
        SimpleDateFormat f=new SimpleDateFormat("MM/dd/YYYY");
        String date1=f.format(d);
        Date date2=new SimpleDateFormat("yyyy/MM/dd").parse(date1);
        System.out.println(date1);
        System.out.println();
        System.out.println(date2);



    }
}
