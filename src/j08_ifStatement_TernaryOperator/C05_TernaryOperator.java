package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
// TASK-> girilen bir tamsayı çiftse yarısını değilse
// "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner dat = new Scanner(System.in);
        System.out.println("tam sayı giriniz= ");
        int ts = dat.nextInt();
        System.out.println(ts%2==0 ? ts/2 : "girilen sayı tek oldugu için yarısı tamsayı değildir");

        /*
        ahan da TRICK -> ternary iki durum(T/F) için farklı data type çıktısı veriyorsa variable atama yapmadan sout yapılmalı
        ya da ternary çıktısı aynı data type serializable edilmeli...
         */
    }}