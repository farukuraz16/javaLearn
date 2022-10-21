package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.
        */

        ArrayList<Integer> dizi = new ArrayList<>(List.of(1,2,3,4,5,6));
        teksayilar(dizi);

    }

    private static void teksayilar(ArrayList<Integer> dizi) {
        List<Integer> teksayi= new ArrayList<>();

        for (int i = 0; i < dizi.size(); i++) {
            if (dizi.get(i)%2!=0){
                teksayi.add(dizi.get(i));
            }

        }
        System.out.println("teksayi = " + teksayi);
    }
}
