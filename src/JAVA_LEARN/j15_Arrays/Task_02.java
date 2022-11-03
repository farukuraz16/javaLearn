package JAVA_LEARN.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner dat = new Scanner(System.in);
        System.out.println("kaç tane sayı?= ");
        //int arrboyut= dat.nextInt();
        int arr []= new int[dat.nextInt()];//boyut için bir obje oluşturmaya gerek yok. kullanıcıdan alınacak değer, direkt olarak array içine atanabilir.
        //böylece hafızada gereksiz yer kaplamaz...
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+". sayıyı giriniz :");
            arr[i]=dat.nextInt();
                    }
        System.out.println("Arrays arr = " + Arrays.toString(arr));
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];

        }
        System.out.println("toplam = " + toplam);
    }
}
