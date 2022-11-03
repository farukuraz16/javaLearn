package JAVA_LEARN.j11_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        String name = "Haluk";

        C04_MethodDepo.gecmeNotu(24);//depo class tan class name ile method çağırdık.

        C04_MethodDepo.topla(3,4);
/*
    farklı class'dan method call etmek için..
    1. method static_> gökteki güneş gibi
    2.ClassName.methodName() şeklinde call edilir
     aynı class'daki method doğrudan methodName ile call edilir...
      */

        selamVer();//aynı class'dan methodName ile call edildi->kendi köyümün amelesi
    }
public static void selamVer(){
    System.out.println("agam selam ver");
}
}
