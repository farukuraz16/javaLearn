package JAVA_LEARN.j38_Debugger;

public class C01_Debugger {
    /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir...

İki durumda debugger gerekli olabilir:
*  Mevcut kod devralındığında.
*  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
*/
    static int ebikGabık=7;

    public static void main(String[] args) {
method01();










    }

    private static void method01() {
        System.out.println(" *** metot 1 çalışıyor... *** ");
int a=0;//local variable tanımlandı..
        ebikGabık++;
        for (int i = 0; i < 11; i++) {
            System.out.print(i+" ");
            a+=2*i;
        }
        System.out.println();

        System.out.println(" *** metot 2 call ediliyor... *** ");
        method02();

        System.out.println(" *** metot 3 call ediliyor... *** ");
        method03();

        System.out.println(" *** metot 1 bitti... *** ");
    }

    private static void method03() {
        System.out.println(" *** metot 3 çalışıyor... *** ");
ebikGabık-=3;
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(" *** metot 3 bitti... *** ");
    }


    private static void method02() {
        System.out.println(" *** metot 2 çalışıyor... *** ");
ebikGabık+=5;
        for (int i = 0; i < 7; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(" *** metot 2 bitti... *** ");
    }
}
