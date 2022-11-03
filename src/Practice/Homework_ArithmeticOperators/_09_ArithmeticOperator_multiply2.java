package Practice.Homework_ArithmeticOperators;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner dat = new Scanner(System.in);
        System.out.print("bir numara giriniz: ");
        double num1 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        double num2 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        double num3 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        double num4 = dat.nextInt();
        double sonuc = num1*num2*num3*num4;
        System.out.println("sonuc= "+sonuc);

    }
}
