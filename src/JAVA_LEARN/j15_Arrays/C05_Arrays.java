package JAVA_LEARN.j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy... copyOf(arr,newLength);-> girilen arr'yin newLength kadar ilk elemanını copyalar

        int sayi[] = {63, 21, 47, 27, 35, 12, 36, 31, 46, 24};
        int yeniArr[] = Arrays.copyOf(sayi, 5);
        System.out.println("sayi arrayinden ilk 5 datayı kopyalayan array " + Arrays.toString(yeniArr));//[63, 21, 47, 27, 35]

        int baskaArr[] = Arrays.copyOfRange(sayi, 3, 8);//3 dahil 8 hariç index elemanlar kopyalanır
        System.out.println("Arrays.toString(baskaArr) = " + Arrays.toString(baskaArr));

        int baskaArr2[] = Arrays.copyOfRange(sayi, 0, sayi.length);//
        System.out.println("Arrays.toString(baskaArr) = " + Arrays.toString(baskaArr2));


        // Array'ı belirli bir eleman ile update(set) etme... fill(arr,value);

        Arrays.fill(sayi,99);
        System.out.println("sayi arrayini 99 ile fulledik.. doldurduk..= " + Arrays.toString(sayi));//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3, 7, 33);//3.4.5.6. index elemanlar 33 ile update edildi
        System.out.println("3.4.5.6. index elemanlar 33 ile update edildiğinde..= " + Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]
    }
}
