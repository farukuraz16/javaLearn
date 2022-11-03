package Practice.Homework_ScannerClassTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…

         */

        Scanner input= new Scanner(System.in);
        System.out.print("Boy? (cm): ");
        float b= input.nextInt();
        System.out.print("Ağırlık? (kg): ");
        float a= input.nextInt();

        System.out.println("Vücut Kitle Endeksiniz (VKİ): " + (a/((b/100)*(b/100))));
        System.out.println("Vücut Kitle Endeksiniz (VKİ): " + Math.round((a/((b/100)*(b/100)))));

    }
}
