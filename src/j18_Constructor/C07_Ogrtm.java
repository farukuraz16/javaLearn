package j18_Constructor;

public class C07_Ogrtm {
    public static void main(String[] args) {
    C07_OgrtmRunner hcm = new C07_OgrtmRunner("sevdenur",11);
        System.out.println("hcm.isim = " + hcm.isim);
        System.out.println("hcm.tecrübe = " + hcm.tecrübe);
        System.out.println("hcm.kıdem = " + hcm.kıdem);
        hcm.kıdemHesapla(13);
    }
}
