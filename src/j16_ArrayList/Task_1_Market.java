package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1_Market {
    public static void main(String[] args) {
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
        Scanner dat = new Scanner(System.in);
        List<String> gunler= new ArrayList<>(List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
        List<Integer> gunlukkazanc= new ArrayList<>();
        int gun = 0;
        int kazanc;
        while (gun < gunler.size() ){
            System.out.println(gunler.get(gun)+" günü, günlük kazancınız?= ");
            kazanc= dat.nextInt();
            gunlukkazanc.add(kazanc);
            gun++;
        }
        System.out.println("gunlukkazanc = " + gunlukkazanc);


        System.out.println("getOrtalamaKazanc() = " + getOrtalamaKazanc(gunlukkazanc));

        System.out.println("ortalamanın üstündeki günler= ");
        getOrtalamaninUstundeKazancGünleri(gunler,gunlukkazanc);

        System.out.println("ortalamanın altındaki günler= ");
        getOrtalamaninAltindaKazancGünleri(gunler,gunlukkazanc);



    }

    private static void getOrtalamaninAltindaKazancGünleri(List<String> gunler, List<Integer> gunlukkazanc) {
        for (int i = 0; i < 7; i++) {
            if (gunlukkazanc.get(i)<=getOrtalamaKazanc(gunlukkazanc)){
                System.out.println(gunler.get(i));
            }

        }
    }

    private static void getOrtalamaninUstundeKazancGünleri(List<String> gunler, List<Integer> gunlukkazanc) {
        for (int i = 0; i < 7; i++) {
            if (gunlukkazanc.get(i)>getOrtalamaKazanc(gunlukkazanc)){
                System.out.println(gunler.get(i));
            }

        }
    }

    private static double getOrtalamaKazanc(List<Integer> gunlukkazanc) {
        int toplam=0;
        for (int i = 0; i < 7; i++) {
            toplam+=gunlukkazanc.get(i);
        }

        return toplam/7;
    }





}

