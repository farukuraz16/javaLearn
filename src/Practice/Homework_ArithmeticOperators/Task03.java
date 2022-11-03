package Practice.Homework_ArithmeticOperators;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		
	Scanner dat = new Scanner(System.in);
		System.out.print("3 basamaklı bir sayı giriniz: ");
		int sayı = dat.nextInt();
		System.out.println(sayı/100+sayı%10);
		
	}

}
