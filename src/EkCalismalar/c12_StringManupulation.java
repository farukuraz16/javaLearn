package EkCalismalar;

import java.util.Scanner;

public class c12_StringManupulation {
    public static void main(String[] args) {
// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        Scanner dat = new Scanner(System.in);
        System.out.println("metin= ");
        String ad = dat.nextLine();

        int a = ad.indexOf(" ");

        if (a == -1 && !ad.isEmpty())
            System.out.println("uygun");
        else System.out.println("uygun değil");

    }
}
