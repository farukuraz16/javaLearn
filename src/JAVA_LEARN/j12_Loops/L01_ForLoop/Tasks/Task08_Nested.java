package JAVA_LEARN.j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task08_Nested {
    public static void main(String[] args) {
         /*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       5x5
         */
        Scanner dat = new Scanner(System.in);
        System.out.println("sayı giriniz= ");
        int s = dat.nextInt();

        for (int i =1; i<=s; i++){

             for (int j=1; j<=s; j++ ){
                System.out.print(j*i+" ");
        }

            System.out.println();
    }
}}
