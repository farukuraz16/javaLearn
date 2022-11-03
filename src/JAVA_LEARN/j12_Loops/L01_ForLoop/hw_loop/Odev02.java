package JAVA_LEARN.j12_Loops.L01_ForLoop.hw_loop;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
		Scanner dat = new Scanner(System.in);
		System.out.println("bir str giriniz");
		String k = dat.nextLine().toLowerCase();

		int sayi=0;

		for (int i = 0 ; i<=k.length()-1 ; i++  ){
			if (k.charAt(i)>=48 && k.charAt(i)<=57  ){
				sayi++;
			}

		}
		System.out.println(sayi);

	}
}
