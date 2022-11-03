package JAVA_LEARN.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */

        String isimArr[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        List<String> yeniisim = new ArrayList<>();


        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < isimArr[i].length; j++) {
                yeniisim.add(isimArr[i][j]);

            }
            
        }
        System.out.println("yeniisim = " + yeniisim);
        yeniListisim(isimArr);
    }

    public static void yeniListisim(String[][] isimArr) {
        List<String> yeniisim = new ArrayList<>();
        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < isimArr[i].length; j++) {
                yeniisim.add(isimArr[i][j]);

            }

        }
        System.out.println("yeniisim = " + yeniisim);

    }
}
