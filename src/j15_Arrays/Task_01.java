package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        //Task-> kullanıcdan alınan değerlerle bir int array elemanlarını bukukten kucuge   print eden code create ediniz.

        Scanner dat = new Scanner(System.in);
        System.out.println("kaç sayılı bir Array istersin?=");
        int arrBoyut = dat.nextInt();

        int arr [] = new int[arrBoyut];

        for (int i = 0; i <arrBoyut ; i++) {
            System.out.println(i+". sayıyı giriniz=");
            arr[i]=dat.nextInt();}
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//küçükten büyüğe
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+", ");
        }

    }

    }

