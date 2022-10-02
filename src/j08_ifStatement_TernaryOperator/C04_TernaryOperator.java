package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

// TASK-> girilen  bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.

Scanner dat= new Scanner(System.in);
        System.out.println("tam sayı giriniz= ");
        int s = dat.nextInt();

        System.out.println(s > 9 || s < -9 ? "iki basamaklıdır" : "iki basamaklı değildir");


    }}