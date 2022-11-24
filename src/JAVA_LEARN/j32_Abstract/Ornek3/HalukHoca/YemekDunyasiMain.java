package JAVA_LEARN.j32_Abstract.Ornek3.HalukHoca;

public class YemekDunyasiMain {
    public static void main(String[] args) {


        Baklava bklv = new Baklava();
        bklv.madeIn();
        bklv.taste();

        CheeseCake chc = new CheeseCake();
        chc.madeIn();
        chc.taste();

        SezarSalad sld = new SezarSalad();
        sld.madeIn();
        sld.taste();
    }
}
