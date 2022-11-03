package Practice.Code_Challange_Elly;

import java.util.Scanner;

public class Q10_Break {
    public static void main(String[] args) {
        /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

        Scanner dat = new Scanner(System.in);
        System.out.println("enter a number= ");
        int num = dat.nextInt();
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                prime=false;
                break;}

        } if (prime==false) System.out.println("not prime");
         if (prime==true) System.out.println("prime!");

    }
}
