package JAVA_LEARN.j18_Constructor;

public class C03_Student {//main olmayan sadece student obj create atmek için pojo--> plan old java object: obj için
//fields-->>
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;




    public void mezuniyet(){
        if (ortalama>=50){
            System.out.println("diploman hayırlı olsun");
        }else System.out.println("seneye yine bekleriz");

    }

    public void sosyalFaaliyet(){
        System.out.println("fiziksel zindelik iyidir");
    }
    @Override
   public String toString() {//obj referans değeri print etmemesi için obj datalarını  stringe ceviren method
        return            "\nad='" + ad + '\'' +
                "\nsoyad='" + soyad + '\'' +
                "\nsınıf=" + sınıf +
                "\nortalama=" + ortalama +
                "\nokulNo=" + okulNo +
                "\ntakdir=" + takdir
                ;

}

}

