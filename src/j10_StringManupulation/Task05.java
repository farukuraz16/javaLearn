package j10_StringManupulation;

import java.util.Locale;
import java.util.Scanner;

public class Task05 {
       public static void main(String[] args) {
               /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */

              Scanner dat = new Scanner(System.in);
              System.out.println("Ad= ");
              String a = dat.nextLine();
              System.out.println("Soyad= ");
              String s = dat.nextLine();
              System.out.println(a.substring(0,1).toUpperCase() + a.substring(1)+" "+ s.substring(0,1).toUpperCase()+s.substring(1));


       }
       }


