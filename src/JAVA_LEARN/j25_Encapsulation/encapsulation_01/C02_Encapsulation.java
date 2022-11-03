package JAVA_LEARN.j25_Encapsulation.encapsulation_01;

public class C02_Encapsulation {//todo pojo class
    private String name = "Gamze Hanım";
    private int id = 1001;

    public C02_Encapsulation() {
    }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }


    //public String isimVer() {//getter method
    //    return name;
    //}

    //public int idVer() {//getter method
    //    return id;
    //}

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    //public void isimDegis(String isim) {//setter method
    //    this.name = isim;
    //}

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", id=" + id;
    }
}
