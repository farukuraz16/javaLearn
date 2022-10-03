package EkCalismalar;

import java.util.Scanner;

public class c10_StringManupulation {
    public static void main(String[] args) {
// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.


        Scanner dat = new Scanner(System.in);
        System.out.println("isim= ");
        String ad = dat.nextLine();
        System.out.println("soyisim= ");
        String soyad = dat.nextLine();

        if (ad.length()>soyad.length()){
            System.out.println(ad);
        } else if (ad.length()<soyad.length()) {
            System.out.println(soyad);}
        else {
            System.out.println("eşit");


}}}
