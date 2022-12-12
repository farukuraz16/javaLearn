package Practice.LambdaCodeChallenge_FARUK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

// S1:listi aralarinda bosluk birakarak yazdiriniz
        yazdir(list);
        System.out.println();
// S2:sadece be--negatşf olanları yazdır
        negatifYazdır(list);
        System.out.println();
        System.out.println(negatifYazdır2(list));

// S3: pozitif olanlardan yeni bir liste olustur
        pozitifYazir(list);
        System.out.println();
        List<Integer> pozitifList = list.stream().filter(x -> x > 0).collect(Collectors.toList());
        System.out.println("pozitifList = " + pozitifList);

// S4: list in elemanlarin karelerinden yeni bir list olusturalim
        List<Integer> kareleriList = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("kareleriList = " + kareleriList);
        System.out.println("karelist(list) = " + karelist(list));//method ile call

// S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
        System.out.println("uniqKareleri(list) = " + uniqKareleri(list));
        System.out.println();
// S6: listin elemanlarini kucukten buyuge siralayalim
        kucuktenBuyuge(list);

        System.out.println();
// S7: listin elemanlarini buyukten kucuge siralayalim
        buyuktenKucuge(list);
        System.out.println();

// S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        System.out.println("küpBesList(list) = " + küpBesList(list));

        System.out.println();
// S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        System.out.println("küpBesDegilList(list) = " + küpBesDegilList(list));

        System.out.println();
// S10 :list elemanlarini toplamini bulalim
        System.out.println("toplaList(list) = " + toplaList(list));

        System.out.println();

// S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
        System.out.println("negatifKarePeek(list) = " + negatifKarePeek(list));
/*
     peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
    ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
    yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir
     */


        // S12 : listeden 5 den buyuk  sayi var mi? -anyMatch
        System.out.println("listeden 5 den buyuk  sayi var mi? "+ list.stream().anyMatch(x -> x > 5));

        // S13 : listenin tum elemanlari sifirdan kucuk mu? -allMatch
        System.out.println("listenin tum elemanlari sifirdan kucuk mu? "+ list.stream().allMatch(x -> x <0));


        // S14: listenin 100 e esit elemani yok mu ? -noneMatch
        System.out.println("listenin 100 e esit elemani yok mu ?"+ list.stream().noneMatch(x->x==100));


        // S15: listenin sifira esit elemani yok mu? - noneMatch
        System.out.println("listenin 0 e esit elemani yok mu ?"+ list.stream().noneMatch(x->x==0));



        // S16:  listenin ilk 5 elemanini topla? - limit(5)

        System.out.println("list.stream().limit(5).reduce(0,(x,y)->x+y) = " + list.stream().limit(5).reduce(0, (x, y) -> x + y));

        // S17: listenin son bes elemaninin  listele -skip long

        list.stream().skip(list.size()-5).forEach(x-> System.out.print(x+" "));


    }//main
// S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim

    private static List<Integer> negatifKarePeek(List<Integer> list) {
        return list.stream().filter(x->x<0).peek(x-> System.out.println("Negatif sayı: " + x)).map(x->x*x).peek(x-> System.out.println("Karesi: "+x)).collect(Collectors.toList());

    }


// S10 :list elemanlarini toplamini bulalim

    private static int toplaList(List<Integer> list) {
       return list.stream().reduce(0,(x,y)->x+y);
    }


// S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim

    private static List<Integer> küpBesDegilList(List<Integer> list) {
        return list.stream().filter(x -> x > 0).map(x -> x * x).filter(x -> x % 10 != 5).collect(Collectors.toList());
    }

    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim

    private static List<Integer> küpBesList(List<Integer> list) {

        return list.stream().filter(x -> x > 0).map(x -> x * x * x).filter(x -> x % 10 == 5).collect(Collectors.toList());
    }

    private static void buyuktenKucuge(List<Integer> list) {
        System.out.print("Büyükten küçüğe sıralandı: ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
    }


    // S6: listin elemanlarini kucukten buyuge siralayalim
    private static void kucuktenBuyuge(List<Integer> list) {
        System.out.print("Küçükten büyüğe sıralandı: ");
        list.stream().sorted().forEach(x -> System.out.print(x + " "));
    }


// S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim

    private static List<Integer> uniqKareleri(List<Integer> list) {

        return list.stream().map(x -> x * x).distinct().collect(Collectors.toList());

    }


    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    private static List<Integer> karelist(List<Integer> list) {
        System.out.println();
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }


    // S3: pozitif olanlardan yeni bir liste olustur
    private static void pozitifYazir(List<Integer> list) {
        System.out.print("Pozitif sayılar: ");
        list.stream().filter(x -> x > 0).forEach(x -> System.out.print(x + " "));
    }


    // S2:sadece negatif olanları yazdır
    private static void negatifYazdır(List<Integer> list) {
        System.out.print("Negatif sayılar: ");
        list.stream().filter(x -> x < 0).forEach(x -> System.out.print(x + " "));
    }

    private static List<Integer> negatifYazdır2(List<Integer> list) {
        System.out.print("Negatif sayılar: ");
        return list.stream().filter(x -> x < 0).collect(Collectors.toList());
    }

    // S1:listi aralarinda bosluk birakarak yazdiriniz
    private static void yazdir(List<Integer> list) {
        System.out.print("Listteki sayılar: ");
        list.stream().forEach(x -> System.out.print(x + " "));
        // list.forEach(x-> System.out.print(x+" ")); istersek stream kullanmadan da yapabiliriz.
    }
}
