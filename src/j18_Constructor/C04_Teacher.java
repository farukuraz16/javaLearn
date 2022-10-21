package j18_Constructor;

public class C04_Teacher {
    String ad;
    String soyad;
    String branş;
    int tecrube;
    double maaş;
    int id;
    boolean emekli;

    public  void  dersSaati(){
        System.out.println("haftada 20 saatten sonrası ek derse girer");

    }
//king of trick---> parametreli constructor default constructorı ezer
    public C04_Teacher() {
    }

    public C04_Teacher(String ad, String soyad, String branş, int tecrube, double maaş, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
        this.tecrube = tecrube;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return  "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", tecrube=" + tecrube +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli;
    }
}
