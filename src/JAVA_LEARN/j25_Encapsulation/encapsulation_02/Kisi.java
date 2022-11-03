package JAVA_LEARN.j25_Encapsulation.encapsulation_02;

public class Kisi {//pojo class
    /*
    Kisi pojo class için fields-> ad, soyad, password(String), yas
    tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
    (password encapsulated update edilmemeli.)
    yas variable negatif değer girmeye karsı encapsulated
    runner class'da obj ile field ları print eden code create ediniz
     */

    //fields...

    String ad, soyad;
    private int yas;//negatif değere karşı korumalı olmalı
    private String password;



    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setYas(int yas) {

        //this.yas = Math.abs(yas);//parametre gelen yas negatif olmaması için mutlak değerinialdık

        //istersek if kalıbıyla da yapabiliriz...
        if (yas <0) {this.yas=yas*-1;}
        else this.yas=yas;


    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public String getPassword() {
        return password;
    }

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }




}
