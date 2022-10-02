package j02_DataTypes_WrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {

         /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */

        String name= "faruk bey";
        String yas="40";
        int age=40;

        boolean emekliMi=true;
        boolean itci=false;
        char ch='$';
        char hrf='A';



//TASK -> 1999 yılında doğan bir kişinin yaşını yazdırınız...
        int dogumyili = 1999;
        int bugun = 2022;
        int yasiniz=bugun-dogumyili;
       System.out.println(yasiniz);

        float f1=12.45f;
        float f2=23.56f;
        System.out.println(f1*f2);

//TASK -> iki farklı byte tanımlayıp toplam ve farkını print ediniz
        byte ceviz=45;
        byte fındık=87;
        System.out.println(ceviz-fındık);
        System.out.println(ceviz+fındık);

        /*
        byte ceviz=45, byte fındık=87;
        System.out.println(ceviz-fındık);
        System.out.println(ceviz+fındık);

        şeklinde de yazabiliriz.  */

        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplam farkını print ediniz
        byte a=14;
        int c=17;
        System.out.println(a+c);
        System.out.println(c-a);
        int k=1999;
        float u=25.7f;
        System.out.println(k+u);
        System.out.println(k-u);

        //Task -> tamsayı ve char data type iki variable  tanımlayıp toplam  print ediniz
        int g=63;
        char para='$';
        System.out.println(g+para); //63+36=99.. $ ASCII değerini 36 olarak aritmetik işleme girdi.


//TASK -> ad soyad yaş print ediniz
        String ad="faruk";
        String soyad="uzgun";
        int ageniz=40;
        System.out.println(ad+" "+soyad+" "+ageniz);
    }
}
