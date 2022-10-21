package Code_Challange_Elly;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q5_Arrays {
    public static void main(String[] args) {
         /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner dat = new Scanner(System.in);
        int arr[] = new int[8];
        for (int i = 1; i <=8 ; i++) {
            System.out.println(i+". sayı giriniz= ");
            arr[i-1]= dat.nextInt();
                    }
        System.out.println(Arrays.toString(arr));

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) count++;

        }
        System.out.println(count);
    }
}
