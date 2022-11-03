package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

    List<Integer> num = new ArrayList<>();

    ortalamadanbuyuk(num);





    }

    private static void ortalamadanbuyuk(List<Integer> num) {
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+". sayıyı giriniz= ");
            int sayi = sc.nextInt();
            num.add(sayi);
        }
        int toplam = 0;
        int ort;
        for (int i = 0; i < num.size(); i++) {
            toplam+= num.get(i);
        }
        ort=toplam/ num.size();
        System.out.println("ort = " + ort);
        System.out.println("Ortalamadan büyük veya eşit olan sayılar= ");
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i)>=ort){
                System.out.print(num.get(i)+", ");
            }

        }
    }


}
