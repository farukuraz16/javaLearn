package Practice.EkCalismalar;

public class Fatih_KalemRunner {
    public static void main(String[] args) {
        Fatih_Kalem Faber = new Fatih_Kalem("Dolphin",15);

        System.out.println("Faber.fiyat = " + Faber.fiyat);
        System.out.println("Faber.marka = " + Faber.marka);
        System.out.println("Faber.uc = " + Faber.uc);
        System.out.println("Faber.renk = " + Faber.renk);



        Fatih_Kalem Adel = new Fatih_Kalem("Tombo",25,"yeşil",0.7);

        System.out.println("Adel.renk = " + Adel.renk);
        System.out.println("Adel.fiyat = " + Adel.fiyat);

        System.out.println("Adel = " + Adel);

    }
}
