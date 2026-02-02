package academy.devdojo.maratonajava.javacore.Odatas.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é dia de ir a Santa Missa.");
        }
        Date date = c.getTime();
        System.out.println(date);
    }
}
