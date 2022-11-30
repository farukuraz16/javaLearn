package JAVA_LEARN.j99_Lambda;

import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class C11_stream_iterator {
    public static void main(String[] args) {
        int x=6;
        System.out.println("toplaAmele(x) = " + toplaAmele(x));
        System.out.println("toplaCincix(x) = " + toplaCincix(x));
        System.out.println("toplaCift(x) = " + toplaCift(x));
        System.out.println("toplaİlkXCiftSayi(x) = " + toplaİlkXCiftSayi(x));
        System.out.println("toplaİlkXTekSayi(x) = " + toplaİlkXTekSayi(x));
        ikininİlkXKuvvetiPrint(x);
        System.out.println("\n *** ");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBir sayı giriniz= ");
        int y= sc.nextInt();

        xkuuvetHesapla(x, y);
        System.out.println("\n *** ");
        System.out.println("faktoriyelHesapla(y) = " + faktoriyelHesapla(y));
        System.out.println("\n *** ");
        System.out.println("xInciKuvvet(5,2) = " + xInciKuvvet(5, 2));


    }//main

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.
    //Structured Programming(Amele coding...)
    public static int toplaAmele(int x) {
int toplam=0;
        for (int i = 1; i <= x; i++) {
            toplam+=i;
        }

    return toplam;
    }
    //Functional Programming(cincix code...)
    public static int toplaCincix(int x){

        return IntStream.//manual akıs tanımlandı
                range(1,x+1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz
    public static int toplaCift(int x){
        return IntStream.rangeClosed(1, x).filter(C01_LambdaExpression::ciftMi).sum();
        /*
         return IntStream.//manual akıs tanımlandı
               // range(1,x+1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                rangeClosed(1,x).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                filter(C01_LambdaExpression::ciftMi).//akısdaki tamsayıların çift olanları akısa alındı
                sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.
         */
    }


    //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.

    public static int toplaİlkXCiftSayi(int x) {

        return IntStream.iterate(2, t -> t + 2).limit(x).sum();

        /*
    return IntStream.
                iterate(2, t -> t + 2).//2'den başlayıp 2 artırılan tekrar işlemi tanımlandı->2,4,6,8.....
                        limit(x).//akısdaki ilk x eleman akısa alınır
                        sum();//akısdaki ilk x eleman toplandı
        //iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa alır.
     */

    }

    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int toplaİlkXTekSayi(int x) {

        return IntStream.
                iterate(1, t -> t + 2).//1'den başlayıp 2 artırılan tekrar işlemi tanımlandı->1,3,5...
                        limit(x).//akısdaki ilk x eleman akısa alınır
                        sum();//akısdaki ilk x eleman toplandı
    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran code  create ediniz.
    public static void ikininİlkXKuvvetiPrint(int x){
        IntStream.iterate(2, t->t*2).limit(x).forEach(C01_LambdaExpression::yazdır);
    }
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void xkuuvetHesapla(int x, int y){
        IntStream.iterate(y, t->t*y).limit(x).forEach(C01_LambdaExpression::yazdır);
    }
        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.

    public static int faktoriyelHesapla(int y){
        return IntStream.iterate(1, t->t+1).limit(y).reduce(1,(t,u)->t*u);
    }


    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static OptionalInt xInciKuvvet(int a, int b){
       return IntStream.iterate(b, t->t*b).limit(a).skip(a-1).findFirst();
    }
}

