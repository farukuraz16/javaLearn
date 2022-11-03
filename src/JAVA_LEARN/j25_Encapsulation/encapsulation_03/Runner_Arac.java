package JAVA_LEARN.j25_Encapsulation.encapsulation_03;

public class Runner_Arac {
    public static void main(String[] args) {

        Arac WW = new Arac("amarok","beyaz",2000,2015);
        Arac HONDA = new Arac("CRV","siyah",600,2019);

        Arac BMW = new Arac();
        BMW.setModel("M5");
        BMW.setRenk("mavi");
        BMW.setMotor(350);
        BMW.setYıl(2022);

        System.out.println("WW = " + WW);
        System.out.println("HONDA = " + HONDA);
        System.out.println("BMW = " + BMW);


    }
}
