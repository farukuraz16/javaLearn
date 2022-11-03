package JAVA_LEARN.j18_Constructor;

public class C07_OgrtmRunner {
    String isim;
    int tecrübe;
    int kıdem=5;

    public C07_OgrtmRunner(String isim, int tecrübe) {
        this.isim = isim;
        this.tecrübe = tecrübe;
        this.kıdem = kıdem;
    }

    public void kıdemHesapla (int kıdem){//int p'li method
        System.out.println("kıdem = " + (kıdem*2));
        System.out.println("kıdem = " + (this.kıdem*2));
    }
}
