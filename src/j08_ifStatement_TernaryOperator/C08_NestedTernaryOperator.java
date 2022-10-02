package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {

        /*
		Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
        %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
		*/

    Scanner dat = new Scanner(System.in);
        System.out.println("ürün miktarı?= ");
        int u = dat.nextInt();
        System.out.println("ürün fiyatı?= ");
        int f = dat.nextInt();

        System.out.println(u > 100 ? "ödeme= " + (f * u * 0.67) : "ödeme= " + (f * u));


    }}