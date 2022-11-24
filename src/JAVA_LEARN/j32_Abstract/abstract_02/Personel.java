package JAVA_LEARN.j32_Abstract.abstract_02;

public abstract class Personel {//abstract yapmak için public'den sonra abstract yazıyorz.

    String name = "Nur Hanım";

    public abstract void maasHesapla();//abstract method

    public abstract void maasBilgisi();

    public void sigorta() {//concrete method
        System.out.println("özel sigorta kapsamındasınız");

    }


}
