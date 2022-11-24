package JAVA_LEARN.j32_Abstract.Ornek3;

import JAVA_LEARN.j32_Abstract.Ornek2.Sekil;

public class Runner {
    public static void main(String[] args) {
        Baklava b = new Baklava();
        b.madeIn();
        b.taste();
        System.out.println("b = " + b);

        SezarSalad ss = new SezarSalad();
        ss.madeIn();
        ss.taste();

    }
}
