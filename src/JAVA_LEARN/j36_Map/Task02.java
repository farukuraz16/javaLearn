package JAVA_LEARN.j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */

        HashMap<String,String> person1 = new HashMap<>();
        person1.put("isim", "Haluk Levent");
        person1.put("email", "haluklevent@gmail.com");
        person1.put("adres", "Üsküdar, İstanbul");
        person1.put("telefon", "05003003030");
        System.out.println("kartVizit = " + person1);

        HashMap<String,String> person2 = new HashMap<>();
        person2.put("isim", "Teoman");
        person2.put("email", "teoman@gmail.com");
        person2.put("adres", "Kadıköy, İstanbul");
        person2.put("telefon", "05004004040");
        System.out.println("kartVizit = " + person2);

        HashMap<String,HashMap<String,String>> kartVisitList = new HashMap<>();
        kartVisitList.put("Haluk Levent", person1);
        kartVisitList.put("Teoman", person2);
        System.out.println(kartVisitList);
        System.out.println("kartVisitList.get(\"Teoman\").get(\"adres\") = " + kartVisitList.get("Teoman").get("adres"));



    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
