package Clarus_JavaPracticeFall_Elly.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_Varargs01 {
    public static void main(String[] args) {
        // istedigimiz kadar sayi girdigimizde
        // toplamlari bize veren bir method yazalim...
        //List<Integer> a = new ArrayList<>(List.of(1,2,3,6,5,4,8,));
        sumAll(5,3,6,69,58,15,15456);

    }

    private static void sumAll(int ...sayi) {
        int sum=0;
        for (int each:sayi) {
            sum +=each;
                    }
        System.out.println("sum = " + sum);
    }
}
