package MicroLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M_02 {
    public static void main(String[] args) {
      /*todo   Listedeki 8 ve 12 dışındaki her öğenin değerini 2'şer artırınız.
                      Örnek: (15, 31, 8, 13, 12) ==> Çıktı (17, 33, 8, 15, 12)
        */
        List<Integer> sayi = new ArrayList<>(List.of(15, 31, 8, 13, 12));
        List<Integer> sayiNew = new ArrayList<>();
        for (int i = 0; i < sayi.size(); i++) {
            if ((sayi.get(i)!=8 && sayi.get(i)!=12)){
                sayiNew.add(sayi.get(i)+2);
                            } else if ((sayi.get(i)==8 || sayi.get(i)==12)) {
                sayiNew.add(sayi.get(i));
            }
        }
        System.out.println("sayiNew = " + sayiNew);

    }
}
