package Code_Challange_Elly;

import java.util.Scanner;

public class Q6_recursiveforloop {
    public static void main(String[] args) {
         /*  Problem Tanımı
  Verilen iki sayının kombinasyonunu bulan kodu yazınız.
  Hatırlatma C(n,r) = n! / (r!(n-r)!)
  Verilen iki sayının permütasyonunu bulan kodu yazınız.
  Hatırlatma P(n,r) = n! / (n-r)!
  Ekran Çıktısı
  Birinci sayıyı giriniz: 15
  Ikinci sayıyı giriniz: 4
  Kombinasyon: 1365
  permütasyon: 32760
  Birinci sayıyı giriniz: 5
  Ikinci sayıyı giriniz: 3
  Kombinasyon: 10
  permütasyon: 60
*/
        Scanner dat = new Scanner(System.in);
        System.out.println("1. sayı= ");
        int sayi1 = dat.nextInt();
        System.out.println("2. sayı= ");
        int sayi2 = dat.nextInt();

        F(sayi1);
        F(sayi2);

        System.out.println("kombinasyon = " + C(F(sayi1), F(sayi2), sayi1, sayi2));

        System.out.println("permütasyon = " + P(F(sayi1), F(sayi2), sayi1, sayi2));
    }

    private static int P(int f1, int f2, int sayi1, int sayi2) {
        int P = f1 / (F(sayi1-sayi2));
        return P;
    }

    private static int C(int f1, int f2, int sayi1, int sayi2) {
        int C = f1 / (f2*(F(sayi1-sayi2)));
        return C;
    }

    private static int F(int sayi) {
        int faktoriyel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel*=i;

        }return faktoriyel;
    }
}
