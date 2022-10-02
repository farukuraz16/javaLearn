package Homework_ArithmeticOperators;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

Scanner dat = new Scanner(System.in);
        System.out.println("3 basmaklı bir sayı giriniz : ");
        int sayi= dat.nextInt();
        System.out.println("Girdiğiniz sayının birler basamağı: "+sayi%10);
        System.out.println("Girdiğiniz sayının onlar basamağı: "+((sayi/10)%10));
        System.out.println("Girdiğiniz sayının yüzler basamağı: "+(sayi/100));

Scanner sc = new Scanner(System.in);
        System.out.println("3 basmaklı bir sayı giriniz : ");
        int sayi2 = sc.nextInt();
        int birler=sayi2%10;
        sayi/=10;
        int onlar=sayi%10;
        int yüzler=sayi/10;
        System.out.println("birler basamağı = " + birler +"\nonlar basamağı = " + onlar + "\nyüzler basamağı = " + yüzler);
    }
}
