package JAVA_LEARN.j12_Loops.L01_ForLoop.hw_loop;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("sayı gir= ");
        int sayi = dat.nextInt();

        getAsalMi(sayi);

    }
    private static void getAsalMi(int sayi) {
        boolean asal = true;
        int bölünme=0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                bölünme++;
                asal = bölünme==0 ? true : false;
            }
        }
        System.out.println(asal);

    }}


