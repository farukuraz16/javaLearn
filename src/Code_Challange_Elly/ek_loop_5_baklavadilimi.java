package Code_Challange_Elly;

import java.util.Scanner;

public class ek_loop_5_baklavadilimi {
    public static void main(String[] args) {
/*
        aşağıdaki şekli print eden code create ediniz

             *
            * *
           * * *
          * * * *
         * * * * *
          * * * *
           * * *
            * *
             *


         */

        Scanner dat = new Scanner(System.in);
        System.out.println("şekil için bit boyut giriniz= ");
        int boyut = dat.nextInt();

        for (int i = 1; i <= boyut; i++) {

            for (int j = boyut; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        for (int i = 1; i < boyut; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = boyut; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}








