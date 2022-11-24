package JAVA_LEARN.j32_Abstract.abstract_02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1 = new Isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.sigorta();//concrete method call edildi.
        mrb1.name="Ebu Bekir Bey";
        System.out.println("mrb1.name = " + mrb1.name);

        IdariPersonel cncCoder = new IdariPersonel();
        cncCoder.name="Faruk Bey";
        System.out.println("cncCoder.name = " + cncCoder.name);
        cncCoder.maasBilgisi();
        cncCoder.maasHesapla();
        cncCoder.sigorta();


    }
}
