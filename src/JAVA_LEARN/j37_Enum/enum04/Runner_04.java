package JAVA_LEARN.j37_Enum.enum04;

import JAVA_LEARN.j37_Enum.enum01.Aylar;

public class Runner_04 {
    public static void main(String[] args) {
        Aylar_04 ay = Aylar_04.EKIM;

        System.out.println("ay.ordinal() = " + ay.ordinal());
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.gunler = " + ay.gunler);
        ay.gunMiktarı();//enum method call edildi
    }
}
