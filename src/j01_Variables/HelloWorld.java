package j01_Variables;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("merhaba dünya");// bu komut konsola yazılan metni print eder
        // dan sonra yazılan ifadeler komut veya kod satırı olarak değil yorum olarak tanımlanır.
        /*
        bu araya yazılan her ifade yorum olur. java kod olarak algılamaz. birden fazla satır açıklama veya yorum yazmak için
        bir adet / ve bir adet * kullanırız.
        başarı gayrete aşıktır.
        bahanesi olanın başarısı olmaz.
         */
        // System.out.println("javacan'lara selam olsun"); çalışmasını istemediğiniz kodlar yoruma alınır

        /*
        otur çalış javaya
         */

        // imlecin olduğu satır ctrl+d tuşuyla bir alt satıra klonlanır.
    /*
        System.out.println("javacan'lara selam olsun");
        System.out.println("javacan'lara selam olsun");
        System.out.println("javacan'lara selam olsun");
        */

        /*
        TRICK: javada code satırı cümle (statement) sonuna mutalaka ; koyulmalı
        code satırında kırmızı alt çizgi uyarısı "compile time error" CTE uyarsı demektir.
        CTE düzeltilmeden code yazılmaz, yazılım çalışmaz
                */

        System.out.println("javacan'lara selam olsun");

        System.out.println("HATA");

        System.out.println("Ad Soyad: Faruk ÜZGÜN");
        System.out.println("Yaş: 40");
        System.out.println("Memleket: Bursa");

        /*
        TRICK:
        print   --> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println --> yazdırma işleminden sonraki komutu ALT satırda devam ettirir.
        javada space bir karakter olarak tanımlanır. boşluk varsa, 1 karakter olarak kabul edilir.
        "f a r u k" boşluklarla birlikte 9 karakterdir
         */

        System.out.print("Ad Soyad: Faruk ÜZGÜN");
        System.out.println(", Yaş: 40");
        System.out.println("Memleket: Bursa");


    }

}
