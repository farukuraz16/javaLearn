package Homework_ArithmeticOperators;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

        Scanner dat = new Scanner(System.in);
        System.out.print("bir numara giriniz: ");
        int num1 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num2 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num3 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num4 = dat.nextInt();
        System.out.println("toplam= "+(num1+num2+num3+num4));


    }
}
