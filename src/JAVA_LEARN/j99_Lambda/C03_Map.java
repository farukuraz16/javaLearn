package JAVA_LEARN.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        cifkarePrint(sayi);
        System.out.println("\n *** ");
        tekKupBirFazlaPrint(sayi);
        System.out.println("\n *** ");
        ciftKarekokPrint(sayi);
        System.out.println("\n *** ");



    }//main
    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak print ediniz.
    private static void ciftKarekokPrint(List<Integer> sayi) {
       // sayi.stream().filter(a->a%2==0).map(a->(int)Math.sqrt(a)).forEach(C01_LambdaExpression::yazdır);
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(a->(int)Math.sqrt(a)).forEach(C01_LambdaExpression::yazdır);

    }


    private static void cifkarePrint(List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(a -> a * a).forEach(C01_LambdaExpression::yazdır);
        /*
        sayi.
                stream().//list elelmanlar akısa alındı
                filter(C01_LambdaExpression::ciftMi).//akısdaki çift elelmlar filtrelendi
                map(t->t*t).//akısda filtrelene cift elemanlar karesi alınarak update edildi akısa sokuldu
                forEach(C01_LambdaExpression::yazdir);//akısda filtrelenmiş cift elelmnalr karsı alınıp işaretlenenakısdan print edildi
        //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
         */

    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print ediniz.
    private static void tekKupBirFazlaPrint(List<Integer> sayi) {
        //sayi.stream().filter(t->t%2==1).map(t->(t*t*t)+1).forEach(C01_LambdaExpression::yazdır);
        sayi.stream().filter(t->t%2==1).map(t->(int) Math.pow(t,3)+1).forEach(C01_LambdaExpression::yazdır);
    }


}
