package j19_StaticVariable;
/*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
        */
public class C02_StaticBlok {
static String isim;

    static{
        System.out.println("2. static blok çalıştı");
        isim="Javacan";
        System.out.println("isim = " + isim);
    }

    static {
    System.out.println("1. static çalıştı");
    isim="dilek hanım";
        System.out.println("isim = " + isim);
    }
    public static void main(String[] args) {

        System.out.println("main metot başladı :)");
        isim="kerim bey";
        System.out.println("isim = " + isim);
        System.out.println("main metot bitti :(");

    }//main sonu


}
