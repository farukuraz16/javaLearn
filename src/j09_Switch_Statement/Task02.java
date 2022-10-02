package j09_Switch_Statement;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int gun = scan.nextInt();
        System.out.println("gun = " + gun);
        switch ((gun+100)%7){
            case 1 : System.out.println("Pazartesi"); break;
            case 2 : System.out.println("Salı"); break;
            case 3 : System.out.println("Çarşamba"); break;
            case 4 : System.out.println("Perşembe"); break;
            case 5 : System.out.println("Cuma"); break;
            case 6 : System.out.println("Cumartesi"); break;
            case 7 : System.out.println("Pazar"); break;
            default: System.out.println("hatalı giriş");
        }




    }
}

