package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {
        LocalDate bugun =  LocalDate.now();
        LocalDate falanGun =  bugun.minusDays(2);
        LocalDate filanGun =  bugun.plusDays(3);
        System.out.println("bugun = " + bugun);
        System.out.println("falanGun = " + falanGun);
        System.out.println("filanGun = " + filanGun);

        System.out.println("bugun.isBefore(falanGun) = " + bugun.isBefore(falanGun));
        System.out.println("bugun.isBefore(filanGun) = " + bugun.isBefore(filanGun));
        System.out.println("falanGun.isBefore(filanGun) = " + falanGun.isBefore(filanGun));

        System.out.println("bugun.isAfter(falanGun) = " + bugun.isAfter(falanGun));
        System.out.println("falanGun.isAfter(filanGun) = " + falanGun.isAfter(filanGun));

        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());

        int fark= bugun.compareTo(falanGun);
        System.out.println("fark = " + fark);

        int fark1= falanGun.compareTo(filanGun);
        System.out.println("fark = " + fark1);

        LocalDate birthday = LocalDate.of(1980, 10, 18);
        int yas= bugun.compareTo(birthday);
        System.out.println("yas = " + yas);

    }
}
