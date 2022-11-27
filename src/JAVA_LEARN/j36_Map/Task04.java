package JAVA_LEARN.j36_Map;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */

    public static void main(String[] args) {

        HashMap<String, Integer> countWords = new HashMap<>();
        //Scanner dat = new Scanner(System.in);
        //System.out.println("enter your words= ");
        //String userEnter = dat.nextLine();
        String userEnter = "Ali gel. Ali okula koş. Koş Ali koş.";
        ArrayList<String> sentences = new ArrayList<>(Arrays.asList(userEnter.split("\\.")));
        System.out.println(sentences);
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < sentences.size(); i++) {
            arr = new ArrayList<>(Arrays.asList(sentences.get(i).split(" ")));
            for (int j = 0; j < arr.size(); j++) {



            }


        }

        // System.out.println(sentences);


    }

}
