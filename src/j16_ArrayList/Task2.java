package j16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
         /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */
        Scanner dat = new Scanner(System.in);
        System.out.println("kaç adet not gireceksiniz= ");
        int notsayisi = dat.nextInt();

        ArrayList<Integer> notlar = new ArrayList<>();
        for (int i = 0; i < notsayisi; i++) {
            System.out.println(i + 1 + ". öğrencinin notunu giriniz= ");
            int notgiris = dat.nextInt();
            notlar.add(notgiris);
        }
        System.out.println("sinifortlamasi(notlar) = " + sinifortlamasi(notlar));
        System.out.println("ortalamaUstu(notlar) = " + ortalamaUstu(notlar));

    }

    private static int ortalamaUstu(ArrayList<Integer> notlar) {
        int ogrencisayi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > sinifortlamasi(notlar)) {
                ogrencisayi++;
            }

        }
        return ogrencisayi;
    }

    private static int sinifortlamasi(ArrayList<Integer> notlar) {
        int toplam = 0;
        for (int i = 0; i < notlar.size(); i++) {
            toplam += notlar.get(i);
        }
        return toplam / notlar.size();
    }


}

