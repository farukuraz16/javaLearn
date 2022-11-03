package JAVA_LEARN.j22_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZonedDateTime {
    public static void main(String[] args) {








        //herhangi bir ulke-sehir->local tarih ve zaman bilgisi tutar

        LocalDate trhZone= LocalDate.now(ZoneId.of("America/New_York"));//Amerika NY local anlık tarih bilgisi tanımlandı
        LocalDate trhZone1= LocalDate.now(ZoneId.of("Japan"));
        System.out.println("trhZone = " + trhZone);
        System.out.println("trhZone1 = " + trhZone1);

        ZonedDateTime zdt1= ZonedDateTime.now(ZoneId.of("America/New_York"));
        //ZonedDateTime zdt2= ZonedDateTime.now(ZoneId.of("America"));
        ZonedDateTime zdt3= ZonedDateTime.now(ZoneId.of("Japan"));

        System.out.println("zdt1 = " + zdt1);
        //System.out.println("zdt2 = " + zdt2);
        System.out.println("zdt3 = " + zdt3);


    }
}
