package j15_Arrays.Tasks_Arrays;

import java.util.Arrays;

public class Task10 {
    static int[] arr = {1,2,-3,4,-5,-6};
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */



        deger();

    }

    private static void deger() {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print((arr[i] *= -1)+", ");

        }

    }


}
