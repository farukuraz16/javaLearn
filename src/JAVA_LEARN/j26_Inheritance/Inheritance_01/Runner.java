package JAVA_LEARN.j26_Inheritance.Inheritance_01;

public class Runner {
    public static void main(String[] args) {


        Hayvacık hyvn = new Hayvacık();
        hyvn.hareket();
        hyvn.icme();
        hyvn.yeme();
        System.out.println("***");

        Mammal m1 = new Mammal();
        m1.dogum();//child mammal class call
        m1.sutBeslenir();//child mammal class call
        m1.icme();//parent haycancık class call
        m1.yeme();//parent haycancık class call
        m1.hareket();//parent haycancık class call
        System.out.println("***");

        Balık hamsi = new Balık();
        hamsi.ızgaraTava();
        hamsi.hareket();
        hamsi.icme();
        hamsi.yeme();
        System.out.println("***");

        Kedi kd = new Kedi();
        kd.cırmalar();
        kd.hareket();
        kd.icme();
        kd.dogum();
        kd.yeme();
        kd.sutBeslenir();
        System.out.println("***");

        Koyun kyn = new Koyun();
        kyn.semir();  kyn.hareket(); kyn.icme();kyn.yeme();kyn.dogum();kyn.sutBeslenir();


    }
}
