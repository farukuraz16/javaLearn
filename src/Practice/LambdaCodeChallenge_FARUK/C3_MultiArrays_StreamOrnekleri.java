package Practice.LambdaCodeChallenge_FARUK;
//multi arrayleri cevirirken flatMap kullaniriz yapilis sekli iki turludur
//1) lambda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc", "Erik"}
        };
        // S1 : tum elemanlari list yapalim
        System.out.println("listele (arr) = " + listele(arr));

        // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
doubleYaz (arr);

        // S3: E ile baslayan elemanlari liste olarak yazdiralim
        System.out.println();
     eİleBasla(arr);
        System.out.println();
        //S4 : k ile bitenlerin sonuna '*' ekleyelim   ***endsWith("k")
kBitenYıldız(arr);

    }

    private static void kBitenYıldız(String[][] arr) {
        System.out.println(" k ile bitenler:");
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.endsWith("k")).map(t->t+"*").forEach(t-> System.out.print (t+ " "));
    }

    private static void eİleBasla(String[][] arr) {
        System.out.println("E ile başlayablar: ");
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.startsWith("E")).forEach(t-> System.out.print (t+ " "));

    }

    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
    private static void doubleYaz(String[][] arr) {
       Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.substring(0,1).toLowerCase().equals("e")).forEach(t-> System.out.print (t+t+ " "));
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.startsWith("E")).map(t->t+t).forEach(t-> System.out.print (t+ " "));
        listele(arr).stream().filter(t->t.startsWith("E")).map(t->t+t).forEach(t-> System.out.print (t+ " "));
    }

    // S1 : tum elemanlari list yapalim
    private static List<String> listele(String[][] arr) {

       return Arrays.stream(arr).flatMap(t->Arrays.stream(t)).collect(Collectors.toList());
        //hepsi bir streamde, bu method ile yeni bir stream ile tek düzleme alıyoruz.

    }
}






