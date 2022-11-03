package Practice.Code_Challange_Elly;

import java.util.Scanner;

public class ek_forLoop {
    public static void main(String[] args) {
        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */

Scanner dat = new Scanner(System.in);
int toplam = 0;
int adet=0;
        while (toplam<100){
            System.out.println("sayı giriniz= ");
            int sayi = dat.nextInt();
            toplam+=sayi;
            adet++;
             }
        System.out.println(adet+" kere sayi girdin. Bu kadar sayi yeter.\n sayıların toplamı "+toplam+" oldu. \nYeter artık yeter.");


    }}
