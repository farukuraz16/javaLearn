package j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner dat = new Scanner(System.in);
        System.out.println("sayı gir=");
        int sayi = dat.nextInt();
        for (int i=0; i<sayi;i++){
            if (i%2!=0) System.out.println(i+", ");
                }

    }
}
