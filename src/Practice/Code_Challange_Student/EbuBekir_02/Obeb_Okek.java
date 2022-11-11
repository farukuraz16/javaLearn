package Practice.Code_Challange_Student.EbuBekir_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
TASK => Girilen iki sayının EBOB ve EKOK larını print eden method yazınız.
Ekok(a,b)= |a*b|/ebob(a.b)
 */
public class Obeb_Okek {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("1. sayı= ");
        int num1= dat.nextInt();
        System.out.println("2. sayı= ");
        int num2= dat.nextInt();
        //obeb(num1, num2);
        System.out.println("obeb"+"("+num1+", "+num2+")=" + obeb(num1, num2));

        okek(num1, num2, obeb(num1, num2));
        System.out.println("okek("+num1+", "+num2+")=" + okek(num1, num2, obeb(num1, num2)));
    }

    private static int okek(int num1, int num2, int obeb) {

        return Math.abs((num1*num2))/obeb;
    }


    private static int obeb(int num1, int num2) {
        List <Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.max(num1, num2); i++) {
            for (int j = 1; j <= Math.min(num1, num2) ; j++) {
                if (num1%i==0 && num2%j==0){
                    if (i==j){
                        list.add(i);

                    }
                }

            }

        }


        return list.get(list.size()-1);
    }


}
