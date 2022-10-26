package j19_StaticVariable;

public class Task_01_Rectangle {
    /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
    double width;
    double length;

    public Task_01_Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        double cevre= (width+length)*2;
        double alan= width*length;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
