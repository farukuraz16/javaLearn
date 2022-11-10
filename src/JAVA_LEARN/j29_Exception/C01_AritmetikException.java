package JAVA_LEARN.j29_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_AritmetikException {
    public static void main(String[] args) {

        //  ArithmeticException -> Matematiksei işlemlerde oluşan RTE Exception'dur
        String str = "";
        //str.charAt(2);//RTE exception

        Scanner dat = new Scanner(System.in);
        System.out.println("1. sayı gir: ");
        int sayi1 = dat.nextInt();

        System.out.println("2. sayı gir: ");
        int sayi2 = dat.nextInt();
        // int oran = sayi1/sayi2;
        // System.out.println("oran = " + oran);//RTE-->> ArithmeticException: / by zero... 2. sayı 0 olursa...


        try {//dene-> hatanın olma ihitmali oldugu code block
            /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmazçcatch block try block exception hat yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir

             */
            int oran = sayi1 / sayi2;
            System.out.println("oran = " + oran);//RTE-->> ArithmeticException: / by zero... 2. sayı 0 olursa...

        } catch (ArithmeticException falanFilan) {
            System.out.println("böölen 0 olamaz.. aritmatic.."+falanFilan.getMessage());//hata mesajı print etmek için getMessage metotu kullanılır..

            falanFilan.printStackTrace();//hatalı kodu yazar

            System.out.println("çırak catch den selam");
        } catch (ArrayIndexOutOfBoundsException ereeyy) {
            System.out.println("Arrayyyy olamayn eleman istiyorsun..");
        }
        //catch (Exception e) {//tüm exception ların parents classıdır..-->> bad practice
        //    System.out.println("0 a bölünmez.. ");
        //    System.out.println("usta catch den selam");

       finally {//catch block'lardan sonra istenirse finally block kullanılabilir
            /*
            try - catch içinde yapılna işlemlerden sonra mutlaka çalışması gerekn block vatsa finally tanımlanır.
            hata d nlanır.ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hsts olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
             */
        System.out.println("Agam finally block'tan selamlar :)");
    }

        System.out.println("devamkee");
    }

}
        //catch(ArithmeticException falanFilan){//bu child exceptiondır. "Exception e" en genelidir. o yüzden bu çalışmaz. CTE verri.
        //
        //}





