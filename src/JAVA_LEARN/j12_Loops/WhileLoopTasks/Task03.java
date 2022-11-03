package JAVA_LEARN.j12_Loops.WhileLoopTasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner dat = new Scanner(System.in);
		System.out.print("sayı giriniz= ");
		int sayi= dat.nextInt();

		int i;
		for (i=1; i<=sayi; i++){
			System.out.println(sayi+" x "+i+" = "+(sayi*i));

	}

}}
