package JAVA_LEARN.j07_Logical_Mantıksal_Operator.ComparisonTasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

//Task17
        Scanner dat= new Scanner(System.in);
        System.out.print("num1 giriniz= ");
        int num1 = dat.nextInt();
        System.out.print("num2 giriniz= ");
        int num2 = dat.nextInt();
        System.out.println(num1==num2);



    }
}
