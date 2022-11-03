package JAVA_LEARN.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        /* TASK :
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isim = new ArrayList<>(List.of("Ali","Veli","Ayse","Fatma","Omer"));

        for (int i = 0; i < isim.size(); i++) {
            if (isim.get(i).toLowerCase().contains("a")){
                isim.remove(isim.get(i));
                i--;
            }
        }
        System.out.println("newisim = " + isim);


        ArrayList<String> newisim = new ArrayList<>();
        for (int i = 0; i < isim.size(); i++) {
            if (!isim.get(i).toLowerCase().contains("a")){
                newisim.add(isim.get(i));
                }

        }
        System.out.println("newisim = " + newisim);


    }

}
