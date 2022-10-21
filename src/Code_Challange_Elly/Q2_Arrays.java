package Code_Challange_Elly;

import java.util.Arrays;

public class Q2_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        int say []= {1,2,3,4,5,6,7};
        double ortalama;
        int toplam = 0;
        for (int i = 0; i < say.length; i++) {
            toplam+=say[i];
        }
        ortalama=toplam/say.length;
        System.out.println("ortalama = " + ortalama);
        System.out.print("ortalamanın üstündeki sayılar = ");
        for (int i = 0; i < say.length; i++) {
            if (say[i]>ortalama) System.out.print(say [i]+", ");
        }
        }


    }

