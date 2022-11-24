package JAVA_LEARN.j33_Interface;

public class Sahin extends Tofas implements IcDonanim, DisDonanim, Lastik {//concrete child class extends --> Tofas...
    //implements -->> IcDonanim, DisDonanim, Lastik,
    @Override
    public void kapi() {
        System.out.println("5 kapılı, sürgülü");
    }

    @Override
    public void kaporta() {
        System.out.println("akordion sağlam kaporta");
    }

    @Override
    public void koltuk() {
        System.out.println("7 kişilik deri koltuk");
    }

    @Override
    public void klima() {
        System.out.println("otomatik klima");
    }

    @Override
    public void ebat() {
        System.out.println("16inc lastik ebatı");
                    }

    @Override
    public void jant() {
        System.out.println("çelik jant");
    }

    @Override
    public void motor() {
        System.out.println("1.6 benzinli motor");
    }

    @Override
    public void yakit() {
        System.out.println("kurşunsuz benzin");
    }

}
