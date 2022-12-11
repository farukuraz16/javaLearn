package Practice.Code_Challange_Student.Baris;

import java.util.*;

public class Lesson {
    Scanner sc = new Scanner(System.in);
    private int maxKrediSayısı = 10;
    private int kalanKrediSayısı = 10;
    private int kullanılanKrediSayısı = 0;
    private int dersMinKrediSayısı = 0;
    private int kullanıcıTercihi;

    public int getKalanKrediSayısı() {
        return kalanKrediSayısı;
    }

    public void setKalanKrediSayısı(int kalanKrediSayısı) {
        this.kalanKrediSayısı = kalanKrediSayısı;
    }

    public int getKullanılanKrediSayısı() {
        return kullanılanKrediSayısı;
    }

    public void setKullanılanKrediSayısı(int kullanılanKrediSayısı) {
        this.kullanılanKrediSayısı = kullanılanKrediSayısı;
    }

    public int getDersMinKrediSayısı() {
        return dersMinKrediSayısı;
    }

    public void setDersMinKrediSayısı(int dersMinKrediSayısı) {
        this.dersMinKrediSayısı = dersMinKrediSayısı;
    }

    public int getKullanıcıTercihi() {
        return kullanıcıTercihi;
    }

    public void setKullanıcıTercihi(int kullanıcıTercihi) {
        this.kullanıcıTercihi = kullanıcıTercihi;
    }


    ArrayList<String> dersler = new ArrayList<>(Arrays.asList("Java", "Math", "English", "Turkish", "Science"));
    ArrayList<Integer> derslerinKredileri = new ArrayList<>(Arrays.asList(4, 3, 4, 2, 3));
    ArrayList<String> alınanDersler = new ArrayList<>();
    ArrayList<Integer> alinanDerslerinKredileri = new ArrayList<>();

    public void dersEkle(Student ogr1) {
        while (getKalanKrediSayısı() >= getDersMinKrediSayısı() && dersler.size() != 0) {

            System.out.println("Alabileceğiniz dersler ve kredileri");
            System.out.println("===================================");
            int j = 1;

            for (int i = 0; i < dersler.size(); i++) {
                System.out.println(j + ") " + dersler.get(i) + " dersi" + derslerinKredileri.get(i) + " kredi. " + dersler.get(i) + " seçmek için --> " + j + " giriniz.");
                j++;
            }

            System.out.println("Alabileceğiniz toplam kredi: " + getKalanKrediSayısı());
            System.out.println("Almak istediğiniz dersi giriniz: ");
            System.out.println("Üst menüye gitmek istiyorsanız ----> 10 giriniz. ");
            kullanıcıTercihi = sc.nextInt() - 1;
            setKullanıcıTercihi(kullanıcıTercihi);
            if (getKullanıcıTercihi() == 9) {
                ustMenu(ogr1);
                break;
            } else {
                kullanılanKrediSayısı += derslerinKredileri.get(getKullanıcıTercihi());
                kalanKrediSayısı = maxKrediSayısı - kullanılanKrediSayısı;
                alınanDersler.add(dersler.get(getKullanıcıTercihi()));
                alinanDerslerinKredileri.add(derslerinKredileri.get(getKullanıcıTercihi()));
                dersler.remove(dersler.get(getKullanıcıTercihi()));
                dersMinKrediSayısı = Collections.min(derslerinKredileri);
                alınanDersler(ogr1);
                break;

            }


        }


    }

    public void ustMenu(Student ogr1) {
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        if (getKalanKrediSayısı() >= getDersMinKrediSayısı()) {
            System.out.println("Ders eklemek için--> 7 ");
        }

        if (alinanDerslerinKredileri.size() != 0) {
            System.out.println("Ders bırakmak için--> 8");
            System.out.println("Ders seçme işlemini bitirmek için--> 9 \n giriniz. ");

        } else System.out.println("Ders seçme işlemini bitirmek için--> 9 \n giriniz. ");

        kullanıcıTercihi = sc.nextInt() - 1;
        setKullanıcıTercihi(kullanıcıTercihi);

    if (getKullanıcıTercihi()==6){
        dersEkle(ogr1);
    } else if (getKullanıcıTercihi()==8) {
        dersSeciminiBitir(ogr1);
        
    }

    }




    public void alınanDersler(Student ogr1){
    System.out.println("Aldığınız dersler               Ders Kredisi");
    System.out.println("============================================");
    for (int i = 0; i < alınanDersler.size(); i++) {
        System.out.printf((i + 1) + ")" + "%-15.10s%17.2s\n", alınanDersler.get(i), alinanDerslerinKredileri.get(i));
    }
    System.out.println("=============================================");
    System.out.println("Aldığınız Toplam Kredi:          " + alinanDerslerinKredileri + "\nAlabileceğiniz Maksimum kredi:   " + kalanKrediSayısı + "\n");
    ustMenu(ogr1);

}

    public void dersBirak(Student ogr1) {
        while (alınanDersler.size() != 0 && !(kullanıcıTercihi == 7 || kullanıcıTercihi == 9 || kullanıcıTercihi == 10)) {
            System.out.println("Bırakabileceğiniz dersler ve ders kredileri: ");
            System.out.println("================================================================");
            for (int i = 0; i < alınanDersler.size(); i++) {
                System.out.println((i + 1) + ") " + alınanDersler.get(i) + " dersi " + alinanDerslerinKredileri.get(i) + " kredi. " + alınanDersler.get(i) + " dersini Bırakmak  için--> " + (i) + " giriniz.");
            }
            if (kalanKrediSayısı >= getDersMinKrediSayısı()) System.out.println("Ders eklemek için-->7");
            System.out.println("Ders Seçme İşlemini Bitirmek için-->9\nGiriniz:");

            kullanıcıTercihi = sc.nextInt()-1;
            setKullanıcıTercihi(kullanıcıTercihi);
            if (kullanıcıTercihi < 0 || (kullanıcıTercihi >= alınanDersler.size() && kullanıcıTercihi != 7 && kullanıcıTercihi != 9)) {
                System.out.println("Hatalı giriş yaptınız.Lütfen İstenilen şarta uygun sayı giriniz.");
                dersBirak(ogr1);
            }
            switch (getKullanıcıTercihi()) {
                case 7:
                    dersEkle(ogr1);
                    break;
                case 9:
                    dersSeciminiBitir(ogr1);
                    break;

                default:
                    kullanılanKrediSayısı -= alinanDerslerinKredileri.get(kullanıcıTercihi);
                    kalanKrediSayısı = maxKrediSayısı - kullanılanKrediSayısı;
                    dersler.add(alınanDersler.get(kullanıcıTercihi));
                    derslerinKredileri.add(alinanDerslerinKredileri.get(kullanıcıTercihi));
                    alınanDersler.remove(alınanDersler.get(kullanıcıTercihi));
                    alinanDerslerinKredileri.remove(alinanDerslerinKredileri.get(kullanıcıTercihi));
                    setDersMinKrediSayısı(Collections.min(derslerinKredileri));
                    alınanDersler(ogr1);
            }
        }
    }




    private void dersSeciminiBitir(Student ogr1) {
    }












}
