package JAVA_LEARN.j12_Loops.L02_whileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);


        // task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz

        System.out.println("bir tam sayı giriniz= ");
        int s = dat.nextInt();

        System.out.println(rakamTopla(s));

    }//main

    private static int rakamTopla(int sayi) {
        int toplam = 0;
        while (sayi>0){
            toplam+=sayi%10;
            sayi /= 10;
        }return toplam;
    }
}
