package JAVA_LEARN.j19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {
        //C01_Ogrtmn.okul="Kabataş Lisesi";//static değeri update oldu.. buraya yazarsam hc1in okulu da aynı olur.
        C01_Ogrtmn hc1 = new C01_Ogrtmn("cüneyt", 11);
        System.out.println("hc1.tecrübe = " + hc1.tecrübe);
        System.out.println("hc1.isim = " + hc1.isim);
        //hc1.okul = "kabadaş";//static variable obj ile call edilmez
        System.out.println("hc1.okul = " + hc1.okul);


        C01_Ogrtmn.okul="Kabataş Lisesi";//static değeri update oldu

        C01_Ogrtmn hc2 = new C01_Ogrtmn("bekir", 7);
        System.out.println("hc2.tecrübe = " + hc2.tecrübe);
        System.out.println("hc2.isim = " + hc2.isim);
        //hc2.okul = "kabatttaş";
        System.out.println("hc2.okul = " + hc2.okul);

        C01_Ogrtmn hc3 = new C01_Ogrtmn("nazım", 13);
        System.out.println("hc3.tecrübe = " + hc3.tecrübe);
        System.out.println("hc3.isim = " + hc3.isim);
        //hc3.okul = "ggggabadaş";
        System.out.println("hc3.okul = " + hc3.okul);

        hc1.evlilikYıldönümü();//obj name  ile nonstatic metod call edildi
        C01_Ogrtmn.maasHesapla();//class name ile static metod call edildi
        hc2.maasHesapla();//obj name ile static metod call edilmez->> bad practice
    }
}
