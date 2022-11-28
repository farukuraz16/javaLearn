package JAVA_LEARN.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {/*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
        */

    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        List<Integer> sayi1 = new ArrayList<>(Arrays.asList(21, 31, 41));
        List<Integer> sayi2 = new ArrayList<>(Arrays.asList(2, 5, 8, 6, 11, 24));
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 3, 5));//filter olarak cift  sartı null verecegi için optional class ataması yapar
        //Lambda ->Stream API

        ciftKareMaxPrint(sayi);//Optional[4356]
        System.out.println("\n *** ");

        ciftKareMaxPrint(sayi1);//Optional.empty
        System.out.println("\n *** ");

        listelemanTopla(sayi);
        System.out.println("\n *** ");

        ciftElCarpPrint(sayi2);
        System.out.println("\n *** ");

        minBul(sayi);
        System.out.println("\n *** ");

        yrmdrtdenBuyukEnKcukTek (sayi);
        System.out.println("\n *** ");


    }//main


    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz.
    private static void ciftKareMaxPrint(List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(x -> x * x).forEach(C01_LambdaExpression::yazdır);
        Optional<Integer> maxSayi = sayi.stream().filter(C01_LambdaExpression::ciftMi).map(x -> x * x).reduce(Math::max);
        //buradan bir null değer gelebilir. çift sayı olmayabilir. o yüzden java buraya int değil de Optional data kabul etti.

        System.out.println("\n" + sayi.stream().filter(C01_LambdaExpression::ciftMi).map(x -> x * x).reduce(Math::max));
        System.out.println("\n" + sayi.stream().filter(C01_LambdaExpression::ciftMi).map(x -> x * x).reduce(Integer::max));//daha kısıtlı bir class olduğu için daha hızlı çalışır
    }

    // Task : List'teki tum elemanlarin toplamini print ediniz.

    public static void listelemanTopla(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Integer::sum));
        //sayi.stream().reduce(Integer::sum) -->> istersek bu kod bloğunu bir dataya variable olarak atayabiliriz.

        Optional<Integer> sum = sayi.stream().reduce(Integer::sum);
        //int sum=sayi.stream().reduce(Integer::sum)-->>yaptığımızda java CTE verir ve optional kabul eder.
        System.out.println("sum = " + sum);//bu datayı yazdırabiliriz..

        System.out.println("//Lambda expression" + sayi.stream().reduce(0, (a, b) -> a + b));//Lambda expression
        /*
        sayi.stream().reduce(0, (a,b)->a+b)
        a : ilk değerini her zaman atanan identity değerden alır
        b : değerini her zaman stream() akısdan alır.
        a ilk değerden sonraki değerlerini action(işlem body)'den alır
         */
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElCarpPrint(List<Integer> sayi2) {


        System.out.println(sayi2.stream().filter(C01_LambdaExpression::ciftMi).reduce(Math::multiplyExact));//Math classtan methoda call ettik
        System.out.println(sayi2.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (t, u) -> t * u));//Lambda expression
    }

// Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.

    public static void minBul(List<Integer> sayi) {

        System.out.println("En küçük sayı-Math class= " + sayi.stream().reduce(Math::min));
        System.out.println("En küçük sayı-Integer class= " + sayi.stream().reduce(Integer::min));
        System.out.println("En küçük sayı-Seed method refere edildi = " + sayi.stream().reduce(C04_reduce::byHalukMinBul));
        System.out.println("En küçük sayı-Lambda expression = " + sayi.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y));

    }
    public static int byHalukMinBul(int a, int b) {//meth refere etmek için seed method oluşturdum
            return a<b?a:b;
    }

    // Task : List'teki 24'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void yrmdrtdenBuyukEnKcukTek (List<Integer> sayi){
        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));
        // System.out.println(sayi.stream().filter(t -> t > 24 && C01_LambdaExpression::ciftMi)-> CTE : exp. ve meth ref aynı parametrede olamaz


    }
}
