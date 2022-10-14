package j15_Arrays.Tasks_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner dat = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". sayıyı giriniz :");
            arr[i] = dat.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i]+", ");
        }
    }
}
