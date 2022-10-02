package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {


        //kullanıcıdan veri almak için şu adım takip edilir.
        //1. adım -> Scanner classında bir obje creat edilir.

        Scanner scan = new Scanner(System.in);//scanner classından "scan" isminde değerini system içinden alan bir obje.


        // 2.adım->kullanıcıdan istenen veri için bildirim de bulunulur.

        System.out.print("adınızı giriniz : ");//ln harfkerini silersek, kullanıcı adını hemen yana yazar. ln kalırsa alta yazar.


        //3.adım->kullanıcının girdiği data tipine göre bir variable atanır.

        String isim = scan.nextLine(); //kullanıcıdan gelen string içinde isim verisi scan objesini nextline metotuyla atandı.
        System.out.println("isim = " + isim);

       //Task-> Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code yazınıs.

        Scanner input = new Scanner(System.in);
        System.out.print("Karenin bir kenar uzunluğunu giriniz : ");
        int kenar= input.nextInt();//int verilerde nextInt kullanılmalı. stringlerde nextLine kullanılır
        int alan=kenar*kenar;
        int çevre=kenar*4;
        System.out.println("Karenin Alanı = "+alan+"\nKarenin Çevresi = "+çevre);

        //kullanıcının kullandığı şeker sayısı

        //Scanner gıda= new Scanner(System.in);//Scanner input(input yerine istediğimiz ifadeyi yazabiliriz.)..
        //bir tane Scanner input classı yazmak yeterli...
        // bu satırdan bir kere yazmak yeterli. bundan sonraki tüm girdiler için "input" kelimesini kullanabiliriz.
        System.out.println("Günde ortalama kaç bardak çay içiyorsunuz?:");
        int çay= input.nextInt();
        System.out.println("Bir bardak çaya kaç şeker atıyorsunuz?:");
        int şeker= input.nextInt();
        System.out.println("Yıllık ortalama kullandığınız şeker miktarı: "+(çay*şeker*365*1.7)/1000+" kg");



Scanner sc= new Scanner(System.in);
        System.out.print("isminizi giriniz : ");
        char ch=sc.nextLine().charAt(0); //kullanıcıdan gelen index ifadenin sıfırıncı karakterini alır
        System.out.println("isminizin ilk karakteri= " + ch);



        //Scanner sc = new Scanner(System.in);//1. adım
        //System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        //String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        // System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);

    }
}
