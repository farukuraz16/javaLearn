package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        ArrayList<Integer> listSayi = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("getSum(listSayi) = " + getSum(listSayi));


    }

    private static int getSum(ArrayList<Integer> listSayi) {
        int sum=0;
        for (int i = 0; i < listSayi.size(); i++) {
            sum+=listSayi.get(i);

        }return sum;
    }
}
