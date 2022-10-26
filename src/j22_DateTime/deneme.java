package j22_DateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class deneme {
    public static void main(String[] args) {
        LocalDateTime zaman =  LocalDateTime.of(2022, Month.NOVEMBER,01,4,35,45);
        DateTimeFormatter newzaman = DateTimeFormatter.ofPattern("d/MMMM/YYYY");
        System.out.println("newzaman.format(zaman) = " + newzaman.format(zaman));

        DateTimeFormatter newtime = DateTimeFormatter.ofPattern("hh : mm");
        System.out.println("newtime.format(zaman) = " + newtime.format(zaman));

    }
}
