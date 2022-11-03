package JAVA_LEARN.j11_MethodCreation;

import java.util.Scanner;

public class Task04_ATMMethod {
    static Scanner dat = new Scanner(System.in);
    static int bakiye = 1000;
    public static void secim() {
        System.out.println("agam ne yapacaksan seç:  ");
        int secim = dat.nextInt();
        switch (secim) {
            case 1:
                bakiyeVer();
                break;
            case 2:
                parayatır();
                break;
            case 3:
                paracek();
                break;
            case 4:
                cikis();
                break;
            default: System.out.println("agam daha seçim yapamiisen"); karar();
        }

    }

    private static void cikis() {
        System.out.println("agam yine bekleriz.. selametle...");
    }

    private static void paracek() {
        System.out.println("agam ne kadar çekecen?= ");
        int çekilecekMiktar = dat.nextInt();
        if (çekilecekMiktar<= bakiye){
            bakiye-= çekilecekMiktar;
            System.out.println("agam para cebinde. hayrını gör!");
            System.out.println("yeni bakiye = " + bakiye);

        }else System.out.println("agam neettin? olmayan parayı mı istiyon?");

        karar();

    }

    private static void parayatır() {
        System.out.println("ne kadar yatırcen= ");
        int yatıralacak = dat.nextInt();
        bakiye+=yatıralacak;
        System.out.println("yeni bakiye = " + bakiye);

        karar();
    }

    private static void bakiyeVer() {
        System.out.println("agam bakiyen"+bakiye);
        karar();
    }
    public static void karar (){
        System.out.println("işleme devamsa---> 1 \n yeter-> 0");
        int karar = dat.nextInt();
        if (karar==1){
            secim();

        }else if (karar==0) cikis();
        else {System.out.println(" adam gibi sayı gir");
            karar();}


    }
}
