package Homework_ScannerClassTasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

Scanner input = new Scanner(System.in);
        System.out.print("vize1: ");
        int v1= input.nextInt();
        System.out.print("vize2: ");
        int v2= input.nextInt();
        System.out.print("final: ");
        int f= input.nextInt();
        System.out.print("Geçme Notu = " + Math.round((((v1+v2)/2)*0.30)+(f*0.70)));


    }
}
