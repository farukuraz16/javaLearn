package JAVA_LEARN.j32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {//parametresiz parent constructor
        this.name = name;
    }

    public Sekil(String name) {//parametreli parent constructor
        setName(name);
    }

    public abstract double alanHesapla();

    public abstract double cevreHesapla();

    //public void ciz (){
    //    System.out.println(this.name + " şekliniz çizildi.");
    //}
    public String ciz() {//bu methodu da toString ile çağırmak istediğimiz için return type'ı String olan bir methoda dönüştürdük.
        return this.name + " şekliniz çizildi.";
    }

    @Override
    public String toString() {
        return "Şekil ismi= " + this.name +
                "\n Şekil alanı= " + this.alanHesapla() +
                "\n Şekil çevre= " + this.cevreHesapla()+
                "\n"+this.ciz();
    }
}
