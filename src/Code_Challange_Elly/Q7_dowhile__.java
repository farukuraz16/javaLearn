package Code_Challange_Elly;

import java.util.Scanner;

public class Q7_dowhile__ {
    public static void main(String[] args) {
         /*
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" yazan programı yazınız.
     */


        char a;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bir harf tanimlayiniz: ");
            a = sc.next().toLowerCase().trim().charAt(0);

        } while (a != 'x');
        System.out.println("bitti ");
    }


    }

