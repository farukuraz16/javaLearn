package Homework_ScannerClassTasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner input = new Scanner(System.in);
        System.out.print("bir a sayısı giriniz-> a= ");
        double a = input.nextDouble();
        System.out.print("bir b sayısı giriniz-> b= ");
        double b = input.nextDouble();
        System.out.print("bir c sayısı giriniz-> c= ");
        double c = input.nextDouble();
        System.out.print("Sonuç= "+ ((Math.pow(a, 2))-(Math.pow(b, 2)))/(c*3));

    }
}
