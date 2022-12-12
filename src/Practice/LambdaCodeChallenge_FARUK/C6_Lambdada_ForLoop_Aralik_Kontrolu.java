package Practice.LambdaCodeChallenge_FARUK;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {
        //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yazdiralim

        IntStream.iterate(21,t->t+7).filter(Methods_F::tekMi).limit(10).forEach(Methods_F::yazInteger);


        System.out.println();

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)
        IntStream.iterate(1,t->t+1).limit(29).forEach(x-> System.out.print(x+" "));
        System.out.println();

        //S2:  1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)
        IntStream.iterate(1,t->t+1).limit(30).forEach(x-> System.out.print(x+" "));

    //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim **rangeClosed(a,b)
        System.out.println();
        System.out.println("aradakileriTopla(10,20) = " + aradakileriTopla(10, 20));

        //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim **average()
        System.out.println();
        System.out.println("ortalama(30,40) = " + ortalama(30, 40));

        //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?  **rangeClosed(a,b)   filter()  count()- long
        System.out.println();
        System.out.println("sekizeBol(325,468) = " + sekizeBol(325, 468));

        //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim **rangeClosed(a,b)   filter()  forEach()
        System.out.println();
        System.out.println("sekizeBolunanSayilar(325,468) = ");
                sekizeBolunenSayiler(325, 468);




    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim  **rangeClosed(a,b)   filter() sum()
        System.out.println();
        System.out.println("sekizeBolunenSayilerTop(325, 468) = " + sekizeBolunenSayilerTop(325, 468));

        // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim **rangeClosed(a,b)   Methods::tekMi   reduce(1, carpim)
        System.out.println("Sayılarçarpımı(7, 15) = " + Sayılarçarpımı(7, 15));


    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim  *** IntSteram    limit(10)  filter ()  forEach()
pozitifTekSayilar();
        System.out.println();
    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yazdiralim
yedininKatlarıTek();
    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
        System.out.println();

        yedininKatları20();

}

    private static void yedininKatları20() {
        System.out.print(IntStream.iterate(21, t -> t + 7).limit(20).sum()+" ");
    }

    private static void yedininKatlarıTek() {
        IntStream.iterate(21,t->t+7).filter(Methods_F::tekMi).limit(10).forEach(Methods_F::yazInteger);
    }

    private static void pozitifTekSayilar() {
        IntStream.iterate(1,t->t+2).limit(10).forEach(Methods_F::yazInteger);
    }

    private static int Sayılarçarpımı(int i, int i1) {
        return IntStream.rangeClosed(i,i1).filter(Methods_F::tekMi).reduce(1,(x,y)->x*y);
    }

    private static int sekizeBolunenSayilerTop(int i, int i1) {
    return  IntStream.rangeClosed(i,i1).filter(x->x%8==0).reduce(0,(x,y)->x+y);
    }

    private static void sekizeBolunenSayiler(int i, int i1) {
     IntStream.rangeClosed(i,i1).filter(x->x%8==0).forEach(x-> System.out.print(x+" "));

    }

    private static long sekizeBol(int i, int i1) {
    return IntStream.rangeClosed(i,i1).filter(x->x%8==0).count();
    }

    private static OptionalDouble ortalama(int i, int i1) {

    return IntStream.rangeClosed(i,i1).average();
    }

    private static int aradakileriTopla(int i, int i1) {

        return IntStream.rangeClosed(i,i1).sum();
    }
}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz