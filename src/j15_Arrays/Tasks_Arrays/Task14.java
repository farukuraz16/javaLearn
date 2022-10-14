package j15_Arrays.Tasks_Arrays;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        str = str.replaceAll("\\D", "");
        System.out.println(str);
        int toplam = 0;

        System.out.println(sumOfDigits(str, toplam));

    }

    private static int sumOfDigits(String str, int toplam) {
        int sayi[] = new int[str.length()];
        String str2 []= str.split("");
        toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            sayi[i] = Integer.valueOf(str2[i]);
            toplam+=sayi[i];

        }
        System.out.println(Arrays.toString(sayi));

        return toplam;
    }

}





