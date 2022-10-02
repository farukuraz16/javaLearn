package j09_Switch_Statement;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

		Scanner scan = new Scanner(System.in);
		System.out.println("vıp kısaltmasından ogrenmek ıstedıgınız harfı gırınız");
		char harf = scan.nextLine().toLowerCase().charAt(0);
		switch (harf) {
			case 'v':
				System.out.println("very");
				break;
			case 'ı':
				System.out.println("ımportant");
				break;
			case 'p':
				System.out.println("person");
				break;
			default:
				System.out.println("hatalı harf gırdınız");;
	}
}}
