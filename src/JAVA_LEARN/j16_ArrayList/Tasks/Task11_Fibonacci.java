package JAVA_LEARN.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    public static void main(String[] args) {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */
        Scanner dat = new Scanner(System.in);
        System.out.println("sayı giriniz= ");
        int sayi = dat.nextInt();
        List<Integer> fibonacci = new ArrayList<>(List.of(1));
        int artis = 0;
        for (int i = 1; i >=0 ; i++) {
            if ((fibonacci.get(i - 1) + artis) < sayi)
            {fibonacci.add(fibonacci.get(i - 1) + artis);
            artis = fibonacci.get(i - 1);}
            else break;

        }
        System.out.println("fibonacci = " + fibonacci);
    }


}
