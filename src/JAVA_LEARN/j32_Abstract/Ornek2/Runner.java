package JAVA_LEARN.j32_Abstract.Ornek2;

public class Runner {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(24,7);
        dd.setName("Dikdortgen");//private olduğu için set methoduyla isim ataması yapabiliyoruz.
        dd.cevreHesapla();//sout etmediğimiz için print edilmedi
        dd.alanHesapla();//sout etmediğimiz için print edilmedi
        dd.ciz();
        System.out.println(dd);//toString methoduyla tüm bilgiler print edildi. çünkü toString methodu içinde alan ve çevre hesapmala methodlarını çağırdık.

        Cember cmbr = new Cember(39);
        cmbr.setName("Çember");
        System.out.println(cmbr);

    }
}
