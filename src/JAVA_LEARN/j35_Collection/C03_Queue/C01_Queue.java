package JAVA_LEARN.j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
      Queue coll. interface oldgu için child calss olan LinkedList ve PriorityQueue
      ile obj uretilir.
      Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
      Cons seçimine göre queue obj özelliklieri belirlenir.
      FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir
       */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("Faruk", "Zekiye", "Enes Bera", "Rümeysa"));
        System.out.println("q1 = " + q1);

        q1.add("İnci");
        System.out.println("q1 = " + q1);

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("Rıdvan", "Hasibe", "Emin", "Fatma"));
        System.out.println("q2 = " + q2);
        q2.add("Hatçe");
        System.out.println("q2 = " + q2);

        System.out.println("q1 = " + q1);
        System.out.println("q1.peek() = " + q1.peek());
        System.out.println("q1.element() = " + q1.element());
        System.out.println("q1.remove() = " + q1.remove());
        System.out.println("q1 = " + q1);
        System.out.println("q1.poll() = " + q1.poll());
        System.out.println("q1 = " + q1);
        q1.offer("Hüsnü");
        System.out.println("q1 = " + q1);

        //peek()-> copt-paste gibi ilk elemanı return eder ama silmez
        //poll()-> cut-paste gibi ilk elemanı siler ve  return eder
        // element() -> ilk elemanı silmeden return eder.
        //remove() -> ilk elemnı siler ve return eder..

        //ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        // poll ise null return eder.

        q1.clear();
        System.out.println("q1 = " + q1);
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.poll() = " + q1.poll());
        //System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException
        System.out.println("q1 = " + q1);

        q1.offer("Zekiye");
        q1.offer("Faruk");
        System.out.println("q1 = " + q1);
/*
    ahan da Trick kösesinde bugun : offer ve add farkı ->  eger queue coll. eleman kısıtlaması yapılmış ise
     add meth Exception fırlatır.offer ise true-false return eder.
    */


    }
}
