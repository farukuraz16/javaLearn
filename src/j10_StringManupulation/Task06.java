package j10_StringManupulation;

import java.util.Scanner;

public class Task06 {
       public static void main(String[] args) {
               /*
        Girilen String'in son karakterini silen code create ediniz...
         */

              Scanner dat = new Scanner(System.in);
              System.out.println("kelime= ");
              String a = dat.nextLine();

              System.out.println(a.substring(0, a.length() - 1));


       }
       }


