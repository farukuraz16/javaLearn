package JAVA_LEARN.j26_Inheritance.Inheritance_02;

public class Hayvacık {//g.parent superclass

    public Hayvacık() {
        System.out.println("Hayvancık parametresiz constructor");

    }

    public Hayvacık(int i) {
        System.out.println("Hayvancık parametreli constructor");

    }

    public void mA() {
        System.out.println("mA - > Hayvancık class method call");
    }

    public void mM() {
        System.out.println("mM - > Hayvancık class method call");
    }

    int a;
    int m = 3;

}
