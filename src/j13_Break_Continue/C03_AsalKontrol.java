package j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner dat = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
                int sayi = dat.nextInt();
                int i;
                boolean asalsayi=true;
    for (i=2; i<sayi; i++){
        if (sayi%i==0){
            asalsayi=false;
            break;}
               }
    if (asalsayi) System.out.println("asal sayıdır.");
    else System.out.println("asal sayı değildir.");

        }


    }

