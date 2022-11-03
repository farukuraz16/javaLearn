package JAVA_LEARN.j11_MethodCreation;

import java.util.Scanner;

public class Task06 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

        secim();

    }

    public static void secim() {
        System.out.println("Lütfen işlem yapmak istediğiniz geometrik şekli seçiniz-->\n" +
                "\nParalel kenar için   -1-" +
                "\nDikdörtgen için      -2-" +
                "\nÜçgen için           -3-" +
                "\nKare için            -4- " +
                "\ngiriniz? = ");

        int sec = sc.nextInt();

        switch (sec) {
            case 1:paralelkenar();
                break;
            case 2:dikdörtgen();
                break;
            case 3:üçgen();
                break;
            case 4:kare();
                break;
            default:System.out.println("Belirtilen geometrik şekillderden birini seçmediniz. Lütfen tekrar deneyiniz.");
                secim();
        }
    }


    public static void paralelkenar() {
        System.out.print("Paralel kenarın taban uzunluğunu giriniz= ");
        int taban = sc.nextInt();
        System.out.print("Paralel kenarın bir kenar uzunluğunu giriniz= ");
        int kenar = sc.nextInt();
        System.out.print("Paralel kenarın yüksekliğini giriniz= ");
        int yükseklik = sc.nextInt();
        System.out.print("Paralel kenarın alanı     = " + (taban * yükseklik));
        System.out.print("Paralel kenarın çevresi   = " + (taban + kenar) * 2);

    }

    public static void üçgen() {
        System.out.print("Üçgenin taban uzunluğunu giriniz= ");
        int x = sc.nextInt();
        System.out.print("Üçgenin bir kenar uzunluğunu giriniz= ");
        int y = sc.nextInt();
        System.out.print("Üçgenin diğer  kenar uzunluğunu giriniz= ");
        int z = sc.nextInt();
        System.out.print("Üçgenin yüksekliğini giriniz= ");
        int q = sc.nextInt();
        System.out.print("Üçgenin alanı     = " + (x * y) / 2);
        System.out.print("Üçgenin çevresi   = " + (x + y + z));

    }


    public static void dikdörtgen() {
        System.out.println("Dikdörtgenin uzun kenarı= ");
        int a = sc.nextInt();
        System.out.println("Dikdörtgenin kısa kenar= ");
        int b = sc.nextInt();
        System.out.println("Dikdörtgenin alanı  = " + (a * b));
        System.out.println("Dikdörtgenin çeversi= " + ((a + b) * 2));

    }

    public static void kare() {
        System.out.println("Karenin bir kenar uzunluğunu giriniz= ");
        int k = sc.nextInt();

        System.out.println("Karenin alanı   = " + (k * k));
        System.out.println("Karenin çevresi = " + (k * 4));
    }
}



