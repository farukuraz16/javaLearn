package JAVA_LEARN.j32_Abstract.Ornek2.HalukHoca;

public class Dikdortgen extends Sekil {
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alan() {
        return this.uzunluk * this.genislik;
    }

    @Override
    public double cevre() {
        return (this.uzunluk + this.genislik) * 2;
    }
}
