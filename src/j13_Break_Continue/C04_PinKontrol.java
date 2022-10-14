package j13_Break_Continue;

import java.util.Locale;
import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        String pin= "yildiz";
        Scanner dat = new Scanner(System.in);



        int girisHakki=3;
        while (true) {
            System.out.println("AGAm pin'ini giresen :");
            String agaPin = dat.nextLine();
            if (agaPin.equals(pin)) {
                System.out.println("agam bugun ballısın gayet başarılı :) ");
                break;
            } else {
                System.out.println("agam bugun nasipsizsin bi daha dene");
                girisHakki--;
                System.out.println("agam kalan canın : " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("agam canın kalmadı bidahkine bekleme yapma dewamkeee :(");
                    break;
                }
            }
        }

        /*
        int i;
        for (i=1; i<4; i++){

            if (giris.equals(pin)){
                System.out.println("onaylandı");
                break;
                }
            else System.out.println("tekrar pin giriniz= ");
            giris = dat.nextLine().toLowerCase();

        }
        //if (i==3) System.out.println("işlem iptal");

*/




        }}