package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner dat = new Scanner(System.in);
        System.out.print("kaç sayı olsun?= ");

        int arr []= new int[dat.nextInt()];

        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+". sayıyı giriniz :");
            arr [i] = dat.nextInt();
            toplam+= arr[i];
        }
        System.out.println("arr = " + Arrays.toString(arr));
        int ortalama=toplam/arr.length;
        int buyukler=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>ortalama) buyukler++;
        }
        System.out.println("buyukler = " + buyukler);
    }
}
