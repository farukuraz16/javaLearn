package JAVA_LEARN.j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09_Nested {
    public static void main(String[] args) {

 /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("sayı giriniz= ");
        int s = dat.nextInt();

        for (int i =1; i<=s; i++){

            for (int j=1; j<=i; j++ ){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
