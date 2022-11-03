package JAVA_LEARN.j10_StringManupulation;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {
       public static void main(String[] args) {
              /** replace()
               * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
               * (update -set) saglar. Sonuc String'dir..
               *
               */

              String str = "javaCAN'lara selam olsun java ile bolcana offer";
              System.out.println(str.replace('a', '@'));//j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer
              System.out.println(str.replace("can", "kan"));//javaCAN'lara selam olsun java ile bolkana offer
              /** ReplaceFirst
               * Replace ile aynı sadece ilk bulunanı değiştirir
               */

              System.out.println(str.replaceFirst("a", "@"));//j@vaCAN'lara selam olsun java ile bolcana offer

              // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
              //1-replace() methodu char kabul eder ama replaceAll kabul etmez
              //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

              //(Regular Expressions)
              //   \\s bosluk ----> bütün boşlukları değiştirmek için kullanılır
              //   \\S bosluk disindaki tum karakterleri değiştirebiliriz
              //   \\w harfler ve rakamları (a z A Z, 0 9) değiştirmek için kullanılır
              //   \\W harfler ve rakamlar disindaki tum karakterleri değiştirmek için kullanılır
              //   \\d rakamlar 0 9 değiştirmek için kullanılır
              //   \\D rakamlar disindaki tum karakterler değiştirmek için kullanılır

              str = "    javaCAN'lara selam olsun :)  java ile 123455544 offer ***   ";
              System.out.println(str.replaceAll("\\s", "+"));//++++javaCAN'lara+selam+olsun+:)++java+ile+123455544+offer+***+++
              System.out.println(str.replaceAll("\\S", "+"));//++++++++++++ +++++ +++++ ++  ++++ +++ +++++++++ +++++ +++
              System.out.println(str.replaceAll("\\w", "+"));//+++++++'++++ +++++ +++++ :)  ++++ +++ +++++++++ +++++ ***
              System.out.println(str.replaceAll("\\W", "+"));//++++javaCAN+lara+selam+olsun+++++java+ile+123455544+offer+++++++
              System.out.println(str.replaceAll("\\d", "+"));//javaCAN'lara selam olsun :)  java ile +++++++++ offer ***
              System.out.println(str.replaceAll("\\D", "+"));//++++++++++++++++++++++++++++++++++++++++++123455544+++++++++++++

              //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
              // isim-soyisim : M***** B*******
              // kart no : **** **** **** 1234

              Scanner dat = new Scanner(System.in);
              System.out.println("Adınız= ");
              String ad= dat.nextLine();
              System.out.println("Soyadınız= ");
              String sad= dat.nextLine();
              System.out.println("16 haneli kart no= ");
              String kart= dat.nextLine();
              String nad=ad.substring(0,1)+ad.substring(1).replaceAll("\\w", "*");
              String ysa=sad.substring(0,1)+sad.substring(1).replaceAll("\\w", "*");
              String ykart="**** **** **** "+kart.substring(12);


              System.out.println("isim-soyisim: "+nad+" "+ysa);
              System.out.println("kart no : "+ykart);


       }
       }


