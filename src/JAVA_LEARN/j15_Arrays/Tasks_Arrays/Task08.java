package JAVA_LEARN.j15_Arrays.Tasks_Arrays;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner dat = new Scanner(System.in);
        System.out.print("kaç sayı olsun?= ");
        int arr[] = new int[dat.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". sayıyı giriniz :");
            arr[i] = dat.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2!=0){
        System.out.print(arr[i]+", ");

            }

        }

    }
}
