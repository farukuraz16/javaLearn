package j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

        Scanner dat = new Scanner(System.in);
        System.out.println("adınız= ");
        String ad = dat.nextLine();
        System.out.println("soy adınız= ");
        String soyad = dat.nextLine();

        int aduzunluk = ad.length();
        int soyaduzunluk = soyad.length();

        for (int i = 0; i < aduzunluk; i++) {
            System.out.print(ad.charAt(i) + " ");
        }
        for (int j = 0; j < soyaduzunluk; j++) {
            System.out.print(soyad.charAt(j) + " ");
        }


    }


}


