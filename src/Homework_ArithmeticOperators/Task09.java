package Homework_ArithmeticOperators;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
Scanner dat = new Scanner(System.in);
        System.out.print("inek sayısı= ");
        int inek = dat.nextInt();
        System.out.print("koyun sayısı= ");
        int koyun = dat.nextInt();
        System.out.print("tavuk sayısı= ");
        int tavuk = dat.nextInt();
        System.out.println("toplam ayak sayısı= "+((inek+koyun)*4+(tavuk*2)));



    }

}
