package JAVA_LEARN.j23_Varargs_StringBuilder.Varargs;

public class C01_Varrags {
    public static void main(String[] args) {
        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....
        }
	      todo  1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		  todo  2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki sayı toplamını print eden METHOD create ediniz

        int sayi1 = 24;
        int sayi2 = 27;
        int sayi3 = 46;
        int sayi4 = 10;
        toplam(sayi1, sayi2);
        toplam(sayi2, sayi3);
        toplam(sayi3, sayi4);

        // Task -> verilen 3 sayı toplamını print eden METHOD create ediniz

        toplam2 (sayi1, sayi2,sayi3);

        //varargs yapalım

        toplamvarargs(1,3,5,sayi1,5,sayi4,65);
        toplamvarargs(sayi1,445,sayi4,sayi1);

//Task-->> Verilen Stringlerin en fazla karaktere sahip olanını print eden method creat ediniz..
        //parametre sayısı belli oladığı için varargs çalışacağız.
        String a = "ebikgabuk";
        String b = "ebikgabuk";
        String c = "ebikgabuk";
        String d = "ebikgabuk";


 enUzunKelime("ali","ii","halllice","ufuk","televizyon");

    }//main sonu

    private static void toplamvarargs(int...a) {
        int toplam = 0;
        for (int w:a) {//--->> varargs da parametreler array içinde olduğu için for döngüsüyle parametreler çağırılır
            toplam+=w;
        }
        System.out.println("varargs sayılar toplamı= "+toplam);
    }

    private static void toplam2(int a, int b, int c) {
        System.out.println("sayılar toplamı= " + (a + b+c));
    }

    public static void toplam(int a, int b) {
        System.out.println("sayılar toplamı= " + (a + b));

    }


    public static void enUzunKelime (String...str){
        String enUzun="";
        for (String v : str) {
            if (v.length()>enUzun.length()){
            enUzun=v;
        }

    }
        System.out.println(enUzun);

}}
