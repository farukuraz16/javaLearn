package JAVA_LEARN.j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //  task -> verilen fiyat için %11 %22 ve %33  indirimli  fiyatı print eden methodlar  create ediniz.

        double fiyat =100;//primitive double type variable

        System.out.println("metot call öncesi fiyat = " + fiyat);

        System.out.println("indirim11(fiyat) = " + indirim11(fiyat));

        System.out.println("indirim22(fiyat) = " + indirim22(fiyat));

        System.out.println("indirim33(fiyat) = " + indirim33(fiyat));

        System.out.println("method call sonrası fiyat  değeri = " + fiyat);//100

    }

    private static double indirim33(double fiyat) {
        fiyat*=0.67;
        System.out.println(fiyat);
        fiyat+=200;
        System.out.println("fiyat = " + fiyat);
        return fiyat;

    }

    private static double indirim22(double fiyat) {
        return fiyat*=0.78;
    }

    private static double indirim11(double fiyat) {
        return fiyat*=0.89;

    }
}
