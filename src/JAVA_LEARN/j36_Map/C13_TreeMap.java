package JAVA_LEARN.j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
        TreeMap->
        1-TreeMap key'lrde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
         */

        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(103, "Faruk");
        tm.put(104, "Zekiye");
        tm.put(105, "Enes Bera");
        tm.put(106, "Rümeysa");
        System.out.println("tm = " + tm);

        // tm.put(null,"İnci");//NullPointerException
        tm.put(104, "Zekiye Yavuz");//update edildi.
        tm.put(106, null);
        tm.put(107, null);
        System.out.println("tm = " + tm);

        HashMap<String,String> hm = new HashMap<>();
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);

        TreeMap<String,String> tm1 = new TreeMap<>(hm);//hm TreeMap e atanarak convert edildi
        //TreeMap<String, String> tm2 = hm;//CTE->dataType miss-Match
        System.out.println("tm1 = " + tm1);

        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));//103 ceilingKey(103);->method parametre olarak girilen key değer map'de varsa return eder
        // yoksa parametreden buyuk en kuçuk key değerini return eder.
        //parametre map'de yok ve parametreden buyuk en kucuk  key de yoksa null return eder
        //ceilingKey(key)-> en kucuk abi-abla
        System.out.println("tm.ceilingKey(108) = " + tm.ceilingKey(108));//null
        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1));//101-> 1'den buyuk en kucuk key 101
        System.out.println("tm.ceilingKey(110) = " + tm.ceilingKey(110));//null -> 110 dan b uyuk en kucuk key yok

        //ascending order-> artan sıralama
        //descending order-> azalan sıralama
        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());
        System.out.println("tm.keySet() = " + tm.keySet());//[101, 102, 103, 104, 105, 106, 107]
        System.out.println("tm.firstKey() = " + tm.firstKey());//101
        System.out.println("tm.lastKey() = " + tm.lastKey());//107

    }
}
