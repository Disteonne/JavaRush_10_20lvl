package rubbish;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class ParseDateLol {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
        Date date=dateFormat.parse("15/04/2020");
        DateFormat formatter=new SimpleDateFormat("dd-MMMM-yyy",Locale.ENGLISH);
        System.out.println(formatter.format(date));
        System.out.println(date);
    }
}
