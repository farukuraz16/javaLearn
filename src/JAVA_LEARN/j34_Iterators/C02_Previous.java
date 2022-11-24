package JAVA_LEARN.j34_Iterators;

import java.util.*;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(16, 10, 34, 17, 06, 25, 22, 64));

        System.out.println("list = " + l1);

        //l1 elemanlarını tersten print ediniz...

        /*
        tersten sona doğru işlem yapabilmesi için pointer en sona götürülmeli.
        bunun için pointerı sona götüren hasnext() method çalışmalı.
         */
        ListIterator<Integer> a1 = l1.listIterator();

        while (a1.hasNext()) {//buradaki while loop ile pointer en baştan sıra ile  en sona gider. her hangi bir print almayız.
            a1.next();
        }

        while (a1.hasPrevious()) {//pointer bir önceki while ile sona gitmişti. burada da adım adım geri geliyor.
            System.out.print(a1.previous() + " ");
        }


        System.out.println("\n   \n");


        List<String> l2 = new ArrayList<>(Arrays.asList("enes", "bera", "rümeysa", "zekiye", "faruk"));
        System.out.println("l2 işlem öncesi " + l2);
        //l2 elemanlarının sonuncusuna :) ekleyip print ediniz..
        ListIterator<String> it2 = l2.listIterator();

        while (it2.hasNext()) {
            String s = it2.next();

            if (!it2.hasNext()) {
                it2.set(s + " :) ");
            }
        }
        System.out.println("l2 işlem sonrası " + l2);

    /*
      çoooğ önemli ->  hasPrevious() meth için MUTLAKA KESİNLİKLE hasNext() ve next() meth
      calıştırılarak cursor(pointer) en sona getirilmeli.

      ITERATOR VE LISTITERATOR farkları

      1- ITERATOR-> sadece hasNext(), next(), remove() meth çalışır
         LISTITERATOR -> hasNext(), next(), remove(). hasPrevious(), previous(),add(), set() vs methodlar çalışır

      2- LISTITERATOR -> sadece List yapılarda tanımlanır
         ITERATOR-> tum collection(list set Array, map..) için tanımlanır.

      3- ITERATOR-> sadece ileri b->s tekrarlar
        LISTITERATOR -> b<->s ileri ve geri çift yönlü tekrarlar

        ITERATOR-> kapsamı geniş ama aksiyonu az
        LISTITERATOR -> kapsamı dar ama aksiyıonu çok

         */


    }
}
