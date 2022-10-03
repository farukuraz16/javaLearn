package EkCalismalar;

import java.util.Scanner;

public class c09_StringManupulation {
    public static void main(String[] args) {

/*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */


        Scanner dat = new Scanner(System.in);
        System.out.println("kelime?= ");
        String word = dat.nextLine();
        if (word.length()%2!=0 && word.length()>=3){
            System.out.println(word.charAt(word.length()/2));
        } else {
            System.out.println("çift sayı");


}}}
