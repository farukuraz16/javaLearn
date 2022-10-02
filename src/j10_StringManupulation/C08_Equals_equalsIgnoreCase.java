package j10_StringManupulation;

public class C08_Equals_equalsIgnoreCase {
       public static void main(String[] args) {
              /* equals()
               * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
               *
               * equalsIgnorecase()
               * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
               */
              /*
               * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
               * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
               */

String str1 ="Merhaba";
String str2 ="merhaba ";
              System.out.println(str1.equals(str2));
              System.out.println(str2.equals(str1));
              System.out.println(str1.equalsIgnoreCase(str2));
              str2 ="merHaba";
              System.out.println(str1.equals(str2));
              System.out.println(str2.equals(str1));

              System.out.println(str1.equalsIgnoreCase(str2));
              System.out.println(str2.equalsIgnoreCase(str1));


              String s1="Songül Hanım";// String pool -> gömlek cebi->kolay çıkan para
              String s2="Songül Hanım";// String pool -> gömlek cebi->kolay çıkan para
              String s3=new String("Songül Hanım");//obj non primitive -> heap memory->cüzdan
              String s4=new String("Songül Hanım");//obj non primitive -> heap memory->cüzdan


              System.out.println(s1 == s2);
              System.out.println(s1.equals(s2));

              System.out.println(s3 == s4);
              System.out.println(s3.equals(s4));

       }
       }


