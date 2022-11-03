package JAVA_LEARN.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
         /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int sayi = sc.nextInt();

        if (sayi > 0) {//sayinin sıfırdan buyuk olması şarta baglandı
            System.out.println("girilen sayi pozitif");
        } else if (sayi < 0) {//sayinin sıfırdan buyuk olmaması halinde sıfırdan kucuk olamsı sarta baglandı
            System.out.println("girilen sayi negatif");
        } else {//syının sıfırdan buyuk veya kucuk olmaması halıinde kalan durum(sıfıra eşit olması) şarta bağlandı
            System.out.println("girilen sayi ne negatif  ne de pozitifdir yani nötr'dür");
        }

 /*
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("agam notunu  gir : ");
        int not = sc.nextInt();
        if (not<0 || not>100){
            System.out.println("agam negatif ve 100 den buyuk not olmaz\nadam gibi bişeyler gir :(\n" +
                    "gelmiim oraya");
        }else if (not<50){//50 den kucuk not alma kontrolu
            System.out.println("D");//1,2,3..49
        }else if (not<60){//60 den kucuk not alma kontrolu
            System.out.println("C");
        }else if (not<80){//80 den kucuk not alma kontrolu
            System.out.println("B");//60,61,...79
        }else {//80 ve buyuk    not alma kontrolu
            System.out.println("A");//80,81...1000
        }

        //ugur bey code :)
*/


     /*
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("agam notunu  gir : ");
        int not = sc.nextInt();
        // if (not<0 || not>100){
        //     System.out.println("agam negatif ve 100 den buyuk not olmaz\nadam gibi bişeyler gir :(\n" +
        //             "gelmiim oraya");
        // }else if (not<50){//50 den kucuk not alma kontrolu
        //     System.out.println("D");//1,2,3..49
        // }else if (not<60){//60 den kucuk not alma kontrolu
        //     System.out.println("C");
        // }else if (not<80){//80 den kucuk not alma kontrolu
        //     System.out.println("B");//60,61,...79
        // }else {//80 ve buyuk    not alma kontrolu
        //     System.out.println("A");//80,81...1000
        // }

        //ugur bey code :)
        if (not<0 ){
            System.out.println("agam negatif  not olmaz\nadam gibi bişeyler gir :(\n" +
                    "gelmiim oraya");

        }else if (not<50){//50 den kucuk not alma kontrolu
            System.out.println("D");//1,2,3..49
            //        }else if (not>=50 && not<60){//60 den kucuk not alma kontrolu
            System.out.println("C");//50,51,52..59

        }else if (not>=60&&not<80){//80 den kucuk not alma kontrolu
            System.out.println("B");//60,61,...79​
        }else if (not>=80&& not<=100){//80 ve buyuk    not alma kontrolu
            System.out.println("A");//80,81...1000

        }else{//100 ve 100 den buyuk olmayı kontrol eder
            System.out.println("agam 100 den buyuk  not olmaz\nadam gibi bişeyler gir :(\n" +
                    "gelmiim oraya");
        }
     */


    }
}
