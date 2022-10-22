package EkCalismalar;

public class Fatih_Kalem {
    String marka;
    int fiyat;
    String renk = "Mavi";
    double uc;

    public Fatih_Kalem(String marka, int fiyat) {
        this.marka = marka;
        this.fiyat = fiyat;


    }



    public Fatih_Kalem(String marka, int fiyat, String renk, double uc) {
        this.marka = marka;
        this.fiyat = fiyat;
        this.renk = renk;
        this.uc = uc;

    }
}
