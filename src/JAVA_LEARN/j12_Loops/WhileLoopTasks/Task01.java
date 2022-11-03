package JAVA_LEARN.j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        int sayiadedi = 0;
        int sayitoplami = 0;
        while (sayitoplami<=333) {
            Scanner dat = new Scanner(System.in);
            System.out.print("sayı giriniz= ");
            int sayi = dat.nextInt();
            sayitoplami+=sayi;
            sayiadedi++;


        }
        System.out.println("girilen sayı adedi= "+sayiadedi+"\nsayıların toplamı="+sayitoplami);


    }
}
