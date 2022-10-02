package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

        //work1
        boolean başarılı =true;
        //String başarı=başarılı; //-> doğal uyum olmayan variablelarda casting yapılamaz CTE
        boolean başarı = başarılı;
        System.out.println("başarı = "+başarı);



        //work2
        double d=17; //double variable int 17 atandı
        System.out.println("d = " + d);// d= 17.0 auto widing..
        int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2);// 4
        // Java iki int sayıyı böldüğümüzde sonucu int olarak verir. ondalık sayı olarak vermez.
        //eğer bölme işleminde ondalık sayı çıkarsa, ondalık kısmı siler.. yuvarlamaz, siler!!!


        //work3
                byte b = 127;
                int i = b;//k->b autowiding
                System.out.println("i = " + i);//127

                int num = 1453;
                double d1 = num; //k->b aw
                System.out.println("d1 = " + d1);//1453.0

                double db = d1 / num; //1.0
                // TRICK-> iki farklı data type sayi işleme girerse java
                // kucuk olan data type turu için aw(autowiding) yapar, sonucu buyuk olan data type  olarak verir

                System.out.println("db = " + db);//db = 0.01169993117687543
        /*
        int num1 = 1453;
        double d2 = 17; //k->b aw
        System.out.println("d2 = " + d2);//1453.0

        double dc = d2 / num1; //1.0
        // TRICK-> iki farklı data type sayi işleme girerse java
        // kucuk olan data type turu için aw(autowiding) yapar, sonucu buyuk olan data type  olarak verir

        System.out.println("dc = " + dc);//dc = 0.01169993117687543
        */





        //work4
        //byte < short < int < long < float < double
		//Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
		//Java otomatik olarak yapmaz. kod ile teyit ister...

                double d2 = 14.53;
                int num2 = (int) d2;//b->k
                System.out.println("num2 = " + num2);//14

                int num3 = 150;
                byte b1 = (byte) num3;
                System.out.println("b1 = " + b1);//b1 = -106...
                // çünkü 127e kadar gider 127'den sonra tekrar -128'e gitti ve oradan -106'ya kadar sayar.. ve 150yi tamamlar...

                double d3 = 333;
                long l = (long) d3;
                System.out.println("l = " + l);

                double d4=571.4444;
                long l2= (long) d4;
                System.out.println("l2 = " + l2);//l2 = 571


        //kullanıcıdan bir karakter isteyin ve bu karakterin ascii değerini yazdırın..
        Scanner s = new Scanner(System.in);
        System.out.println("ascii değerini istediğiniz karakteri giriniz = ");
        char ch = s.nextLine().charAt(0); //nextLine ile sadece metin veya kelime alınabilir. karakter alması için chartAt() kullanmak zorunadayız
        int ascii= ch;

        System.out.println(ch+" ascii değeri = " + ascii);


    }
        }
