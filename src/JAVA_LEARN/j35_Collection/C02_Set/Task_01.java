package JAVA_LEARN.j35_Collection.C02_Set;

import java.lang.reflect.Array;
import java.util.*;

public class Task_01 {
    public static void main(String[] args) {
        /*
        Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
        main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */

        String arr []={"Zekiye","Faruk","Rümeysa","Enes Bera"};
        arrayListecevir(arr);
        HashSet<String> hs = new HashSet<>(List.of(arr));//arrayliste çevirmeden de bu şekilde ekleyebiliriz.
        LinkedList<String> ll= new LinkedList<>(arrayListecevir(arr));
        TreeSet<String> ts = new TreeSet<>(arrayListecevir(arr));



        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("hs = " + hs);//hurraa set... yani kafasına göre sıralama...
        System.out.println("ll = " + ll);//birinciden başlayarak sıralama...
        System.out.println("ts = " + ts);//alfabetik sıralama...

    }

    private static ArrayList arrayListecevir(String[] arr) {
        ArrayList<String> arrList= new ArrayList<>(List.of(arr));


return arrList;
    }
}
