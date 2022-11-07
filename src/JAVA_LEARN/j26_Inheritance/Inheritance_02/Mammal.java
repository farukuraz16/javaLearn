package JAVA_LEARN.j26_Inheritance.Inheritance_02;


public class Mammal extends Hayvacık {//Hayvansık parentin childıdır..

    public Mammal() {

        this('y');
        System.out.println("Mammal parametresiz constructor");
    }

    public Mammal(char c) {
        super(17);

        System.out.println("Mammal parametreli constructor");
    }

    public void mC() {
        System.out.println("mC ->> mammal class method call");
    }

    int m = 1;
    int c = 4;

    @Override
    public void mM() {
        System.out.println("mM ->> Hayvancık class method call.. override methjod");
    }
}

