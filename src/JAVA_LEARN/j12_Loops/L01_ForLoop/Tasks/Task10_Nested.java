package JAVA_LEARN.j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {

  /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("cümle ya da kelimenizi giriniz= ");
        String s = dat.nextLine();

        System.out.println("hangi harf= ");
        char c = dat.nextLine().charAt(0);

        int harfsayisi =0;

        for (int i =0; i<= s.length()-1 ; i++){
                if (s.charAt(i)==c)
                {    harfsayisi++;
                            }

        }
        System.out.println(harfsayisi);
    }
}
