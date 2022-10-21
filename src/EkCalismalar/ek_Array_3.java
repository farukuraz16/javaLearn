package EkCalismalar;

import java.util.Arrays;
import java.util.Scanner;

public class ek_Array_3 {
    public static void main(String[] args) {
        /*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
         */
   Scanner dat = new Scanner(System.in);
   int [] num= {1,2,3,5,-5,-45,564,8,4,654,684,45,0,0,14,44,-456,1,2,3};

    int positive=0;
    int negative=0;
    int odd=0;
    int even=0;
    int zero=0;
        for (int i = 0; i < num.length; i++) {
            if (num [i]>0){
                positive++;
            }else if (num[i]<0){
                negative++;
            } else if (num[i]==0) {
                zero++;
            } else if (num[i]%2==0) {
                even++;

            }else if (num[i]%2!=0){
                odd++;
            }
       }
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
        System.out.println("zero = " + zero);
    }

}
