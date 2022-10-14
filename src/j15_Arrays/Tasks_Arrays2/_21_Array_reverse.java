package j15_Arrays.Tasks_Arrays2;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
int s =123;

        String[] num = String.valueOf(s).split("");

        for (int i = num.length-1; i >=0 ; i--) {
            System.out.print(num[i]);
                  }

    }
}


