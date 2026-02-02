package academy.devdojo.maratonajava.javacore.Odatas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeBrazil = new Locale("it", "BR");
        Locale localeIndia = new Locale("hi", "IN");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 =  DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df3 =  DateFormat.getDateInstance(DateFormat.FULL, localeIndia);

        System.out.println("Italia "+  df1.format(calendar.getTime()));
        System.out.println("Brasil "+  df2.format(calendar.getTime()));
        System.out.println("India "+  df3.format(calendar.getTime()));


    }
}
