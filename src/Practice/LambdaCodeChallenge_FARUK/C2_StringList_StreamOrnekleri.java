package Practice.LambdaCodeChallenge_FARUK;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");


        // S1: ilk harfi d ve ya c olanlari listeleyelim *** filter-startsWith()
list.stream().filter(x->x.toLowerCase().startsWith("d") || x.toLowerCase().startsWith("c")).forEach(x-> System.out.print(x+" "));

        System.out.println();
        //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim *** map(t-> "*" + t + "*")

list.stream().forEach(x-> System.out.print("*"+x+"*"+" "));
        System.out.println();

        //S3: alfabetik  olarak siralayalim list olarak ***sorted()

list.stream().map(x->x.toLowerCase()).sorted().forEach(x-> System.out.print(x+" "));
        System.out.println();

        //S4: tum 'l' leri silelim yazdiralim ***map(replaceAll)
list.stream().map(x->x.replaceAll("l","")).forEach(x-> System.out.print(x+" "));
        System.out.println();

        //S5 : icinde e olanlardan yeni bir list olusturunuz  *** filter(contains())  collect()

        System.out.println(list.stream().filter(x -> x.contains("e")).collect(Collectors.toList()));

        System.out.println();


        // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
list.stream().forEach(x-> System.out.print(x.substring(0,1)+x.substring(0,1)+x+" "));

        System.out.println();

        //     ***map(t-< t.substring(0,1) + t-< t.substring(0,1) + t) forEach()

        // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
        //   ***map(t-< t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase() forEach

        list.stream().map(x->x.substring(0,1).toUpperCase()+ x.substring(1).toLowerCase()).forEach(x-> System.out.print(x+" "));

        System.out.println();


        // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
        // ***filter(x-> x.length () !=4 && x.length () !=6)  collect

        System.out.println(list.stream().filter(x -> x.length() != 4 && x.length() != 6).collect(Collectors.toList()));


    }}
