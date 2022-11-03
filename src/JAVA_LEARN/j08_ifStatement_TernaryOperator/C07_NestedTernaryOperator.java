package JAVA_LEARN.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {
         /*
        TASK :
         Girilen bir pozitif tamsayı  4 basamaklı ise  “4 Basamaklı” print eden
         4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise “4 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “4 basamaklı olmayan tek sayı yazdırın.”
         */
    Scanner dat = new Scanner(System.in);
        System.out.println("bir sayı giriniz= ");
    int sayi = dat.nextInt();
       System.out.println(sayi<10000 && sayi>999 ? "4 Basamaklı" : sayi%2==0 ? "4 amaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı");


















    }}