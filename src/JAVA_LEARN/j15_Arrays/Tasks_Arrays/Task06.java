package JAVA_LEARN.j15_Arrays.Tasks_Arrays;

import java.util.Arrays;

public class Task06 {
    static int[] arr = {3,5,6,1,9,45,25,4,9,0};

    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz



sirala ();
    }

    private static void sirala() {
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+", ");

        }
    }
}
