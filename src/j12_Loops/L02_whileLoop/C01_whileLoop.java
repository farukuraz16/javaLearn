package j12_Loops.L02_whileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);

/*
        //başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda foor loop
        //ama adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda while lopp kullanılmalı

        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...

        int a;

        for (a = 11; a < 21; a++) {
            System.out.print(a + ", ");
        }
        System.out.println();

        int b = 11;
        while (b < 21) {
            System.out.print(b + ", ");
            b++;
        }
        System.out.println();
        //task02-> 7 kere javaCAN print eden code create ediniz...

        int c = 1;
        while (c < 8) {
            System.out.print("javaCAN");
            c++;
        }

        System.out.println();
        // task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz

        int d = 11;
        while (d < 100) {
            System.out.print(d + ", ");
            d += 2;
        }


        System.out.println();

        // task04-> girilen metni while loop ile  tersden print eden code create ediniz


        System.out.print("bir metin giriniz= ");
        String metin = dat.nextLine();
        int sonkarakter = metin.length() - 1;


        while (sonkarakter >= 0) {
            System.out.print(metin.charAt(sonkarakter));
            sonkarakter--;

        }

        */
/*
        System.out.println("\n");

        //task05-> girilen tamsayıya kadar tamsayıların toplamını print eden code create ediniz...

        System.out.println("bir tam sayı giriniz= ");
        int s = dat.nextInt();
        int toplam = 0;
        while (s >= 0) {
            toplam += s;
            s--;
        }
        System.out.println(toplam);

*/

     //   task06-> girilen tamsayın faktoriyelini print eden code create ediniz...
        System.out.println("bir tam sayı giriniz= ");
        int s = dat.nextInt();
        int faktor = 1;
        while (s>0){
            faktor*=s;
            s--;
        }
        System.out.println(faktor);


    }//main
}
