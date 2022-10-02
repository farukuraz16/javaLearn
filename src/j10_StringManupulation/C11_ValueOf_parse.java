package j10_StringManupulation;

public class C11_ValueOf_parse {
    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


// task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String bag1 = "100";
        String bag2 = "200";
        int ybag1 = Integer.valueOf(bag1);
        int ybag2 = Integer.valueOf(bag2);
        System.out.println("toplam bağış= "+ (ybag1 + ybag2));

        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);//1453

        System.out.println("toplam= " + (Integer.parseInt(bag1) + Integer.parseInt(bag2)));

        int tc=1234567;
        String strTc = String.valueOf(tc);
        System.out.println("strTc = " + strTc);//1234567
        System.out.println("strTc+tc = " + (strTc + tc));//

        String fiyat = "$150";
        fiyat= fiyat.replaceAll("\\D","");
        System.out.println("fiyat= "+ fiyat);

        int fiyat2= Integer.valueOf(fiyat);
        System.out.println("fiyat2= "+fiyat2);


    }
}


