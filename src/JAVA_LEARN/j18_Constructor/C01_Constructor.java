package JAVA_LEARN.j18_Constructor;

public class C01_Constructor {
    /*
   1- consturctor ismi Class name ile aynı olmalı.Buyuk harf ile başlamalı
   2- constructor creta eedildiğinde name den sonra () {} mutlaka kullanılmalı
   3- eger parametreli cons. create edildiğinde java default constructoru ezer(siler)
   4- cons. return type olmaz method'dan ayıran özelliğidir.
   5-Class oluştugunsa java default cons. kendi create eder.
    */

    String str;// inst variable-> obj variable
    String selam="Güzel insanlar";

    public static void main(String[] args) {
//clas name      obje name    new keyword   default cons.
        C01_Constructor obj1 = new C01_Constructor();
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();

        obj1.str="javacan";//str ins. variable obj1 ile call edilerek obj1  javacan değeri atandı
        obj2.str = "javatar";//str ins. variable obj2 ile call edilerek obj2 javatar değeri atandı

        System.out.println("obj3.selam = " + obj3.selam);
        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj4.str = " + obj4.str);

        obj3.aga();//
        obj2.aga();



    }//main sou
    public void aga(){
        System.out.println("agama selamke");
    }
}
