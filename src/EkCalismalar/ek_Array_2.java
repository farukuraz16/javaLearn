package EkCalismalar;

import java.util.Arrays;
import java.util.Scanner;

public class ek_Array_2 {
    public static void main(String[] args) {
        /*Take 5 integer inputs from user and store them in an array.
        Again ask user to give a number.
        Now, tell user whether that number is present in array or not.
         */
   Scanner dat = new Scanner(System.in);
   int [] num= new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("enter number "+(i+1)+". = ");
            num [i]= dat.nextInt();
        }
        System.out.println("num = " + Arrays.toString(num));

        boolean d = true;
        System.out.println("enter other number= ");
        int number = dat.nextInt();
        for (int i = 0; i < num.length; i++) {
               if (num [i]== number){
                d=false;
                break;
            }

        }
        if (d) System.out.println("this number is not added");
       else System.out.println("this number is already added");

    }

}
