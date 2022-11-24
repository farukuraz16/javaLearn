package JAVA_LEARN.j32_Abstract.abstract_01;

public class Crv extends Honda{
    @Override
    public void motor() {
        System.out.println("4x4 2.4 motor.. arazilere açıl..");

    }

    @Override
    void koltuk() {
        System.out.println("7 kişi 7 koltuk");
    }

    @Override
    void kapı() {
        System.out.println("5 kapı..");
    }
}
