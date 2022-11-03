package JAVA_LEARN.j20_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive(Class array list-> refrans ) data turlerinde obj kemdisi değil de dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */


        // Task -> lis elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update dip print code create ediniz.
        //1. method-> with for each 2. method-> set(index,value)
        List<Integer> sayi = new ArrayList<>(List.of(24,20,87));

        System.out.println("metot öncesi sayi = " + sayi);

        listupdate1(sayi);

        System.out.println("\nlistupdate1 metot sonrası sayi = " + sayi);

        listupdate2(sayi);

        System.out.println("\nmetotlar sonrasu sayi = " + sayi);


    }
    private static void listupdate1(List<Integer> sayi) {
        System.out.print("listupdate1 metot çıktısı: ");
        for (Integer a: sayi) {
            a*=2;
            System.out.print(a+", ");
        }

    }
    private static void listupdate2(List<Integer> sayi) {
        for (int i = 0; i < sayi.size(); i++) {
            sayi.set(i,sayi.get(i)*2);
            }
        System.out.print("listupdate2 metot çıktısı.. sayi = " + sayi);
    }


}
