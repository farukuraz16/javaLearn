package JAVA_LEARN.j10_StringManupulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner dat = new Scanner(System.in);
        System.out.println("any word or sentence?: ");
        String m = dat.nextLine();
        if (m.contains(" ")){
            System.out.println("pls enter again with no space");}
        else if (m.length() % 2 == 0) {
            System.out.println(m.substring(0, ((m.length() / 2))));
        }
        else System.out.println("can not divide to two parts");
        }

    }

