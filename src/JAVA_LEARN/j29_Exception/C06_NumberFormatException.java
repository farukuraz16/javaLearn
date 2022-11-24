package JAVA_LEARN.j29_Exception;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method runn ederek ınteger'e cevirildiğinde oluşan RTE exception
        // java'da String içinde ki rakam karakterler parseInt() method ile ınt değere atanabilir
String str="1453";
        System.out.println("str+5 = " + str + 5);//14535--->> concat
        int sayi=Integer.parseInt(str);//String, int oldu.
        System.out.println("sayi = " + sayi);
        System.out.println("sayi+5 = " + (sayi + 5));//1458

        String id= "57l622";
        //System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException
        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));

        } catch (NumberFormatException e) {
            System.out.println("int olmayan ifade var.");
        }


        System.out.println("bu yazıyı okuyorsan kod kırılmadan deavm etti..");
    }
}
