package Practice.Code_Challange_Elly;

import java.util.Scanner;

public class ek_nestedloop {
    public static void main(String[] args) {

 /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.
    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****
*/

        Scanner dat = new Scanner(System.in);
        System.out.println("sayı= ");
        int kat= dat.nextInt();

        for (int i = 1; i <=kat; i++) {

            for (int j= kat; j >i ; j--){
                System.out.print(" ");
                      }
            for (int j =1; j <=i; j++) {
                System.out.print("*");

            }System.out.println();

            }
        }

    }

