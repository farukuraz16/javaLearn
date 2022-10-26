package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By Value bir programlama dilidir.
        Bir  primitive  variable  argument olarak bşr methoda call edildiğinde variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

         */
        // task -> verilen fiyat için %24 artırılmış fiyatı print eden method  create ediniz.


        double fiyat =100;
        System.out.println("method call öncesi fiyat = " + fiyat);
        
        fiyatArttır (fiyat);

        System.out.println("method call sonrası fiyat = " + fiyat);
    }

    private static void fiyatArttır(double bisey) {
        bisey*=1.24;
        System.out.println("arttırma fiyat = " + bisey);
    }


}
