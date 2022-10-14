package j13_Break_Continue.taskss;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("bir sayı gir= ");
        int sayi = dat.nextInt();
        PowersofTwo(sayi);

    }

    private static void PowersofTwo(int data) {
        boolean kuvvetimi=true;
        while (data >= 2) {
            if (data % 2 != 0){
                   kuvvetimi=false;
            break;}
            else
                kuvvetimi=true;
            data /= 2;

        }
        if(kuvvetimi) System.out.println("kuvveti");
        else System.out.println("kuvveti değil");


    }


}

