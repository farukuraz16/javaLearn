package JAVA_LEARN.j32_Abstract.Ornek3.HalukHoca;

import JAVA_LEARN.j32_Abstract.Ornek3.HalukHoca.Food;

public abstract class Salad extends Food {
    @Override
    public void taste() {
        System.out.println("sirkeli, limonlu, sumaklı...");
    }
}
