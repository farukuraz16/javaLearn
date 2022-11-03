package JAVA_LEARN.j11_MethodCreation;

public class C04_MethodDepo {

    //main method olmayacak-->motor yok. çalışmaz. bu sadece römork
/*
    her class'da main method mecburiyeti yoktur. belilrli aksiyonlara özel class'lar tanımlanabilir..
     */

    public static void gecmeNotu(int not) {
        if (not >= 85) {
            System.out.println("çok başarılı");
        } else if (not >= 70) {
            System.out.println("başarılı");
        } else if (not >= 60) {
            System.out.println("geçtin");
        } else if (not >= 45) {
            System.out.println("ucuz yırttın");
        } else System.out.println("kaldın");
        }
    public static void topla(int a, int b){
        System.out.println(a+b);

    }

    }


