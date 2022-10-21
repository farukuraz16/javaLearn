package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static List<String> gunler = new ArrayList<>(List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
static List<Double> gunlukKazanclar = new ArrayList<>();
static Scanner dat = new Scanner(System.in);

    public static void main(String[] args) {
        int gun=0;
        while(gun<7){
        System.out.println(gunler.get(gun)+" günkü ciro?= ");
        double ciro= dat.nextInt();
        gunlukKazanclar.add(ciro);
        gun++;
        }

        System.out.print("OrtalamaKazanc = " + getOrtalamaKazanc(gunlukKazanclar));
        System.out.println(" ");
        getOrtalamaninUstundeKazancGünleri(getOrtalamaKazanc(gunlukKazanclar));
        System.out.println(" ");
        getOrtalamaninAltindaKazancGünleri(getOrtalamaKazanc(gunlukKazanclar));

    }

    private static void getOrtalamaninAltindaKazancGünleri(double ortalamaKazanc) {
        System.out.println("ortalamanın altıdaki günler:");
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i)<ortalamaKazanc){
                System.out.println(gunler.get(i)+" = "+gunlukKazanclar.get(i));
            }
        }
    }

    private static void getOrtalamaninUstundeKazancGünleri(double ortalamaKazanc) {
        System.out.println("ortalamanın üstündeki günler:");
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i)>ortalamaKazanc){
                System.out.println(gunler.get(i)+" = "+gunlukKazanclar.get(i));
            }             }


    }

    private static double getOrtalamaKazanc(List<Double> gunlukKazanclar) {
        int toplam = 0;
        for (double a: gunlukKazanclar) {

            toplam+=a;

        }return toplam/=7;
    }
}
