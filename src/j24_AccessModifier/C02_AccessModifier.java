package j24_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {

       // C01_AccessModifier obj1 = new C01_AccessModifier();//private olduğu için call edilemez
        C01_AccessModifier obj2 = new C01_AccessModifier(23,45);//parametreli public olduğu için call edilebildi.
        C02_AccessModifier semra = new C02_AccessModifier();//parametresiz default constructor
        //C01_AccessModifier obj4 = new C01_AccessModifier();//parametresiz private constructor call edilemez
        System.out.println("obj2.defaultYas = " + obj2.defaultYas);
        System.out.println("obj2.publicYas = " + obj2.publicYas);
        obj2.protectedMetot();
        System.out.println("obj2.protectedYas = " + obj2.protectedYas);
        //obj2.privateMethod();//private methot call edilemez


    }//main
}
