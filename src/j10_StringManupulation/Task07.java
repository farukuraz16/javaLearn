package j10_StringManupulation;

import java.util.Scanner;

public class Task07 {
       public static void main(String[] args) {
               /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

              Scanner dat = new Scanner(System.in);
              System.out.println("kelime= ");
              String a = dat.nextLine();
              System.out.println("index= ");
              int i = dat.nextInt();

              System.out.println(a.charAt(i));

       }
       }


