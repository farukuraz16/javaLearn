package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;


public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String> meyve = new ArrayList<>(List.of("elma", "armut", "üzüm", "elma", "mandalina", "armut", "elma"));
        String sec = "üzüm";

        System.out.println("getcount(meyve, sec) = " + getcount(meyve, sec));


    }

    private static int getcount(ArrayList<String> meyve, String sec) {
        int count = 0;
        for (int i = 0; i < meyve.size(); i++) {
            if (meyve.get(i).equals(sec)) count++;

        }

        return count;
    }


}
