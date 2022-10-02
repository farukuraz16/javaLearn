package j10_StringManupulation.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        Scanner dat = new Scanner(System.in);
        System.out.println("password= ");
        String p = dat.nextLine();

        if ((p.charAt(0) >= 'A' && p.charAt(0) <= 'Z') &&
                (p.charAt(p.length() - 1) >= '0') && (p.charAt(p.length() - 1) <= '9') &&
                p.length() >= 6) {
            System.out.println("password= "+ p);}

           else { if (p.charAt(0) >= 'A' && p.charAt(0) <= 'Z') {
            } else System.out.println("ilk karakter büyük harf olmalı");

            if ((p.charAt(p.length() - 1) >= '0') && (p.charAt(p.length() - 1) <= '9')) {
                System.out.println("");
            } else System.out.println("son karakter rakam olmalı");

            if (p.length() >= 6) {
            } else System.out.println("şifre 6 karakter uzunluğunda olmalı");}


        }
    }

/*
    Scanner sc = new Scanner(System.in);
        System.out.println("password girişi yapınız : ");
    String password = sc.nextLine();

        if(
                (password.charAt(0)>='A'&&password.charAt(0)<='Z')&& //a şartı
                (password.charAt(password.length()-1)>='0'&&password.charAt(password.length()-1)<='9')&&//b şartı
                (password.length()>=6)//c şartı
                )

    {
        System.out.println("password geçerli");
    }else System.out.println("password geçersiz");
}
}
*/