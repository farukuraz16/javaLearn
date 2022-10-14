package Code_Challange_Elly;

import java.util.Scanner;

public class ek_whiledowhile1 {
    public static void main(String[] args) {
/*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */


        Scanner dat = new Scanner(System.in);
        System.out.println("sayı giriniz= ");
        int sayi = dat.nextInt();
        int adet=0;

        for (int i = sayi; i >0; i--) {
            if (i%2!=0){
                System.out.print(i+", ");
adet++;
            }

        }
        System.out.println("adet = " + adet);

    }

    }

