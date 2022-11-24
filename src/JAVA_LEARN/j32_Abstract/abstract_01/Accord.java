package JAVA_LEARN.j32_Abstract.abstract_01;

public class Accord extends Honda{
    @Override
    public void motor() {//implement edilen abs method
        System.out.println("2.o turbo motor..");

    }

    @Override
    void koltuk() {//implement edilen abs method
        System.out.println("6 kişilik koltuk");
    }

    @Override
    void kapı() {//implement edilen abs method
        System.out.println("6 kapı");
    }

    @Override
    public void sunroof() {//override edilen method
        System.out.println("sunroofu aç. hava alsın...");
    }
}
