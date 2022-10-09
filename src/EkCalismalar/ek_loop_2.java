package EkCalismalar;

import java.util.Scanner;

public class ek_loop_2 {
    public static void main(String[] args) {

//2.
//Print the following patterns using loop :
//a.
//*
//**
//***
//****
//b.
//  *
// ***
//*****
// ***
//   *
//c.
//1010101
// 10101
//  101
//   1
        System.out.println("a. ");
        for (int i = 1; i < 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("b. ");
        int s = 0;

        for (int i = 1; i < 10; i += 2) {

            if (i < 6) {
                s = i;
                for (int k = i; k<5; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= s; j++) {
                    System.out.print("* ");
                }
            } else if (i > 5) {
                s = 10 - i;
                for (int k = 6; k<=i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= s; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
        int i, j, k, l;
        System.out.println("c. ");
        for (i = 7; i > 0; i -= 2) {

            for (k = i; k < 7; k += 2) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {

                if (j % 2 == 0) System.out.print(0);
                else System.out.print(1);
            }

            System.out.println();
        }


    }//main sonu


}

