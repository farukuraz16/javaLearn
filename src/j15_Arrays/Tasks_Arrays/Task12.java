package j15_Arrays.Tasks_Arrays;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int arr[] = {2, 6, 4, 5, 8, 9};
        int arr2[] = new int [arr.length];

        for (int i = 0; i < arr.length; i++){
            arr2[i]=(arr[i] * arr[i]);
        }
        System.out.println(Arrays.toString(arr2));




    }

}
