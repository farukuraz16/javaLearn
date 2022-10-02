package j10_StringManupulation;

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
        String pas = dat.nextLine();

        if ((pas.charAt(0) >= 'A' && pas.charAt(0) <= 'Z') && (pas.charAt(pas.length() - 1) >= '0' && pas.charAt(pas.length() - 1) <= '9') &&
           (pas.length() >= 6))
                                {System.out.println("pasword is Ok");}
        else {System.out.println("şifre geçersiz");
        }
    }}





