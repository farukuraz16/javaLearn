package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
    //StringBuilder obj create etme..-->>>
    //1. yol..

        StringBuilder sb1 = new StringBuilder();//default capacity 16 bit olan value olmayan boş
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());



        sb1.append("javacan");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());//7 karakterli bir string b.
        System.out.println("sb1.capacity() = " + sb1.capacity());//kapasite hala 16


        System.out.println(sb1.append("ali").append("oley").append(true).append(5).append("kot"));
        System.out.println("sb1.length() = " + sb1.length());//22 karakterli oldu
        System.out.println("sb1.capacity() = " + sb1.capacity());//kapasite 2 katının 2 fazlasına çıktı. her zaman 2 katının 2 fazlasına arttırır
        System.out.println("sb1.indexOf(\"y\") = " + sb1.indexOf("y"));
        System.out.println("sb1.insert(2, \"r\") = " + sb1.insert(2, "r"));
        sb1.deleteCharAt(4);
        System.out.println(sb1);
        sb1.replace(5, 19, "okokok");
        System.out.println(sb1);


        // 2. yol...
        StringBuilder sb2 = new StringBuilder("Kevser hanıma selamlar");//initialize edilmiş (ilk variable verilmiş)
        System.out.println("sb2.length() = " + sb2.length());//22 karakter
        System.out.println("sb2.capacity() = " + sb2.capacity());//22 karakter üzerine +16 ekleyerek kapasiteyi 38 yaptı. atama yapmazsanız default 16 kapasite verir

        //trim method--->>> fazla kapasitesi atma

        System.out.println("sb2.length() = " + sb2.length());//22
        sb2.trimToSize();//gereksiz kapasitesi attık
        System.out.println("sb2.capacity() = " + sb2.capacity());//22.. 38'den 22'ye indirdi.

        //3. yol...
        StringBuilder sb3 = new StringBuilder(11);//11 kapasiteli yer açarak oluşturduk
        System.out.println("sb3.length() = " + sb3.length());//0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekir bey");
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.trimToSize();
        System.out.println("trimTosize sb3.capacity() = " + sb3.capacity());

        //istenen bir karakterin index'ini sorgulama ve alma
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));

        //istenen bir aralıktaki karateri getir
        System.out.println("sb1.subSequence(3, 13) = " + sb1.subSequence(3, 13));
        System.out.println("sb1.substring(3) = " + sb1.substring(3));
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));

        //belirli bir index karakteri silme
        System.out.println("sb1.deleteCharAt(4) = " + sb1.deleteCharAt(4));//3. index silindi
        System.out.println("sb1.delete(0, 8) = " + sb1.delete(0, 8));
        System.out.println("sb1 = " + sb1);

        //istenen karakter veya karakterleri ekleme
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4, \":)\") = " + sb3.insert(4, ":)"));
        String s="güzel insan";
        System.out.println("sb3.insert(9, s) = " + sb3.insert(9, s));
        System.out.println("sb3.insert(5, s,2,5) = " + sb3.insert(5, s, 2, 5));
        //sb3'ün 5. indexine s'in 2-5 index aralığını ekle.. yani 2.3.4'üncü karakterlerini ekle..
        System.out.println("sb3 = " + sb3);

        StringBuilder sb4= new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5, \"QA team leader\",0,2) = " + sb4.insert(5, "QA team leader", 0, 2));
        //System.out.println("sb4.insert(5, \"QA team leader\",0,2) = " + sb4.insert(5, sb3, 0, 9));
        System.out.println("sb4 = " + sb4);

        //istenen indexteki karakteri değiştirme
        sb4.setCharAt(6, 'a');
        System.out.println("sb4 = " + sb4);
        sb4.setCharAt(sb4.indexOf(" "), ':');
        System.out.println("sb4 = " + sb4);
        System.out.println("sb4.insert(5,\" \") = " + sb4.insert(5, " "));

        //belirli indexlerdeki karakterler yerine istenilen karakterleri doldurma
        System.out.println("sb4.replace(2, 5, \"aaaa\") = " + sb4.replace(2, 5, "aaaa"));

        //sb obj'yi stringe çevirme
        System.out.println("sb4.toString().toLowerCase() = " + sb4.toString().toLowerCase());
        System.out.println("sb4.toString().toUpperCase() = " + sb4.toString().toUpperCase());

        //String ile StringBuilder karsilastirmasi


/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersek Java CTE verir
 */

        StringBuilder sb5= new StringBuilder("javaCan");
        StringBuilder sb6= new StringBuilder("javaCan");
        String str1= "javaCan";


        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//tamamen aynı olduğu için -->>0

        System.out.println("sb6.compareTo(str1) = " + sb6.compareTo(new StringBuilder(str1)));//data type farklı olduğu için builder yaptı
        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));//false
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true


    }//main
}