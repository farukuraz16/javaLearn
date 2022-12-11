package JAVA_LEARN.j37_Enum.enum04;

public enum Aylar_04 {
    //OCAK(31,"Kış","Ali"),
    //SUBAT(28,"Kış","Ahmet"),
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(30),
    EYLUL(31),
    EKIM(31),
    KASIM(30),
    ARALIK(31 );


    int gunler ;
    Aylar_04 (int gunSayisi){
        gunler=gunSayisi;
    }

    void gunMiktarı(){
        System.out.println("gunler = " + gunler);
    }



  // Aylar_04(int gunSayisi, String mevsim, String birthDay) {//önce parametreli const oluşturuyoruz. sonra yukarıda aylar hata veriyor.
        //ve bizden parametre girmemizi istiyor. istenilen parametreleri giriyoruz.


    }

