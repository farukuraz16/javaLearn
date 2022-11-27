package JAVA_LEARN.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        printCiftElStructured(sayi);
        System.out.println("\n *** ");

        printCiftElFunctional(sayi);
        System.out.println("\n *** ");

        printCiftElFunctional2(sayi);
        System.out.println("\n *** ");
    }//main sonu

    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElStructured(List<Integer> sayi) {
        for (Integer w : sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //Task : "Functional Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElFunctional(List<Integer> sayi) {
        //sayi.stream().filter(t -> t % 2 == 0).forEach(C01_LambdaExpression::yazdır);
        sayi.
                stream().//list eemanları akısa alındı
                filter(t -> t % 2 == 0).//akısdakı list elemanları çift olma sartına göre filtrelendi:akısdan çıkarıldı->lambda exp...bad practice
                forEach(C01_LambdaExpression::yazdır);//C01 Class'daki yazdır method refere(call) edildi

    }



    public static void printCiftElFunctional2(List<Integer> sayi) {
    sayi.stream().filter(C01_LambdaExpression::ciftMi).forEach(C01_LambdaExpression::yazdır);
}


    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 35 den küçük  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElFunctional3(List<Integer> sayi) {//amele method

        sayi.stream().filter(C01_LambdaExpression::ciftMi).filter(t -> t < 35).forEach(C01_LambdaExpression::yazdır);

        /*
        sayi.
                        stream().//list eemanları akısa alındı
                         filter(C01_LambdaExpression::ciftMi).//akısdakı list elemanları çift olma sartına göre filtrelendi:akısdan çıkarıldı->meth ref. best practice
                filter(t -> t < 35).
                forEach(C01_LambdaExpression::yazdır);//C01 Class'daki yazdır method refere(call) edildi
        */

    }


    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 34den büyük yada  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElFunctional4(List<Integer> sayi) {

        sayi.stream().filter(t->t%2==0 || t>34).forEach(C01_LambdaExpression::yazdır);

    }
}