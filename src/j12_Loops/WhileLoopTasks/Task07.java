package j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner dat = new Scanner(System.in);

        int max=0;
        int k=1;
        while (k <6) {
            System.out.println("bir sayı giriniz");
            int sayi= dat.nextInt();
            if(sayi>max) max=sayi;
            k++;
        }System.out.println("en büyük sayı= "+max);

    }
}
