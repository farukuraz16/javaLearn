package EkCalismalar;

import java.util.Arrays;
import java.util.Scanner;

public class ek_Array_1 {
    public static void main(String[] args) {
        /*Take 10 integer inputs from user and
        store them in an array and print them on screen.
         */
        Scanner dat = new Scanner(System.in);
        int [] num= new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("enter number "+(i+1)+". = ");
            num [i]= dat.nextInt();
        }
        System.out.println("num = " + Arrays.toString(num));
    }

}
