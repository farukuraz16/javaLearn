package JAVA_LEARN.j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */


        sayıgiris();
       //Scanner dat = new Scanner(System.in);
       //System.out.println("sayı1= ");
       //int s1 = dat.nextInt();
       //System.out.println("sayı2= ");
       //int s2 = dat.nextInt();

       //if (s1<s2){
       //    cift(s1,s2);
       //}else System.out.println("birinci sayı ikinci sayıdan küçük olmalı");


    }//main sonu

    private static void sayıgiris() {
        Scanner dat = new Scanner(System.in);
        System.out.println("sayı1= ");
        int s1 = dat.nextInt();
        System.out.println("sayı2= ");
        int s2 = dat.nextInt();

        if (s1<s2){
            cift(s1,s2);
        }else System.out.println("birinci sayı ikinci sayıdan küçük olmalı. \n Lütfen tekrar sayı giriniz");
        sayıgiris();
    }

    private static void cift(int s1, int s2) {

        for (int i =s1; i<=s2; i++){
        if (i%2==0){
            System.out.println(i+" ,");
        }

        }

    }
}
