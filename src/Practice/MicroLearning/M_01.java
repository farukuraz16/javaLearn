package Practice.MicroLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M_01 {
    public static void main(String[] args) {
      /*todo  Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
                 Örnek: (12, 31, 15, 32, 54) ==> Çıktı 31 ve 32'tür

        */
        List<Integer> sayi1 = new ArrayList<>(List.of(12, 31, 15, 35, 54,55));
        Collections.sort(sayi1);
        //List<Integer> fark = new ArrayList<>();
        //System.out.println("sayi1 = " + sayi1);
        List<Integer> yakinSayilar = new ArrayList<>();
        int fark=(sayi1.get(0+1)-sayi1.get(0));

        for (int i = 1; i < sayi1.size()-1; i++) {
            if (fark>(sayi1.get(i+1)-sayi1.get(i))){
                fark=(sayi1.get(i+1)-sayi1.get(i));
                yakinSayilar.add(sayi1.get(i));
                yakinSayilar.add(sayi1.get(i+1));

                            }
             }
        System.out.println("yakinSayilar = " + yakinSayilar);

    }
}
