package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.*;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(List.of(8,9,2,45,887,985,1,99,658,54,985,5,1,210,13));
        Collections.sort(sayi);
        System.out.println(sayi);

       secondMax (sayi);
    }
    private static void secondMax(List<Integer> sayi) {
        for (int i = sayi.size()-1; i >=0; i--) {
            if (sayi.get(i)>sayi.get(i-1)){
                System.out.println(sayi.get(i-1));
                break;
            }


        }

    }
}

