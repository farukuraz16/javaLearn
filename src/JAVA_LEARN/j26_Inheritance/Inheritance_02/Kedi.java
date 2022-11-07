package JAVA_LEARN.j26_Inheritance.Inheritance_02;

public class Kedi extends Mammal {//Mammal parent class child -- torun

    /*
        Chil class obj olmadan parent class variable ve method'lara ulaşabilir
         */


    public Kedi() {
        super();
        System.out.println("kedi p.siz constructor");
    }

    public Kedi(String str) {
        this();
        System.out.println(super.c);
        System.out.println("kedi p.siz constructor");
    }

    int c = 2;
    int d = 5;

    @Override
    public void mC() {//Mammal parentten ezen method
        super.mC();
        System.out.println("mC-->> kedi class method call");
    }
}