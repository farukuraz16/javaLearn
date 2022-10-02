package j09_Switch_Statement;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
		Scanner dat = new Scanner(System.in);
		System.out.println("ay ismi giriniz= ");
		String ay = dat.nextLine().toLowerCase();
		switch (ay){
			case "ocak": case "mart": case "mayıs":	case "temmuz": case "eylül": case "ekim": case "aralık":
				System.out.println("31 gün");break;
			case "nisan": case "haziran": case "ağustos":	case "kasım":
				System.out.println("30 gün");break;
			case "şubat":
				System.out.println("28 veya 29 gün");break;
			default:
				System.out.println("hatalı giriş");



		}
	}

}
