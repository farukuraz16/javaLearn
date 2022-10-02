package j10_StringManupulation.tasks;

public class _04_String_methods01 {

    public static void main(String[] args) {

        /*  I love java olan bir String oluşturun.
            Bu cümlenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.

    String a = "I love java";
        System.out.println(a.length());
        String a1= a.replaceAll("\\s","");
        System.out.println(a1.length()+" adet karakter bulunmaktadır "+a1);
    }
}
