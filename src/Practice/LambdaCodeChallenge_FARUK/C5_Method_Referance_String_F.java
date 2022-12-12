package Practice.LambdaCodeChallenge_FARUK;

import Practice.lambdaCodeChallenge.Methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String_F {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");

        // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
tümHarflerBüyük(l);
        System.out.println();
        //S2: Stringleri uzunluklarina gore siralayip yaziniz
sıralaSize(l);
        System.out.println();

        //S3: E ILE Baslayanlari yazdiralim
baslaE(l);
    }

    private static void baslaE(List<String> l) {
        l.stream().filter(x->x.startsWith("E")).forEach(x-> System.out.print(x+" "));
    }

    private static void sıralaSize(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).forEach(x-> System.out.print(x+" "));
       // l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    private static void tümHarflerBüyük(List<String> l) {
        l.stream().map(x->x.toUpperCase()).forEach(x-> System.out.print(x+" "));
    }


}
