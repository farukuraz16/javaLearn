package JAVA_LEARN.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>
                (Arrays.asList("küşleme","küşleme","küşleme","soğanlı","soğanlı","soğanlı","trileçe","bicibici","büryan","melemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));

        alfBkTkszPrint(menu);
        System.out.println("\n   ***   ");
        chrSysTersSıraPrint(menu);
        System.out.println("\n   ***   ");
        chrSysBkSıraPrint(menu);
        System.out.println("\n   ***   ");
        sonHrfTrsPrint(menu);
        System.out.println("\n   ***   ");
        krktrCiftKareSirala(menu);
        System.out.println("\n   ***   ");

    }//main




// Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

    public  static  void  alfBkTkszPrint( List<String > menu){
        menu.stream().map(String::toUpperCase).sorted().distinct().forEach(t-> System.out.print(t+" "));

        /*
        menu.
                stream().
                map(String::toUpperCase).
                sorted().
              //  distinct().
                forEach(t-> System.out.print(t+" "));

    //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
    // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
    // Sıralı akışlar için, farklı elemanın seçimi sabittir
    // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
    // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
         */
    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    private static void chrSysTersSıraPrint(List<String> menu) {
        menu.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.print(t+" "));
    }
    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz...

    public static void chrSysBkSıraPrint(List<String> menu){

      //  menu.stream().map(String::length).sorted().forEach(t-> System.out.print(t+" ")); --bu şekilde yazarsak karakter sayılarını print eder. biz list elemalarını istiyoruz.

        menu.stream().sorted(Comparator.comparing(String::length)).map(String::toUpperCase).//akısdaki string elemanların lenght'ine göre doğal sıra yapıldı
                forEach(t-> System.out.print(t+" "));
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHrfTrsPrint(List<String> menu){
        menu.stream().
                sorted(Comparator.
                        comparing(t->t.toString().
                                charAt(t.toString().length()-1)).
                        reversed()).
                forEach(t-> System.out.print(t+" "));
    }
// Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

    public static void krktrCiftKareSirala(List<String> menu){
        menu.stream().map(String::length).filter(C01_LambdaExpression::ciftMi).map(t->t*t).sorted(Comparator.reverseOrder()).distinct().forEach(C01_LambdaExpression::yazdır);
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    }
}
