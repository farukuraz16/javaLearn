package JAVA_LEARN.j12_Loops.WhileLoopTasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random dat = new Random();
        int sayi = dat.nextInt(100);

        Scanner dat2 = new Scanner(System.in);
        System.out.println("bilgisayar bir sayı seçti.. bilin bakalım kaç?= ");
        int sec = dat2.nextInt();

        double tahmin = 1;


        do {if (sec<sayi)
        {System.out.println("lütfen daha büyük bir sayı seçiniz..=");
            sec = dat2.nextInt();
            tahmin++;}

        else if (sec>sayi)
        {System.out.println("lütfen daha küçük bir sayı seçiniz..=");
            sec = dat2.nextInt();
            tahmin++;}
        }

        while (sec!=sayi);

        System.out.println("bravo!! sayı= "+sec+"!");
        double puan = 100 / tahmin;
        System.out.println(tahmin+" tahminde bildiniz."+ puan+" puan kazandınız!");

        }

    }





