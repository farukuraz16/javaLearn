package JAVA_LEARN.j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};
        List<String > ortakIsim=new ArrayList<>();//ortak ısımlerin atanacagı boş list
        for (String str1: arr1){
            for (String str2: arr2) {
                if (str1.equalsIgnoreCase(str2)){
                    System.out.print(str1+", "); }}  }
        System.out.println("*****-----*****");
        for (String str1 : arr1){
            for (String str2:arr2) {
                if (str1.equalsIgnoreCase(str2)) ortakIsim.add(str1);
                 }}
        System.out.println("ortakIsim = " + ortakIsim);

    }
}
