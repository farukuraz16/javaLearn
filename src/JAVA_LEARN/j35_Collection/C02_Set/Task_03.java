package JAVA_LEARN.j35_Collection.C02_Set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task_03 {
    public static void main(String[] args) {
        /*
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "Germany" , "Brazil" ,"USA"
    ArrayListi yazdırınız.
     */
        HashSet<String> hashSet1 = new HashSet<>(Arrays.asList("Germany", "England", "South Africa", "Brazil", "USA"));
        HashSet<String> hashSet2 = new HashSet<>(Arrays.asList("Germany", "China", "Brazil", "France", "USA"));

        ortak(hashSet1, hashSet2);

        ArrayList<String> ortakeleman = new ArrayList<>(ortak(hashSet1, hashSet2));
        System.out.println("ortakeleman = " + ortakeleman);

    }

    private static ArrayList ortak(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        hashSet1.retainAll(hashSet2);//ortak olmayanlar silindi. ortak olanlar hashSet1'e atandı..
        ArrayList<String> arrayList = new ArrayList<>(hashSet1);
        return arrayList;
    }
}
