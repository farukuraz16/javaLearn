package j13_Break_Continue.taskss;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

    /*
        Scanner dat = new Scanner(System.in);
        System.out.println("yükseklik kaç m?=");
        double yukseklik = dat.nextDouble();
        double vurus = 0;
        double yol = 0;

        int i = 1;
        while (1 < yukseklik) {
            vurus++;
            yol = yol+yukseklik + (yukseklik * 0.75);
            yukseklik*=0.75;
        }
        System.out.println("toplam yol="+yol);
        System.out.println("toplam zıplama sayısı="+vurus);

*/

        Scanner dat = new Scanner(System.in);
        System.out.println("yükseklik kaç m?=");
        double yukseklik = dat.nextDouble();
        double vurus = 0;
        double yol = 0;
        do {
            yol = yol + yukseklik + (yukseklik * 0.75);
            vurus++;
            yukseklik *= 0.75;
        } while (yukseklik >= 1);
        System.out.println("aldığı toplam Yol : " + yol);
        System.out.println("yere vurma sayısı : " + vurus);
    }
}


