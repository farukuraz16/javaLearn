package Practice.LambdaCodeChallenge_FARUK;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_Array_StreamOrnekleri_F {
    public static void main(String[] args) {

        // Arraylerde Stream kullanabilmek icin 2 yol vardir
            // 1) Stream <Integer> isim=StreamOf(cevrilecek olan) -> Stream objesi
            // 2) Arrays.stream(arr).  ->  Array sinifindan yararlanarak
        //Array ler collection sinifinda degillerdir..set ve MAp ler gibi degildir..
        // kullanabilmek icin donusum yapilmalidir

        int[] arr1 ={1,5,-5,6,12,-8,9,3,4};


        //S1: arrayin elemanlarini bir liste yazdiralim
elemanListYazdır(arr1);


        System.out.println();

        //S2: Arrayin elemanlarini toplamini bulalim
        System.out.println("elemanToplam(arr1) = " + elemanToplam(arr1));
        System.out.println();
        // S3: Array in elemanlarinin ortalamasini bulalim yazdir
        ortalama(arr1);

    }




    public static void ortalama (int [] arr){

        Arrays.stream(arr).average().ifPresent(System.out::println);
    }

    private static int elemanToplam(int[] arr1) {

    return Arrays.stream(arr1).reduce(0,(x,y)->x+y);
    }

    private static void elemanListYazdır(int[] arr1) {
        Arrays.stream(arr1).forEach(x-> System.out.print(x+" "));
    }
}

