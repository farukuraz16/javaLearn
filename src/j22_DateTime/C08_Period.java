package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //Period-> iki tarih arasında geçen tekrarlanabilen zamanı tutar..

        LocalDate bugun = LocalDate.now();

        LocalDate frkBirthday = LocalDate.of(1980, 10, 18);

        Period fark = Period.between(frkBirthday, bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());//fark datasının toplam kaç ay olduğunu verir
        System.out.println("fark.getDays() = " + fark.getDays());//fark datasındaki gün değerini verir
        System.out.println("fark.getMonths() = " + fark.getMonths());//fark datasındaki ay değerini verir

        System.out.println("*******************");
        System.out.println("bugun = " + bugun);

        Period period5gun = Period.ofDays(5);//5 günde bir tekrarlayan periyod
        Period period7ay = Period.ofMonths(7);//7 ayda bir tekrarlayan periyod
        Period periodx = Period.ofMonths(7).ofDays(21);//7 ayda bir tekrarlayan periyod
        //Trick -> period tanımlamadan birden çok zaman parametresi tanımlanırsa son
        // parametre çalışır diğerlerini ezer

        bugun = bugun.plus(period5gun);//5 günlük period eklendi
        System.out.println("bugun = " + bugun);
        System.out.println();

        bugun = bugun.plus(period7ay);//7 aylık period eklendi
        System.out.println("bugun = " + bugun);

        bugun = bugun.plus(periodx);
        System.out.println("bugun = " + bugun);
        System.out.println();

        // task-> 5.9.2022 de başlayan kur 9 ay olduguna göre bitiş tarihini print eden code create ediniz
        LocalDate basla= LocalDate.of(2022, 9, 5);
        System.out.println("bitis = " + bugun.plusMonths(9));

        System.out.println(basla.plusMonths(9).format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}
