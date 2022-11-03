package JAVA_LEARN.j10_StringManupulation.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner dat =  new Scanner(System.in);
        System.out.println("Ad Soyad giriniz... ");
        String as= dat.nextLine();

        System.out.println("Adınız= "+as.substring(0, as.indexOf(" "))+"\nSoyadınız= "+as.substring(as.indexOf(" "),as.length()));

    }
}
