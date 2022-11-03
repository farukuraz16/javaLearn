package JAVA_LEARN.j10_StringManupulation.tasks;

public class _14_String_methods11 {

    public static void main(String[] args) {

        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.

        String a = "aPPle";
        System.out.println(a.equals("apple"));
        System.out.println(a.equalsIgnoreCase("apple"));

    }
}
