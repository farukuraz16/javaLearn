package j13_Break_Continue.taskss;

import java.util.Scanner;

public class T03_TasKagitMakas {

	public static void main(String[] args) {
		// tas >makas
		// makas >kagit
		//kagit >tas
		int numberOfFirstWin=0;
		int numberOfSecondWin=0;
		int numberOfComWin =0;
		int gameOver=3;

		int i =1;
		while (i<4) {
			Scanner scan = new Scanner(System.in);
			System.out.println("oyuncu1 --> taş-kağıt-makas ?= ");
			char oyuncu1secim = scan.nextLine().toLowerCase().charAt(0);
			System.out.println("oyuncu2 --> taş-kağıt-makas ?= ");
			char oyuncu2secim = scan.nextLine().toLowerCase().charAt(0);

			if (oyuncu1secim == oyuncu2secim){ System.out.println("tekrar"); continue;}

			else if (oyuncu1secim == 't' && oyuncu2secim == 'm') { System.out.println("taş kırar!");
			numberOfFirstWin++;
			i++;}

			else if (oyuncu1secim == 'm' && oyuncu2secim == 't') { System.out.println("taş kırar!");
			numberOfSecondWin++;
			i++;}

			else if (oyuncu1secim == 't' && oyuncu2secim == 'k') {System.out.println("kağıt kaplar!");
			numberOfSecondWin++;
			i++;}

			if (oyuncu1secim == 'k' && oyuncu2secim == 't') {System.out.println("kağıt kaplar!");
			numberOfFirstWin++;
			i++;}


			if (oyuncu1secim == 'k' && oyuncu2secim == 'm') {System.out.println("makas keser!");
			numberOfSecondWin++;
			i++;}

			if (oyuncu1secim == 'm' && oyuncu2secim == 'k') {System.out.println("makas keser!");
			numberOfFirstWin++;
			i++;}



		}
		System.out.println("oyuncu1 puan ->>"+numberOfFirstWin);
		System.out.println("oyuncu2 puan ->>"+numberOfSecondWin);


	}

}
