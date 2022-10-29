package Code_Challange_Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MerveHanım2 {
    public static void main(String[] args) {
        int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};

        System.out.println("sayımız: " + Arrays.toString(sayi));

        List<Integer> sayi2 = new ArrayList<>();
        tekcift(sayi2,sayi);
    }

    private static void tekcift(List<Integer> sayi2, int[] sayi) {
        for (int a : sayi
             ) {if (a%2==1){
                 sayi2.add(a);
        }
            }
        for (int a : sayi
        ) {if (a%2==0){
            sayi2.add(a);
        }
        }
        System.out.println("sayi2 = " + sayi2);
    }
}
