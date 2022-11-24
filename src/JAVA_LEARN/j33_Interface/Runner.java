package JAVA_LEARN.j33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin dgnshn = new Sahin();
dgnshn.ebat();
dgnshn.jant();
dgnshn.klima();
dgnshn.kapi();
dgnshn.koltuk();
dgnshn.motor();
dgnshn.yakit();
        System.out.println("dgnshn.sisLamp() = " + dgnshn.sisLamp());
        dgnshn.sunroof();
dgnshn.kaporta();
        System.out.println("DisDonanim.RENK = " + DisDonanim.RENK);
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK);
        System.out.println("IcDonanim.KUMAS = " + IcDonanim.KUMAS);
        System.out.println("IcDonanim.MUZIK = " + IcDonanim.MUZIK);
        System.out.println("Lastik.RENK = " + Lastik.RENK);

        DisDonanim.anten();//static concrete method olduğu için bu şekilde call ettik


    }
}
