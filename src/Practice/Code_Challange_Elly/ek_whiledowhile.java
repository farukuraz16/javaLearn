package Practice.Code_Challange_Elly;

import java.util.Scanner;

public class ek_whiledowhile {
    public static void main(String[] args) {

// girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner dat = new Scanner(System.in);
        System.out.println("sayı giriniz= ");
        int sayi = dat.nextInt();
        System.out.println("toplamsayi (sayi) = " + toplamsayi(sayi));


    }

    private static int toplamsayi(int sayi) {
        int toplamsayi = 0;
        while (sayi>=1){

            toplamsayi+=sayi%10;
            sayi/= 10;
        }

        return toplamsayi;
    }
}
