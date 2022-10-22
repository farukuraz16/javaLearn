package j18_Constructor;

public class C06_Ogrc {//Ogrc obj için kalıphane
    //Fields
    String isim = "Merwe Hanım";
    int yas;
    String name;
    int age;

    public C06_Ogrc(String isim, int yas) {//2 p'li
       // this.isim = isim;
       // this.yas = yas;
        isim = isim;
        yas = yas;
        //name=isim;
        //age=yas;
        System.out.println("const'daki isim : " + isim);
        System.out.println("const'daki isim : " + this.isim);
        System.out.println("const'daki name : " + name);
        System.out.println("const'daki yas : " + yas);
    }

}
