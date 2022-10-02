package j08_ifStatement_TernaryOperator;

import java.util.Scanner;
/*
girilen bir yılın artık olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece
    400’ün katı olan yıllar artık yıldır.
    Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
    1980, 1984, 1988, 1992, 1996, 2000, 2004,
    2008, 2012, 2016, 2020, 2024, 2028, 2032,
    2036, 2040, 2044, 2048 vb.
 */
/* public class Ex03 {
    public static void main(String[] args) {
        /*
        girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("agam yilini   gir : ");
        int yil = sc.nextInt();

        // 4'un katı       100'un katı olmamamsı    400'un katı olması
        if ((yil%4==0)       &&  (yil %100!=0)  ||   (yil%400==0) ){
        System.out.println("girdiğiniz yil artık yıl  :-)");
        }else {
        System.out.println("giridiğinz yıl artık yıl değildir  :-(");
        }
        */
public class Ex_03 {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("what is the year? = ");
        int y = dat.nextInt();

        int d = y%4;

        if (d!=0){
            System.out.println("artık yıl değildir");
        }
        else if (d==0 & y%100!=0) {
            System.out.println("artık yıldır");
        } else if (((d==0 & y%100==0)) & (y%400==0)) {
            System.out.println("artık yıldır");


        }

    }
}
