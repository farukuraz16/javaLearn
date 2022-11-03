package Practice.Homework_ArithmeticOperators;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner dat = new Scanner(System.in);
        System.out.print("saat giriniz: ");
        int hr = dat.nextInt();
        System.out.print("dakika giriniz: ");
        int min = dat.nextInt();
        System.out.print("saniye giriniz: ");
        int sec = dat.nextInt();
        System.out.print("toplam saniye = " + ((hr*3600)+(min*60)+sec));


    }

}
