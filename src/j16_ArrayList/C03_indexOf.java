package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf();-> list içinde istenen elemanın index değerin return eder

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "ingiltere", "isvec"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));


        System.out.println(listSehir.indexOf("Münih"));//0
        System.out.println(listSehir.indexOf("Alamanya"));//-1.. çünkü bu değer yok..
        System.out.println(listUlke.indexOf("isvec"));//3
        listUlke.add("Amerigonya");
        System.out.println("listUlke = " + listUlke);//[Alamanya, Amerigonya, ingiltere, isvec, Amerigonya]
        System.out.println(listUlke.indexOf("Amerigonya"));//1-> tekrarlı elemanlarda soldan(baştan) ilk bulunan eleman index'i return eder
        System.out.println(listUlke.lastIndexOf("Amerigonya"));//4->sağdan(sondan) ilk bulunan elemanın index'i return eder


    }
}
