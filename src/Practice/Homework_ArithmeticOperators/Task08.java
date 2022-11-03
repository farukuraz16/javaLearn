package Practice.Homework_ArithmeticOperators;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
    Scanner dat = new Scanner(System.in);
        System.out.print("saniye giriniz : ");
        int zaman = dat.nextInt();
        System.out.println((zaman/3600)+" saat  "+(zaman%3600/60)+" dakika  "+((zaman%3600)%60)+" saniye");


    }
}
