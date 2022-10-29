package Clarus_JavaPracticeFall_Elly.day10;

import java.util.Random;
import java.util.Scanner;

public class C2_MathClassMatrix {
    public static void main(String[] args) {
         /*
    Ask user to enter a number and print on console number by number matrix.
    Example:
    Input: 10

    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0

    */
        Scanner dat = new Scanner(System.in);
        System.out.println("matrisin boyutunu giriniz= ");
        int matris = dat.nextInt();
        Random random;
        for (int i = 0; i < matris; i++) {//outer for rows
            for (int j = 0; j < matris; j++) {//outer for columns
              //  System.out.print((int)(Math.random() * 2)+" ");

                System.out.print(new Random().nextInt(2)+" ");
            }
            System.out.println();

        }


    }
}
