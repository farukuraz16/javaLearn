package Practice.homeworks_ifStatement;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

    Scanner dat = new Scanner(System.in);
        System.out.println("str1=?");
        String str1 = dat.nextLine();
        System.out.println("str2=?");
        String str2 = dat.nextLine();
        if (str1==str2) {
            System.out.println("String 1 is equal to String 2");
        }
        else {
            System.out.println("String 1 is NOT equal to String 2");
        }





    }
}
