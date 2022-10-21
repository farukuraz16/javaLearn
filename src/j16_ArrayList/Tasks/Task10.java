package j16_ArrayList.Tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        List<Integer> sayi = new ArrayList<>(List.of(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
        List<Integer> sayi2 = new ArrayList<>();

        Collections.sort(sayi);
        System.out.println("sayi = " + sayi);
        for (int i = 0; i < sayi.size()-1; i++) {
            if (sayi.get(i)==sayi.get(i+1)){
                sayi.remove(sayi.get(i+1));
                i--;
            }

                    }
        Collections.sort(sayi);
        System.out.println("sayi = " + sayi);


        List<Integer> num = new ArrayList<>(List.of(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
        List<Integer> num2 = new ArrayList<>();

        Collections.sort(num);
        System.out.println("num = " + num);
        for (int i = 0; i < num.size(); i++) {
            if (!num2.contains(num.get(i))){
                num2.add(num.get(i));
            }
        }
        Collections.sort(num2);
        System.out.println("num2 = " + num2);


    }

}
