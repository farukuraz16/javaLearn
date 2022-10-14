package j15_Arrays.Tasks_Arrays2;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int num []={25,30,30,35,100};
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];

        }
        System.out.println("sum = " + sum);


    }
}