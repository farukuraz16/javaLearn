package JAVA_LEARN.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> listUlke= new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listSehir= new ArrayList<>(List.of("Münih","losAngeles","Londra","stockholm"));

        // nCopies(int, Obj);-> int elamanlı bir obj den oluşan list ataması yapıyoruz

        ArrayList<String> yeniList= new ArrayList<>(Collections.nCopies(3,"JavaCAN"));
        System.out.println(yeniList);


        //addAll();->bir liste diğer şisti oldugu gibi sona ekler

        listUlke.addAll(listSehir);//ülke list sonuna sehir list tamamane eklendi
        System.out.println(listUlke);

        listSehir.addAll(3, listUlke);//3. indexten itibaren ülke listesine şehir listesi eklendi
        System.out.println(listSehir);

        //task-> 1 den 10 kadar sayılara bir liste atayıp print eden code create ediniz

        ArrayList<Integer> listSayi = new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
        listSayi.add(i);
        }
        System.out.println(listSayi);
    }
}
