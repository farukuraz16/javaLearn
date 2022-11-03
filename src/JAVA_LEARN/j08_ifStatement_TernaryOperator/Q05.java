package JAVA_LEARN.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
Scanner dat = new Scanner(System.in);
        System.out.println("yas?= ");
        int yas = dat.nextInt();
        System.out.println("kilo?= ");
        int kilo = dat.nextInt();
        if (yas<18){
            System.out.println("yapamaz!");}
        else if (yas>=18 && kilo<50){
            System.out.println("yapamaz!");}
        else System.out.println("yapabilir!");

    }

}
