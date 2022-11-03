package JAVA_LEARN.j11_MethodCreation;

import java.util.Scanner;

public class Task15UcusProject {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */

        System.out.println("yolcu yaşı?: ");
        int yas = sc.nextInt();

        System.out.println("hangi şehir?: ");
        String sehir = sc.next().toUpperCase();

        System.out.println("one way (1) or round trip (2)?: ");
        int bilet = sc.nextInt();



        System.out.println("bilet ücretiniz= "+biletmaliyet(sehir));
        System.out.println("yaş indirimi= "+indirim(yas, biletmaliyet(sehir)));
        System.out.println("gidiş dönüş indirimi= "+indirim2(bilet, biletmaliyet(sehir)));
        System.out.println("ödenecek tutar= "+(
                        biletmaliyet(sehir)-
                                (indirim(yas, biletmaliyet(sehir)))-
                                (indirim2(bilet, biletmaliyet(sehir)))));


    }

    public static double biletmaliyet(String sehir) {
        double biletF = 0;
        switch (sehir) {
            case "B":
                biletF = 500 * 0.10;
                break;
            case "C":
                biletF = 700 * 0.10;
                break;
            case "D":
                biletF = 900 * 0.10;
                break;
            default:
                System.out.println("Lütfen şehir seçiniz");
        }

        return biletF;
    }

    public static double indirim(int yas, double bilet) {
        double ind;

        if (yas <= 12) {
            ind = bilet * 0.50;
        } else if (yas > 12 && yas <= 24) {
            ind = bilet * 0.10;
        } else if (yas >= 64) {
            ind = bilet * 0.30;
        } else ind = 0;
        return ind;
    }

    public static double indirim2(int a, double bilet) {
        double ind2;
        if (a == 2) {
            ind2 = bilet * 0.20;
        } else ind2 = 0;
        return ind2;

    }


}
