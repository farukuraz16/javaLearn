package JAVA_LEARN.j32_Abstract.Ornek3.HalukHoca;

public abstract class Food {
    private String name;

    public abstract void madeIn();

    public abstract void taste();

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
