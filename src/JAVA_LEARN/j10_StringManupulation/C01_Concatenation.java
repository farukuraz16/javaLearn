package JAVA_LEARN.j10_StringManupulation;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
        concat() methodu içine(parametee) aldığı string variable'ı çalıştşğı stringin sonuna ekler..
        java'da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */

        String name = " Nur ";
        String meslek = " Qa tester ";
        System.out.println(name.concat(meslek));//Nur Qa tester
        System.out.println(name);//Nur
// ahan da TRICK-> String method'ları variable gecici değişklik yapar.
// ama değişken atam ayağpılırsa kalıcı değişir
        name = meslek.concat(name);
        System.out.println("name = " + name);//name =  Qa tester  Nur

        System.out.println(name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println(name.concat(100 + " :) "));// Qa tester  Nur 100 :)

        // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder

        String name1 = "Faruk";
        String meslek2 = " QA Tester";
        System.out.println(name1.concat(meslek2));
        name1 = meslek2.concat(name1);
        System.out.println(name1);

    }
}
