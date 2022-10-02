package Homework_ScannerClassTasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
Scanner input= new Scanner(System.in);
		System.out.print("bir tam sayı giriniz: ");
		float a= input.nextFloat();
		System.out.print("bir tam sayı giriniz: ");
		float b= input.nextFloat();
		System.out.println("Toplam = " + Math.round(a+b)+"\nFark = "+Math.round(Math.abs(a-b)) + "\nKat = " + Math.round(a*b) + "\nBölüm = "+ (a/b));


	}

}
