package Code_Challange_Elly;

import java.util.Scanner;

public class Q7_dowhile {
    public static void main(String[] args) {
         /*
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" yazan programı yazınız.
     */
        Scanner dat = new Scanner(System.in);

        char h;
        do {

            System.out.println("harf?= ");
            h = dat.nextLine().charAt(0);
            System.out.println("program çalışıyor");

        } while (h!='x');
        System.out.println("bitti");


    }
}
