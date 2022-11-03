package JAVA_LEARN.j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12_Nested {
    public static void main(String[] args) {

        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */

        int toplam=0;

        for (int i=1 ; i<=5 ; i++){
            Scanner dat = new Scanner(System.in);
            System.out.print("bir sayı giriniz= ");
                        int s = dat.nextInt();
            if (s<=10 || s>=20){
                toplam+=s;
            }


        }System.out.println(toplam);
    }


}


