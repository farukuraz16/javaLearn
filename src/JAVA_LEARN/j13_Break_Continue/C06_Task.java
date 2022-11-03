package JAVA_LEARN.j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        // task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.

        Scanner dat = new Scanner(System.in);
        System.out.println("metin giriniz= ");
        String metin = dat.nextLine();

        int karaktersayisi=0;
        int i;
        for (i=0;i<metin.length();i++){
            if (metin.charAt(i)=='a'){
                karaktersayisi++;
            }
            else if (metin.charAt(i)=='c') break;


            }
        System.out.println(karaktersayisi);
        }

    }

