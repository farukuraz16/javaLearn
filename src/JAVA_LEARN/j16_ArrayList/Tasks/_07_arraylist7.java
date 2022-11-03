package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
    List <Integer> sayi1 = new ArrayList<>(List.of(8,7,9,6,7));
    List <Integer> sayi2 = new ArrayList<>(List.of(6,7,12,3,1));
    List <Integer> ortak = new ArrayList<>();

        common_values (sayi1, sayi2, ortak);

        System.out.println(ortak);
    }

    private static void common_values(List<Integer> sayi1, List<Integer> sayi2, List<Integer> ortak) {
        for (int i = 0; i < sayi2.size(); i++) {
            if (sayi1.contains(sayi2.get(i)))
                ortak.add(sayi2.get(i));

        }

    }
}
