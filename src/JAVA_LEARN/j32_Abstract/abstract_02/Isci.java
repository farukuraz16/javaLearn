package JAVA_LEARN.j32_Abstract.abstract_02;

public class Isci extends Personel {//abstract Personel parent classa-->> concrete child Isci class
    //extend ettiğimizde kırmızı çizgi ile hata verir. çünkü implement etmemiz gereken methodlar vardır.
// sağ tıklayıp bunları implememt ediyoruz.--->>

    @Override
    public void maasHesapla() {//Personel parent class'tan override edilen abstract methodlar..
        System.out.println("en çok yevmiye 400TL verilmeli.");

    }

    @Override
    public void maasBilgisi() {
        System.out.println("elemanlara çay-simit verelim..");

    }

}