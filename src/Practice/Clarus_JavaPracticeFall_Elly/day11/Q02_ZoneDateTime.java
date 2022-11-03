package Practice.Clarus_JavaPracticeFall_Elly.day11;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q02_ZoneDateTime {
    public static void main(String[] args) {
        // Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // Asia/Tokyo nun saat dilimine gore saat ?
        // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Phoenix"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("zdt1 = " + zdt2);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("zdt1.format(f) = " + zdt1.format(f));

        DateTimeFormatter k= DateTimeFormatter.ofPattern("dd/MM/YYYY - hh:mm");
        System.out.println(zdt2.format(k));
    }
}
