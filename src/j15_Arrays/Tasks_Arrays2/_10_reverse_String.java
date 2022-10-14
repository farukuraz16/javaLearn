package j15_Arrays.Tasks_Arrays2;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
String k = "Hello World";
        for (int i = k.length()-1; i >=0; i--) {
            System.out.print(k.charAt(i));

        }

    }
}