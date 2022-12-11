package JAVA_LEARN.j37_Enum.enum03;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Kitap ktp1 = new Kitap();
        ktp1.name="İnce Memed 1";
        ktp1.kategori=KitapKategorisi.ROMAN;

        Kitap ktp2 = new Kitap();
        ktp2.name="İnce Memed 2";
        ktp2.kategori=KitapKategorisi.ROMAN;

        Kitap ktp3 = new Kitap();
        ktp3.name="Osmanlı Gerileme Dönemi";
        ktp3.kategori=KitapKategorisi.TARIH;

        ArrayList<Kitap> kutuphane = new ArrayList<>();
        kutuphane.add(ktp1);
        kutuphane.add(ktp2);
        kutuphane.add(ktp3);

        for (Kitap k:kutuphane) {
            if (k.kategori==KitapKategorisi.ROMAN){
                System.out.println(k.name);
            }

        }

    }
}
