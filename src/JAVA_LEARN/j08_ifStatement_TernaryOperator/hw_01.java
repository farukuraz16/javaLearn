package JAVA_LEARN.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class hw_01 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin
        //
        //Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
        //Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        //Eger 10 dan kucuk ise "Normalsin!" yazdirin
        //
        //Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
        //Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        //Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
        //
        Scanner dat = new Scanner(System.in);
        System.out.println("pls enter a number: ");
        int nmbr = dat.nextInt();
        System.out.println(nmbr);

        if (nmbr>10){
            System.out.println("Buyuksun!");}
        else if (nmbr<10 && nmbr>0){
            System.out.println("Normalsin!");}

        else if (nmbr<0 && nmbr> -10){
            System.out.println("Negatifsin!");}
        else System.out.println("Cok Negatifsin!");

    }
}
