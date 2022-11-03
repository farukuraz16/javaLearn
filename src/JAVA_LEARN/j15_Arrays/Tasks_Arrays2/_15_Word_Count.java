package JAVA_LEARN.j15_Arrays.Tasks_Arrays2;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
        String w = "Removes white space from both ends of a string";
        int count = 0;
        String w1 []=w.split(" ");
        System.out.println("Arrays.toString(w1) = " + Arrays.toString(w1));
        System.out.println("how many words? = " + w1.length);

    }
}