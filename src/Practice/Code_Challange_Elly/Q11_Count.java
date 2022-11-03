package Practice.Code_Challange_Elly;

import java.util.Scanner;

public class Q11_Count {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("bir cümle giriniz= ");
        String cml= dat.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < cml.length(); i++) {
            if (cml.charAt(i)=='e') count++;

        }
        System.out.println(count);


    }
}
