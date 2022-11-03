package Practice.Code_Challange_Elly;

import java.util.Scanner;

public class ek_while {
    public static void main(String[] args) {

/*
While döngüsünü kullanarak kullanıcının istediği kadar sayıyı toplayabildiği bir uygulama yazın.
 */

        Scanner dat = new Scanner(System.in);
        System.out.println("kaç tane sayı toplamak istiyorsunuz? = ");
        int adet= dat.nextInt();
        int toplam=0;
        while (adet >0){
            System.out.println("sayı giriniz= ");

            toplam += dat.nextInt();
            adet--;
        }
        System.out.println("toplam = " + toplam);


    }
}
