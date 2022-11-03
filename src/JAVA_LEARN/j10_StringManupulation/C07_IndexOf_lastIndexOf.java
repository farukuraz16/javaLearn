package JAVA_LEARN.j10_StringManupulation;

import java.util.Scanner;

public class C07_IndexOf_lastIndexOf {
    public static void main(String[] args) {
               /* indexOf()
         * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
         * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false
        */
        String str = "good";
        System.out.println("o harfinin ilk görülen yeri=" + str.indexOf('o'));//sonuç integer olur
        System.out.println("dnin index nosu=" + str.indexOf("d"));//sonuc integer olur
        System.out.println("dnin index nosu=" + str.indexOf("D"));//olmayan karakteri -1 olarak verir.
        // ahan da TRICK -> olmayan karakter indexi sorgulanırsa -1 return eder

        System.out.println("ad ın index nosu=" + str.indexOf("od"));
        System.out.println("ad ın index nosu=" + str.indexOf("Od"));


        /* lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String wrd = "Good of school";
        System.out.println(wrd.lastIndexOf("c"));
        System.out.println(wrd.lastIndexOf("of"));
        System.out.println(wrd.lastIndexOf("d"));
        System.out.println(wrd.indexOf('c'));
        System.out.println(wrd.indexOf(" "));


        /*task
         Girilen cümlenin aşağıdaki durumları sağlayacak code create ediniz
         1-Girilen cumle java icermiyor
         2-Girilen cumle 1 tane java iceriyor
         3-Girilen cumlede birden fazla java var
         */

        Scanner st = new Scanner(System.in);
        System.out.print("cümle giriniz: ");
        String cml = st.nextLine().toLowerCase();
        if (cml.contains("java")) {
            System.out.println("girilen cümle java içeriyor");
            if (cml.indexOf("java") == cml.lastIndexOf("java")) {
                System.out.println("cümlede 1 adet java var");
            } else if (cml.indexOf("java") != cml.lastIndexOf("java")) {
                System.out.println("cümlede 1den fazla java var");
            }
        }
        else {System.out.println("girilen cümle java içermiyor");}

        //haluk hocanın yazdığı kod
        Scanner sc = new Scanner(System.in);
        System.out.print("kafi mikta bir cümle  giriniz : ");

        String cumle = sc.nextLine().toLowerCase();

        if (cumle.indexOf("java") == -1) {
            System.out.println("Girilen cumle java icermiyor");
        }else if (cumle.indexOf("java") == cumle.lastIndexOf("java")){
            System.out.println("Girilen cumle 1 tane java iceriyor");
        }else System.out.println("Girilen cumlede birden fazla java var");




    }
}



