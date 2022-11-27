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
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 3, 5));//filter olarak cift  sartı null verecegi için optional class ataması yapar
        //Lambda ->Stream API

        ciftKareMaxPrint(sayi);//Optional[4356]
        System.out.println("\n *** ");

        ciftKareMaxPrint(sayi1);//Optional.empty
        System.out.println("\n *** ");

    }//main

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz.
    private static void ciftKareMaxPrint(List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(x -> x * x).forEach(C01_LambdaExpression::yazdır);
        Optional<Integer> maxSayi= sayi.stream().filter(C01_LambdaExpression::ciftMi).map(x -> x * x).reduce(Math::max);
        //buradan bir null değer gelebilir. çift sayı olmayabilir. o yüzden java buraya int değil de Optional data kabul etti.

        System.out.println("\n"+sayi.stream().filter(C01_LambdaExpression::ciftMi).map(x -> x * x).reduce(Math::max));
        System.out.println("\n"+sayi.stream().filter(C01_LambdaExpression::ciftMi).map(x -> x * x).reduce(Integer::max));//daha kısıtlı bir class olduğu için daha hızlı çalışır
    }
}
