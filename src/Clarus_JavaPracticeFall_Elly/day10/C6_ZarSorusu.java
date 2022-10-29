package Clarus_JavaPracticeFall_Elly.day10;

import java.util.Random;

public class C6_ZarSorusu {
    public static void main(String[] args) {
        /*
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" yazisini yazdirin,
     aksi takdirde "Tekrar deneyiniz" yazisi yazmali
     */
Random random = new Random();
        int atis1= random.nextInt(7);
        System.out.println(atis1);
        int atis2= random.nextInt(7);
        System.out.println(atis2);

        System.out.println(atis1 + atis2 == 9 ? "kazandınız" : "tekrar deneyiniz");

    }
}
