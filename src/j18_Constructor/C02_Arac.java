package j18_Constructor;

public class C02_Arac {
    //fields
    String marka;
    String model;
    int km;
    double motorHacim;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;

    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac();
        arac1.ikinciEl=true;
        arac1.marka="Volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHacim=2.4;
        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.km + " " + arac1.yıl + " " + arac1.ikinciEl + " " + arac1.motorHacim);

//Task -> 2... bir aracın tüm fieldlarını atayarak print ediniz..

        C02_Arac arac2= new C02_Arac();
        arac2.marka="BMW";
        arac2.model="M5";
        arac2.yıl=2010;
        arac2.km=50000;
        arac2.motorHacim=1000;
        arac2.vitesAuto=true;
        arac2.ikinciEl=true;

        System.out.println(arac2.marka+""+arac2.model+" "+arac2.yıl+" "+arac2.km
        +" "+arac2.motorHacim+" "+arac2.vitesAuto+" "+
        arac2.ikinciEl
        );

        System.out.println("arac2 = " + arac2);



    }

    @Override
    public String toString() {
        return  "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl
               ;
    }
}
