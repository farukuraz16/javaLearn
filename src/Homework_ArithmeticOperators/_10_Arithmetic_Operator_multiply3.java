package Homework_ArithmeticOperators;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner dat = new Scanner(System.in);
        System.out.print("bir numara giriniz: ");
        int num1 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num2 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num3 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num4 = dat.nextInt();
        int sonuc = num1*num2*num3*num4;
        System.out.println("sonuç= "+sonuc);


    }
}
