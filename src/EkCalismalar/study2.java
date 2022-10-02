package EkCalismalar;

import java.util.Scanner;

public class study2 {
    public static void main(String[] args) {
        //Write a program to check whether a entered character
        // is lowercase ( a to z ) or uppercase ( A to Z )
    Scanner dat = new Scanner(System.in);
        System.out.println("pls insert a letter= ");
        String vr = dat.nextLine();
        char ch =vr.charAt(0);
        //int asc = Integer.valueOf(vr);
        if (Character.isUpperCase(ch)){
            System.out.println("uppercase");
        }
        else if (Character.isLowerCase(ch)){
            System.out.println("lowercase");
        }
        else System.out.println("not letter");





    }
}
