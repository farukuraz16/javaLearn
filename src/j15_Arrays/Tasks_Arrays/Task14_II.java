package j15_Arrays.Tasks_Arrays;

import java.util.Arrays;

public class Task14_II {
    public static void main(String[] args) {

        String str = "ade1r4d3";
        System.out.println(sumOf(str));

    }
    public static int sumOf(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.valueOf(str.substring(i, i + 1));
            }

        }

        return sum;

}


}





