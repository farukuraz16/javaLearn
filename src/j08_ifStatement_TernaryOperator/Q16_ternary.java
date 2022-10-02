package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Q16_ternary {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner dat = new Scanner(System.in);
        System.out.println("enter I= ");
        int num1 = dat.nextInt();
        System.out.println("enter II= ");
        int num2 = dat.nextInt();
        System.out.println("enter III= ");
        int num3 = dat.nextInt();

        System.out.println( num1 > num2 && num1 > num3 ? "biggest= " + num1 :
                num2 > num3 ? "smallest= " + num3 :
                        num3 > num2 ? "smallest= " + num2 :

                                num2 > num3 && num2 > num1 ? "biggest= " + num2 :
                                       num1 > num3 ? "smallest= " + num3 :
                                                num3 > num1 ? "smallest= " + num1 :

                                                        num3 > num2 && num3 > num1 ? "biggest= " + num3 :
                                                                num1 > num2 ? "smallest= " + num2 : "smallest= " + num1);


    }
    }

