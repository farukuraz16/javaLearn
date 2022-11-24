package JAVA_LEARN.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1= new LinkedList<>(Arrays.asList("Faruk","Enes","Rümeysa","Hayri","Faruk","Zekiye","Rümeysa"));
        System.out.println("ll1.remove() = " + ll1.remove());//ilk node silinir ve silinen node getirilir.
        System.out.println("ll1 = " + ll1);//[Enes, Rümeysa, Hayri, Faruk, Zekiye, Rümeysa]
        System.out.println("ll1.remove(3) = " + ll1.remove(3));//silinen node print edilebilir
        System.out.println("ll1 = " + ll1);//[Enes, Rümeysa, Hayri, Zekiye, Rümeysa]

        //true veya false için node adı yazılır..olmayan eleman için false verir. eleman varsa true verir ve elemanı siler.
        System.out.println("ll1.remove(\"Enes\") = " + ll1.remove("Enes"));//true
        System.out.println("ll1.remove(\"Faruk\") = " + ll1.remove("Faruk"));//false
        System.out.println("ll1 = " + ll1);

        System.out.println("ll1.removeFirstOccurrence(\"Rümeysa\") = " + ll1.removeFirstOccurrence("Rümeysa"));//true
        System.out.println("ll1 = " + ll1);//ilk Rümeysayı sildi..[Hayri, Zekiye, Rümeysa]

        System.out.println("ll1.removeLastOccurrence(\"Faruk\") = " + ll1.removeLastOccurrence("Faruk"));//false...

        System.out.println("ll1.element() = " + ll1.element());//Hayri.. ilk node u verir..

        LinkedList<String> ll2= new LinkedList<>(Arrays.asList("Ali","Ayşe","Hüsnü"));
        LinkedList<String> ll3= new LinkedList<>(Arrays.asList("Fatma","Hayriye","Ahmet"));
        System.out.println("ll2 = " + ll2);
        System.out.println("ll3 = " + ll3);

        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);
        System.out.println("ll2.remove(ll3) = " + ll2.removeAll(ll3));
        System.out.println("ll2 = " + ll2);

        System.out.println("ll2.get(5) = " + ll2.get(1));
        System.out.println("ll2.getFirst() = " + ll2.getFirst());
        System.out.println("ll2.getLast() = " + ll2.getLast());



    }

}
