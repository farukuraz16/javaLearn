package JAVA_LEARN.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
         /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

Scanner dat =new Scanner(System.in);
        System.out.print("sayı gir= ");
        int s = dat.nextInt();
        System.out.println(s >= 0 ? (s < 10 ? "Rakam" : "Pozitif sayı") : "Negatif Sayı");


    }}