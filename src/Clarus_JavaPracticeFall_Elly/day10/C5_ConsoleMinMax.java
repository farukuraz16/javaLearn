package Clarus_JavaPracticeFall_Elly.day10;

import java.util.Scanner;

public class C5_ConsoleMinMax {
    public static void main(String[] args) {
        // Console uzerinden maximum ve minimum degeri saglayiniz
        // ve buradan gelen rakamlari Math.random() da olmasini istediginiz araliga getiriniz.
        Scanner dat = new Scanner(System.in);
        System.out.println("sayi giriniz= ");  int sayi1= dat.nextInt();
        System.out.println("sayi giriniz= ");  int sayi2= dat.nextInt();

        System.out.println("büyük sayı="+Math.max(sayi1, sayi2));
        System.out.print("random sayı= ");

        if (sayi1>sayi2){
            System.out.println((int) (Math.random() * ((sayi1 - sayi2) + 1)) + sayi2);
        }else System.out.println((int) (Math.random() * ((sayi2 - sayi1) + 1)) + sayi1);


    }
}
