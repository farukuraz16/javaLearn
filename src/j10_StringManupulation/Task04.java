package j10_StringManupulation;

import java.util.Scanner;

public class Task04 {
       public static void main(String[] args) {
               /*
         Task->
         Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
         */
              Scanner dat = new Scanner(System.in);
              System.out.println("kelime1 giriniz= ");
              String name1 = dat.nextLine();
              System.out.println("kelime2 giriniz= ");
              String name2 = dat.nextLine();

       if (name1.length()%2==0){
              System.out.println((name1.substring(0,name1.length()/2))+ name2 + (name1.substring(name1.length()/2,name1.length())));
       }
       else System.out.println("kelime2 kelime1 eklenemez");




       }
       }


