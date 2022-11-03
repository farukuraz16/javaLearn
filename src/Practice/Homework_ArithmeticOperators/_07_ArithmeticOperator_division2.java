package Practice.Homework_ArithmeticOperators;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        Scanner dat = new Scanner(System.in);
        System.out.print("bir numara giriniz: ");
        int num1 = dat.nextInt();
        System.out.print("\nbir numara giriniz: ");
        int num2 = dat.nextInt();
        int sonuc = num1/num2;
        System.out.println("sonuç= "+sonuc);





    }
}
