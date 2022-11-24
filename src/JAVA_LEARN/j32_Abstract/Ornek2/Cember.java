package JAVA_LEARN.j32_Abstract.Ornek2;

public class Cember extends Sekil{
    private double yariCap;
    private final double pi=3.14;//sabit ve değişmemesi için final yazıyoruz.

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }


    @Override
    public double alanHesapla() {
        return this.yariCap*this.yariCap*pi;
    }

    @Override
    public double cevreHesapla() {
        return this.yariCap*2*pi;
    }
}
