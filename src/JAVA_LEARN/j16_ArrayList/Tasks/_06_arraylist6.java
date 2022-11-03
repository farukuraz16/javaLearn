package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(List.of(8,6,1,4, 2,1,2,88,45,30));
        List <Integer> num = new ArrayList<>();
      //  for (int i = 1; i < sayi.size()-1; i++) {
      //      if (sayi.get(i-1)> sayi.get(i) && sayi.get(i)> sayi.get(i+1) )
      //          num.add(sayi.get(i));
      //  }
      //  System.out.println(num);

        hillNum (sayi, num);
        System.out.println(num);

    }

    private static void hillNum(List<Integer> sayi,List<Integer> num) {

         for (int i = 1; i < sayi.size()-1; i++) {
            if (sayi.get(i-1)> sayi.get(i) && sayi.get(i)> sayi.get(i+1) )
                num.add(sayi.get(i));
        }


    }
}
