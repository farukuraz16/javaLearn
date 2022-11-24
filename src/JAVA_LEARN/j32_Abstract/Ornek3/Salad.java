package JAVA_LEARN.j32_Abstract.Ornek3;

public abstract class Salad extends Food {

    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("hangi salata? çoban mı gavur dağı mı");
    }
}
