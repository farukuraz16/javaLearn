package Homework_ArithmeticOperators;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner dat = new Scanner(System.in);
        System.out.print("bir numara giriniz: ");
        double num1 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        double num2 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        double num3 = dat.nextInt();
        double sonuc = num1*num2*num3;
        System.out.println("sonuc= "+sonuc);

    }
}
