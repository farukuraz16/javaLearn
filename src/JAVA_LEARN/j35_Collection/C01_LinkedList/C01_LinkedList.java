package JAVA_LEARN.j35_Collection.C01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
        LinkedList .....
        1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node" olarak tanımlanır.
        2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.Linkedlist eleman bulmada index yapısı olmadıgı için başarısıdır.
        5-LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşümülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına diakkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList clss iki tane parent interface'den(List,Queue) implemet etmiştir.
         */
public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1= new LinkedList<>(Arrays.asList("Faruk","Enes","Rümeysa","Zekiye"));//LinkedList declare ve assignment yaptık
        //LinkedList print..
        System.out.println("ll1 = " + ll1);//[Faruk, Enes, Rümeysa, Zekiye]
        ll1.add("Uğur");
        System.out.println("ll1 = " + ll1);//[Faruk, Enes, Rümeysa, Zekiye, Uğur]
        ll1.add(2, "Elif");
        System.out.println("ll1 = " + ll1);//[Faruk, Enes, Elif, Rümeysa, Zekiye, Uğur]
        ll1.addFirst("İnci");
        System.out.println("ll1 = " + ll1);//[İnci, Faruk, Enes, Elif, Rümeysa, Zekiye, Uğur]
        ll1.addLast("Osman");
        System.out.println("ll1 = " + ll1);//[İnci, Faruk, Enes, Elif, Rümeysa, Zekiye, Uğur, Osman]

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("ali", "veli", "deli"));
        List<String> ll3 = new ArrayList<>(Arrays.asList("ayşe", "fatma", "hayriye"));

        ll1.addAll(ll2);
        System.out.println("ll1 = " + ll1);//[İnci, Faruk, Enes, Elif, Rümeysa, Zekiye, Uğur, Osman, ali, veli, deli]
        ll1.addAll(ll3);
        System.out.println("ll1 = " + ll1);//[İnci, Faruk, Enes, Elif, Rümeysa, Zekiye, Uğur, Osman, ali, veli, deli, ayşe, fatma, hayriye]

        //todo ll1.addAll("hüsnü")//CTE verir...

        ll1.addAll(2,ll2);
        System.out.println("ll1 = " + ll1);//[İnci, Faruk, ali, veli, deli, Enes, Elif, Rümeysa, Zekiye, Uğur, Osman, ali, veli, deli, ayşe, fatma, hayriye]
        ll1.addAll(1,ll3);
        System.out.println("ll1 = " + ll1);//[İnci, ayşe, fatma, hayriye, Faruk, ali, veli, deli, Enes, Elif, Rümeysa, Zekiye, Uğur, Osman, ali, veli, deli, ayşe, fatma, hayriye]
        ll1.addAll(5,ll1);
        System.out.println("ll1 = " + ll1);//[İnci, ayşe, fatma, hayriye, Faruk, İnci, ayşe, fatma, hayriye, Faruk, ali, veli, deli, Enes, Elif, Rümeysa, Zekiye, Uğur, Osman, ali, veli, deli, ayşe, fatma, hayriye, ali, veli, deli, Enes, Elif, Rümeysa, Zekiye, Uğur, Osman, ali, veli, deli, ayşe, fatma, hayriye]




    }

}
