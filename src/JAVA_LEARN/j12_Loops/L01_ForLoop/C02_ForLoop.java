package JAVA_LEARN.j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //task -> girilen sayıdan 100e kadar 4ün katı olan tamsayıları print

        Scanner dat = new Scanner(System.in);
        System.out.println("sıfırdan büyük 100'den küçük bir sayı giriniz=  ");
        int s = dat.nextInt();

        if (s>0){
        for (int i=s; i<100; i++){
            if (i%4==0){
                System.out.println(i+", ");
            }}
        }else System.out.println("sayı geçersiz..");

    }

    }

