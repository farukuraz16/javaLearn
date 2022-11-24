package JAVA_LEARN.j34_Iterators;


import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));

        System.out.println("List l1 ilk hali = " + l1);
        System.out.println(" ");
        System.out.println("***");

        //l1 elemanlarını forloop ile print ediniz..

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("***");
        //l1 elemanlarını foreach ile print ediniz..

        for (String e : l1) {
            System.out.print(e + " ");

        }
        System.out.println(" ");
        System.out.println("***");

        //l1 elamanlarının her birini update edip print ediniz.. :-) ekleyiniz..

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + ":-)");
        }
        System.out.println("l1 list update sonrası = " + l1);
        System.out.println(" ");
        System.out.println("***");

//l1 elamanlarının her birini foreach update edip print ediniz.. :-( ekleyiniz..

        for (String e : l1) {//l1 elemanları foreach ile set edilemez..
            e += ":-(";
            System.out.println(e);
        }
        System.out.println("l1 list update sonrası = " + l1);
        System.out.println(" ");
        System.out.println("***");
/*
index desteklemeyen yapılarda tekrarlayan aksiyon için foreach loop update yapamayabilir.
 yukarıdaki taskte olduuğu gibi.
 bu durumda java iterator interface'dan yapılaak tekrarlardan faydalanılabilir.
 */
        System.out.println("*** ITERATOR ***");

        Iterator<String> it1 = l1.iterator();//iterator interface'den it1 isminde bir variable tanımalndı.l1 elemanları atandı.
        while (it1.hasNext()) {//it1 elemanlarını sıra ile kontrole edecek.
            //it1.next();//listin sıradaki elemanını return eder.
            System.out.print(it1.next());
        }

        System.out.println(" ");
        System.out.println("***");

        //l2 elemanlarını silelim..

        List<String> l2 = new ArrayList<>(Arrays.asList("Rümeysa", "EnesBera", "Zekiye", "Faruk"));
        System.out.println("l2 iterator öncesi = " + l2);

        Iterator<String> it2 = l2.iterator();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }

        System.out.println("l2 iterator remove sonrası = " + l2);

        System.out.println(" ");
        System.out.println("***");



        //l3 elemanlarını set edelim..

        List<String> l3 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Hatçe", "Ayşe"));
        System.out.println("l3 iterator öncesi = " + l3);

        ListIterator<String> it3 = l3.listIterator();
        while (it3.hasNext()) {
            it3.set(it3.next() + ":)");//next ile gelen elemanı set et...

        }
        System.out.println("l3 listiterator sonrası = " + l3);

        System.out.println(" ");
        System.out.println("***");



        //l3 elemanlarının ilk harfi büyük, kalan üç harfi *** ve l4 list ekleyip print ediniz.


        System.out.println("l3 iterator öncesi = " + l3);

        List<String> l4 = new ArrayList<>(Arrays.asList("Kırmızı", "Sarı", "Mavi", "Yeşil"));
        System.out.println("l4 iterator öncesi = " + l4);

        ListIterator<String> it4 = l4.listIterator();
        ListIterator<String> newit = l3.listIterator();
        while (newit.hasNext()) {
            newit.set(newit.next().toUpperCase().charAt(0) + "***");//next ile gelen elemanı set et...
            newit.add(l4.toString());
        }
        System.out.println("l3 listiterator sonrası = " + l3);



    }
}
