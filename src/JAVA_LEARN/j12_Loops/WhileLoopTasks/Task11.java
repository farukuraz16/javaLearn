package JAVA_LEARN.j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner dat = new Scanner(System.in);
        System.out.println("sayı gir= ");
        int sayi = dat.nextInt();

        int adet = 0;
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi;
            System.out.println("sayı gir= ");
            sayi = dat.nextInt();

            adet++;
        }
        System.out.println(toplam + "  " + adet);

    }
}
