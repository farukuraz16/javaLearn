package JAVA_LEARN.j04_AritmeticOperator;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

        //kullanıcıdan alınan 3 basamaklı bri sayının sayı değerlerinin rakamları toplamını bulunuz.

        Scanner dat = new Scanner(System.in);
        System.out.println("3 basmaklı bir sayı giriniz : ");
        int sayi= dat.nextInt();
        System.out.println("Girdiğiniz sayının onlar basamağı: "+((sayi/10)%10));
        System.out.println("Girdiğiniz sayının yüzler basamağı: "+(sayi/100));
        System.out.println("Rakamları Toplamı = " + ((sayi%10)+((sayi/10)%10)+(sayi/100)));


                // kullanıcıdan alınan 3 basamaklı bir sayını rakamları toplamını print eden code create ediniz

/*
                Scanner scan = new Scanner(System.in);
                System.out.print("3 basamaklı bir sayı giriniz : ");
                int sayi = scan.nextInt();
                // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
                int birler = sayi % 10;//sayının birler basamagı
                sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
                int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
                int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

                //int rakamToplamı = birler + onlar + yüzler;
                //System.out.println("rakamToplamı = " + rakamToplamı);
                System.out.println(birler+onlar+yüzler); */
    }
}
