package JAVA_LEARN.j32_Abstract.abstract_02;

public class IdariPersonel extends Personel {
    @Override
    public void maasHesapla() {//mecburen impelement edilmeli
        System.out.println("frapan idarecimize saati 120 dolar");
    }

    @Override
    public void maasBilgisi() {//mecburen impelement edilmeli
        System.out.println("cıncık koda yazan idari personele ikramiye ");
    }

    @Override
    public void sigorta() {//generate gidip concrete methodu da override ettik. mecbur değiliz tercih ettik.
        //super.sigorta(); bunu istersek sileriz.
        System.out.println("cincik kod yazana full sigorta...");
    }
}
