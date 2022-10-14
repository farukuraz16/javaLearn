package j15_Arrays.Tasks_Arrays;

import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner dat = new Scanner(System.in);
        System.out.println("sayı giriniz= ");
        int sayi = dat.nextInt();
        ;
        for (int i = String.valueOf(sayi).length()-1; i >=0 ; i--) {
            System.out.print(String.valueOf(sayi).charAt(i));

        }


    }
  
}
