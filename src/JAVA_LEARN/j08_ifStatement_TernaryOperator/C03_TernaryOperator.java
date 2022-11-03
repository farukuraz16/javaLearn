package JAVA_LEARN.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
 /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
        ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
        Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
        daha basic code'lar bulunur.

        */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

Scanner dat = new Scanner(System.in);
        System.out.println("bir sayı giriniz= ");
        int s = dat.nextInt();

        String a = s%2==0 ? "sayı çifttir" : "sayı tektir";
        System.out.println(a);

/*
        ahan da TRICK->  ternary operator işlem sonucunda true veya false göre bir cıktı verir.
        eger bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edlimeli.
         */

//Task2---> girilen tam sayı negatif mi değil mi?

        System.out.println("bir tam sayı giriniz= ");
        int b = dat.nextInt();

        System.out.println(b < 0 && b!=0 ? "negatiftir" : "pozitiftir");


    }

}
