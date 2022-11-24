package JAVA_LEARN.j33_Interface.Task_01;

public class Cember implements Sekil{

    @Override
    public int alan(int... boyut) {

        return (int) (pi*boyut[0]*boyut[0]);
    }

    @Override
    public int cevre(int... boyut) {

        return (int) (2*pi*boyut[0]);
    }
}
