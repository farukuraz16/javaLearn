package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Q16 {
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
        if (num1 > num2 && num1 > num3) {System.out.println("biggest= " + num1);
                if (num2 > num3){System.out.println("smallest= "+ num3);}
                if (num3 > num2){System.out.println("smallest= "+num2);}}

        if (num2 > num3 && num2 > num1) {System.out.println("biggest= " + num2);
              if (num1 > num3){System.out.println("smallest= "+ num3);}
              if (num3 > num1){System.out.println("smallest= "+ num1);}}

        if (num3 > num2 && num3 > num1) {System.out.println("biggest= " + num3);
              if (num1 > num2){System.out.println("smallest= "+ num2);}
              if (num2 > num1){System.out.println("smallest= "+ num1);}}


        }
    }

