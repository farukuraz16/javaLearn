package JAVA_LEARN.j23_Varargs_StringBuilder.StringBuilder;

public class Task_01 {
    public static void main(String[] args) {
        /*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir metot yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"
 */

        StringBuilder sb1 = new StringBuilder("I love Java");

        System.out.println("tersString(sb1) = " + tersString(sb1));
        tersSB(sb1);
        tersSB(new StringBuilder("I love Java"));
        tersSB(new StringBuilder("ali"));
        System.out.println("isPalindrome(\"ey edip adanada pide ye\") = " + isPalindrome("ey edip adanada pide ye"));
        System.out.println("isPalindrome(\"aga\") = " + isPalindrome("aga"));




    }//main sonu

    public static String tersString(StringBuilder str) {//--->> amele kod
        String stringtersi = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            stringtersi += str.charAt(i);
        }
        return stringtersi;
    }

    public static void tersSB(StringBuilder str){
        System.out.println("str.reverse() = " + str.reverse());


    }

    public static boolean isPalindrome (String str){
        if (str==null){
            return false;
        }

        return new StringBuilder(str).reverse().toString().equals(str);
    }

}
