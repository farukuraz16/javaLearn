package JAVA_LEARN.j09_Switch_Statement;

import java.util.Scanner;

public class C05_ATM_project2 {
    public static void main(String[] args) {
/*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */
        int bakiye = 1000;

        Scanner dat = new Scanner(System.in);
        System.out.print("Hesap bakiyesi için---> 1" + "\nPara yatırma için---> 2" + "\nPara çekme için---> 3" + "\nÇıkış için---> 4'e basınız= ");
        int tus = dat.nextInt();

        switch (tus) {
            case 1:
                System.out.println("hesap bakiyeniz:" + bakiye);
                break;
            case 2:
                System.out.print("yatıracağınız tutarı giriniz= ");
                int yat = dat.nextInt();

                System.out.println("yatıracağınız tutar= " + yat + "\nonaylıyor musunuz? (E/H)= ");
                dat.nextLine();
                char onay1 = dat.nextLine().charAt(0);

                if (onay1 == 'E' || onay1 == 'e') {
                    System.out.println("Para yatırma işlemi gerçekleşmiştir." + "\nYeni bakiyeniz= " + (yat + bakiye) + "TL");
                } else System.out.println("para yatırma işlemi iptal edildi. iyi günler dileriz");
                break;

            case 3:
                System.out.print("çekeceğiniz tutarı giriniz= ");
                int cek = dat.nextInt();
                if (cek <= bakiye) {
                    System.out.println("cekeceğiniz tutar= " + cek + "\nonaylıyor musunuz? (E/H)");
                    dat.nextLine();
                    char onay2 = dat.nextLine().charAt(0);
                    switch (onay2) {
                        case 'E':
                        case 'e':
                            System.out.println("Para çekme işlemi gerçekleşmiştir." + "\nYeni bakiyeniz= " + (bakiye - cek) + "TL");
                            break;
                        case 'H':
                        case 'h':
                            System.out.println("para çekme işlemi iptal edildi. iyi günler dileriz");
                            break;
                        default:
                            System.out.println("hatalı giriş. iyi günler dileriz");
                    }
                } else System.out.println(" yetersiz bakiye!");
                break;

            case 4:
                System.out.print("işleminiz iptal edildi.");
                break;
            default:
                System.out.print("iyi günler dinleriz");

/*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */
                /*
                Scanner sc = new Scanner(System.in);
                System.out.println("   ***   ");
                System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
​
                System.out.println("Bakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
                int seçim = sc.nextInt();
                int bakiye = 1000;
​
                switch (seçim) {
                    case 1:
                        System.out.println("agam bakıyen :" + bakiye);
                        break;
                    case 2:
                        System.out.print("agam ne hadar yatıcaksın :");
                        int yatırılanMiktar = sc.nextInt();
                        bakiye += yatırılanMiktar;
                        System.out.println("agam bakıyenin güncalhali :" + bakiye);
                        break;
                    case 3:
                        System.out.println("agam ne kadar cekecen : ");
                        int cekilenMiktar = sc.nextInt();
                        if (cekilenMiktar > bakiye) {
                            System.out.println("agam niddin olmayan parayımı cekecen :(");
                            System.out.println("ahan da bakıyen  " + bakiye);
                        } else {
                            bakiye -= cekilenMiktar;
                            System.out.println("agam bakıyenin güncalhali :" + bakiye);
                        }
                        break;
                    case 4:
                        System.out.println("agam  çıkışın yapıldı selametle");
                        break;
                    default:
                        System.out.println("hatalı şecim girdiniz tekrar deneyiniz");
                        */
        }

    }
}













