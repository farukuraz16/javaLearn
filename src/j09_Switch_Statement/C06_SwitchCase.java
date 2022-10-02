package j09_Switch_Statement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
// TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..

Scanner dat = new Scanner(System.in);
        System.out.print("hangi gün?: ");
String gun = dat.nextLine().toLowerCase();

switch (gun){

    case "pazartesi": case "salı": case "çarşamba": case "perşembe": case "cuma":
                 System.out.println("hafta içi günleridendir");
                 break;
    case "cumartesi": case "pazar":
                 System.out.println("hafta sonu günleridendir");
                 break;
    default:
        System.out.println("hatalı giriş");

}


    }}