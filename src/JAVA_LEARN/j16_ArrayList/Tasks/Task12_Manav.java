package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {


    public static void main(String[] args) {

        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        List<String> urunlist = new ArrayList<>(List.of("elma", "armut", "domates", "biber", "üzüm"));
        List<Integer> fiyatlist = new ArrayList<>(List.of(15, 20, 15, 30, 15));
        Scanner dat = new Scanner(System.in);
        int toplamfiyat = 0;


        String karar = "e";

        while (karar.equals("e")) {

            toplamfiyat += ürünfiyat(urunlist, fiyatlist);
            System.out.println("alışverişe devam etmek istiyor musunuz->> E/H");
            karar = dat.next().toLowerCase();
                    }


        System.out.println("iyi günler dileriz." + " ");

        System.out.println("toplamfiyat = " + toplamfiyat);


    }

    public static double ürünfiyat(List<String> urunlist, List<Integer> fiyatlist) {

        Scanner dat = new Scanner(System.in);
        System.out.println(urunlist + "almak istediğiniz ürünü seçiniz?=");
        String secim = dat.nextLine().toLowerCase();
        int fiyat = 0;
        System.out.println("kaç kilo? =");
        int kilo = dat.nextInt();

        return fiyatlist.get(urunlist.indexOf(secim)) * kilo;

    }


}








