package JAVA_LEARN.j15_Arrays.Tasks_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
Scanner dat = new Scanner(System.in);
int arr[] = new int[8];

        for (int i = 0; i < arr.length; i++){
            System.out.println(i+ ". sayıyı giriniz :");
            arr[i] = dat.nextInt();
            }
        System.out.println("arr []="+Arrays.toString(arr));
        System.out.print("3e bölünebilenler= ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) System.out.print(arr[i]+", ");

        }

    }

}
