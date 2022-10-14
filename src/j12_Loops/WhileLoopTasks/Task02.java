package j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner dat = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi1 = dat.nextInt();
        System.out.print("sayı giriniz= ");
        int sayi2 = dat.nextInt();
        int i;
        for (i=sayi1+1; i<sayi2; i++){
            System.out.print(i+", ");

        }
        System.out.println();

        int j=sayi1+1;

        while (j<sayi2){
            System.out.print(j+", ");
            j++;
        }

    }
}
