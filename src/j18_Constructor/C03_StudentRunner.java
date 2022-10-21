package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student ogrc1= new C03_Student();
        ogrc1.ad="fatih";
        ogrc1.soyad="ataş";
        ogrc1.sınıf=1;
        ogrc1.okulNo=1001;
        ogrc1.ortalama=77;
        ogrc1.takdir=false;
        System.out.println("ogrc1 = " + ogrc1);//referans değerlerini verir
        ogrc1.mezuniyet();


        C03_Student ogrc2= new C03_Student();
        ogrc2.ad="ali";
        ogrc2.soyad="veli";
        ogrc2.sınıf=2;
        ogrc2.okulNo=1002;
        ogrc2.ortalama=45;
        ogrc2.takdir=false;

        System.out.println("ogrc2 = " + ogrc2);//referans değerlerini verir
        ogrc2.mezuniyet();
        ogrc2.sosyalFaaliyet();
    }
}
