package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1

            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1
            şekli print eden code create ediniz
         */
        Scanner dat = new Scanner(System.in);
        System.out.println("sayı giriniz= ");
        int s = dat.nextInt();

        for (int i =1; i<=s; i++){

             for (int j=1; j<=s; j++ ){
                 if (i==j){
           System.out.print(" "+1);
        }else System.out.print(" "+0);
             }
            System.out.println();
    }
}}
