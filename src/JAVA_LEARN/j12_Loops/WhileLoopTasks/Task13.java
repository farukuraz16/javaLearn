package JAVA_LEARN.j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */

        Scanner dat = new Scanner(System.in);
        System.out.println("bir karakter gir= ");
        String ch = dat.next();



        while (ch.charAt(0) != 'x') {
            System.out.println("Helal olsun be javaCAN!!");

            System.out.println("bir karakter gir= ");
            ch = dat.next();

        }
        System.out.println("jAVATAR");

    }

    }

