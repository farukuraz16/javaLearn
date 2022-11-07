package JAVA_LEARN.j26_Inheritance.Inheritance_01;

public class Kedi extends Mammal {//Mammal parent class child -- torun

    /*
        Chil class obj olmadan parent class variable ve method'lara ulaşabilir
         */


    public Kedi() {
        System.out.println("kedi p.siz constructor");
    }

    public void cırmalar(){
        System.out.println("fena cırmalar");
    }
}
