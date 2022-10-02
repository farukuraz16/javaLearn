package j04_AritmeticOperator;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("   **** Increment-> Artırma ****    ");

        int a=7;

        System.out.println(++a); //8 ->> a=8
        System.out.println(a++); //8 yazar (üst satırda a 8 olmuştu) sonra değeri 1 arttırır... a=9
        System.out.println(a); //9
        System.out.println(a++ + ++a); //20 ->> önce 9 yazdırır... sonra 1 arttırır 10 olur. sonra 10u 1 arttırır ve 11 olur.
        // 9+11=20 olur

        int dat=10;
        System.out.println(dat++ + ++dat);


    }

}
