package Practice.Homework_ArithmeticOperators;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner dat = new Scanner(System.in);
        System.out.print("bir numara giriniz: ");
        int num1 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num2 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num3 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num4 = dat.nextInt();
        System.out.println("fark= "+(num1-num2-num3-num4));

    }
}
