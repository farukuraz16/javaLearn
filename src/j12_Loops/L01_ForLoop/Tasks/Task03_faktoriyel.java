package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task03_faktoriyel {
    public static void main(String[] args) {
/*
       Task -> girilen sayının faktoriyelini hesaplayan method create ediniz
       sayi!= 1*2*3* ...*sayi
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int s = dat.nextInt();

    faktor(s);

    faktor2(s);

    }//main sonu

    private static void faktor2(int s) {
        int faktoriyel =1;
        for (int i=1 ; i<=s; i++) {
            faktoriyel*=i;

        }
        System.out.println(faktoriyel);
        }



    private static void faktor(int s) {

        for (int i = s-1; i>0; i-- ){
            s=s*i;
        }
        System.out.println(s);

    }
}
