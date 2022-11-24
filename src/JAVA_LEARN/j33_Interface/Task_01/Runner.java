package JAVA_LEARN.j33_Interface.Task_01;

public class Runner {
    public static void main(String[] args) {
        Cember c1 = new Cember();
        System.out.println("c1.alan(5) = " + c1.alan(5));
        System.out.println("c1.cevre(5) = " + c1.cevre(5));

        Kare k1 = new Kare();
        System.out.println("k1.alan(9) = " + k1.alan(9));
        System.out.println("k1.cevre(9) = " + k1.cevre(9));

        Dikdörtgen d1 = new Dikdörtgen();
        System.out.println("d1.alan(12,10) = " + d1.alan(12, 10));
        System.out.println("d1.cevre(12,10) = " + d1.cevre(12, 10));


    }


}
