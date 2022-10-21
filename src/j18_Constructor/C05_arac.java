package j18_Constructor;


public class C05_arac {
    int maxhiz;
    String model;

    public C05_arac(int maxhiz) {//1pli constructor
        this.maxhiz = maxhiz;
    }

    public C05_arac() {//psiz, sefil constructor
    }

    public C05_arac(int maxhiz, String model) {
        this.maxhiz = maxhiz;
        this.model = model;
        System.out.println("bu yazıyı okuyorsan 2p'li constructor üretilmiştir.");
    }
    public C05_arac(String model, int maxhiz) {//plerin sırası farklı
        this.maxhiz = maxhiz;
        this.model = model;

    }
}
