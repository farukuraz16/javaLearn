package JAVA_LEARN.j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task_02 {
    public static void main(String[] args) {
        // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız.
        // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...

        long tsBasla = System.currentTimeMillis();
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Faruk");
        treeSet.add("Zekiye");
        treeSet.add("Enes");
        treeSet.add("Rümeysa");
        System.out.println("treeSet = " + treeSet);
        long tsBitir = System.currentTimeMillis();
        System.out.println(tsBitir - tsBasla);


        long hashBasla = System.currentTimeMillis();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Osman");
        hashSet.add("Esra");
        hashSet.add("Elif");
        hashSet.add("İnci");
        System.out.println("hashSet = " + hashSet);
        long hashBitir = System.currentTimeMillis();
        System.out.println(hashBitir - hashBasla);


    }

}
