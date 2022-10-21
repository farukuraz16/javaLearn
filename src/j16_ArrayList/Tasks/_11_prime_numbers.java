package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("pozitif sayı gir= ");
        int sayi = dat.nextInt();
        List<Integer> listSayi = new ArrayList<>();

        for (int i = 2; i < sayi; i++) {
            boolean asalmi = true;
            for (int j = 2; j < i ; j++) {
                if (i%j==0){asalmi=false;
                            break;   }
            }if (asalmi){listSayi.add(i);  }
                    }
        System.out.println(sayi+"'dan küçük"+ listSayi.size()+" adet asal sayı vardır. Asal sayılar: "+listSayi);
    }
}
