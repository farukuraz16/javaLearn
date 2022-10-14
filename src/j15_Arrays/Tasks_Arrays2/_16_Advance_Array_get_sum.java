package j15_Arrays.Tasks_Arrays2;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
String a = "$12 $23 $10 $2 $5 $2";
String ab []= a.replace("$","").split(" ");
        System.out.println("Arrays.toString(ab) = " + Arrays.toString(ab));

int sum=0;
        for (int i = 0; i < ab.length; i++) {
            sum+=Integer.parseInt(ab[i]);

        }
        System.out.println("sum = " + sum);


    }
}