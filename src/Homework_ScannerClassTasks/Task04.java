package Homework_ScannerClassTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner input= new Scanner(System.in);
        System.out.print("Ad: ");
        String a= input.nextLine();
        System.out.print("Soyad: ");
        String s= input.nextLine();
        System.out.print("Yaş: ");
        int y= input.nextInt();
        System.out.print("Kilo: ");
        int k= input.nextInt();
        System.out.print("Boy (cm): ");
        float b= input.nextFloat();
        System.out.print("Ne kadar süre devam edeceksiniz?: ");
        int t= input.nextInt();
        System.out.print("Ad Soyad: " +a+" "+s+"\nYaş: "+y+"\nBoy & Kilo: "+b+" cm"+" & "+k+" kg"+"\nSüre: "+t+"ay"+"\nÜcret: "+"$"+(t*20));


    }
}
