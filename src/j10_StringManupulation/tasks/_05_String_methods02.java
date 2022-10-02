package j10_StringManupulation.tasks;

import java.util.Scanner;

public class _05_String_methods02 {

    public static void main(String[] args) {

    /*    Sprint planning olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.
        Scanner sc = new Scanner(System.in);
        System.out.println("metni giriniz: ");

        String dat= sc.nextLine();
        System.out.println("'"+dat+"'"+" cümlesindeki karakter sayısı: "+((dat.replaceAll("\\s", "")).length()));


    }
}
