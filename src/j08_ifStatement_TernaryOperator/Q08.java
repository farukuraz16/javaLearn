package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
Scanner dat = new Scanner(System.in);

        System.out.println("müşteri kartı? (E/H)= ");
        char k = dat.nextLine().charAt(0);
        System.out.println("kaç adet?= ");
        int u= dat.nextInt();
        System.out.println("fiyat?= ");
        int f= dat.nextInt();

        double f1= ((u*f)*0.20);
        double f2= ((u*f)*0.15);
        double f3= ((u*f)*0.10);
        int subtotal= (u*f);

        if (k=='E' || k=='e'){
            if (u>10){
                System.out.println("tutar= "+ (subtotal-f1));
            }else System.out.println("tutar= "+ (subtotal-f2));
            }
        if (k=='H' || k=='h'){
            if (u>10){
                System.out.println("tutar= "+ (subtotal-f2));
            }else System.out.println("tutar= "+ (subtotal-f3));
            }


        }

}
