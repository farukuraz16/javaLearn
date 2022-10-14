package j13_Break_Continue;

import java.util.Scanner;

public class C02_continue {
    public static void main(String[] args) {
        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop’un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

        Scanner dat = new Scanner(System.in);
        System.out.println("email");
        String email = dat.nextLine();

        for (int i =0; i<email.length();i++){

            if(email.charAt(i)==' ') continue;

            System.out.print(email.charAt(i));
        }

    }
}
