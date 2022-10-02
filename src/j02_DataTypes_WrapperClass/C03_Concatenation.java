package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad = "Haluk";
        String soyad = "Bilgin";
        int a = 7;
        int b = 11;
        // Birden çok String variable ile farklı data type  variable'ler + ile işleme alınırsa,
        // java birleştirme yaparak yeni bir String oluşturur. buna concat denir
        // + ile sayıların toplanması değil de bir araya getirilmesi (birliştirilmesine) concat denir.
        //Concat'ta, string variable'a gelene kadar tüm sayıları 4 işlem gibi toplama yapar.
        // Ancak string bir variable geldiğinde sonraki tüm variablelar string olur

        System.out.println(ad+soyad+a+b);//HalukBilgin711

        System.out.println(a+ad+soyad+b);//7HalukBilgin11

        System.out.println(a+b+ad+soyad);//18HalukBilgin

        System.out.println(" "+a+b);// 711.. tırnak içindeki space, string kabul edilir. sonraki herşey string olur.

        System.out.println(ad+soyad+(a+b));//HalukBilgin18  --özel yapılar önce, genel yapılar sonra işleme alınır.
        //burada parantez için önce yapılır. parantez için integret olduğu için toplama işlemi yapılır. sonra comcat yapılır.

        System.out.println((a+b)+ad+soyad);//18HalukBilgin

        System.out.println(ad+(a-b)+(a-b));//Haluk-4-4 --parantez içleri öncelikli.. çıkarma işlemi yapılır. sonra concat..

        System.out.println(ad+((a-b)+(a-b)));//Haluk-8 -- çıkarma işlemleri de parantez içinde olduğu için int olur ve toplama işlemi yapılır.
        //sonrasında concat olur..

        char ch='1';//
        System.out.println(ad+ch);//Haluk1

        System.out.println(a+ch+ad);//56Haluk --a ve ch string değildir. ch:1 karakteridir.
        // bu karakterin yani 1'in ascii değeri 49dur. a:7 '1'ascii değeri:49 toplamı:56
        //int ile char, concat olmaz.

        System.out.println(ad+(ch+b));//Haluk60

        System.out.println(a+ad+ch);//7Haluk1

        System.out.println(a+""+ch);//7Haluk1

      /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
        eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
       */
    }
}

        //char ch='1';
     /*   System.out.println(ad+ch);

        System.out.println(a+ch+ad);

        System.out.println(ad+(ch+b));

        System.out.println(a+ad+ch);
    */
        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
  eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
 */

    // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
// işlem yapılıp String variable'a Concatenation yapılır.

