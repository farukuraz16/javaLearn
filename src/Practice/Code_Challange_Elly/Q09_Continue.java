package Practice.Code_Challange_Elly;

import java.util.Scanner;

public class Q09_Continue {
    public static void main(String[] args) {
        /*
    Q09_Continue
  /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin


        Scanner dat = new Scanner(System.in);
        System.out.println("kelime?= ");
        String word = dat.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a' || word.charAt(i)==' ') continue;
                    System.out.println(word.charAt(i));}

        }




    }


