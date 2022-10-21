package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Task_10 {
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */

        List<Integer> sayi = new ArrayList<>(List.of(1,2,-3,4,-5,-6));
        List<Integer> sayi2 = new ArrayList<>();
       /*
        for (int a: sayi){
            sayi2.add(a*(-1));
               }
        System.out.println("output= "+sayi2);*/
        sayınıntersi(sayi,sayi2);

    }

    private static void sayınıntersi(List<Integer> sayi, List<Integer> sayi2) {
        for (int a: sayi){
            sayi2.add(a*(-1));
        }
        System.out.println("output= "+sayi2);
    }
}
