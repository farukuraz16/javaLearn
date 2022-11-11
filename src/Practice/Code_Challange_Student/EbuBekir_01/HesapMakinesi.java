package Practice.Code_Challange_Student.EbuBekir_01;

import java.util.Scanner;

public class HesapMakinesi {

    double x, y;
    char secim;

    public HesapMakinesi(double x, double y, char secim) {
        this.x = x;
        this.y = y;
        this.secim = secim;
    }

    public HesapMakinesi() {
    }

    public double toplama(double x, double y) {
        return x + y;
    }

    public double çıkarma(double x, double y) {
        return x - y;
    }

    public double çarpma(double x, double y) {
        return x * y;
    }

    public double bölme(double x, double y) {
        return x / y;
    }

    public void giriş() {
        Scanner dat = new Scanner(System.in);
        System.out.print("yapmak istediğiniz işlem-->> +,-,*,/ ");
        secim = dat.next().charAt(0);
        System.out.println("1. sayı= ?");
        x = dat.nextInt();
        System.out.println("2. sayı= ?");
        y = dat.nextInt();
        hesapla();
    }

    public void hesapla() {
        switch (secim) {
            case '+':
                System.out.println("toplama işleminin sonucu= " + toplama(x, y));
                break;
            case '-':
                System.out.println("toplama işleminin sonucu= " + çıkarma(x, y));
                break;
            case '*':
                System.out.println("toplama işleminin sonucu= " + çarpma(x, y));
                break;
            case '/':
                System.out.println("toplama işleminin sonucu= " + bölme(x, y));
                break;
            default:
                System.out.println("hatalı giriş");
        }

    }


}
