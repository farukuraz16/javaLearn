package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int sayilist[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        List<Integer> newlist = new ArrayList<>();
        int toplam = 0;
        for (int i = 0; i < sayilist.length; i++) {
            for (int j = 0; j <=i+1 ; j++) {
                toplam+=sayilist[i];
                System.out.print(toplam+", ");
            }

            toplam=0;
            }


        }
    }


