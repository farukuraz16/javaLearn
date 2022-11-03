package JAVA_LEARN.j02_DataTypes_WrapperClass;

public class CO4_WrapperClass {

    public static void main(String[] args) {
        String name="Haluk";
        int yas=33;

        System.out.println( name.toUpperCase() );//HALUK
        System.out.println(name.toLowerCase());//haluk

        System.out.println(yas);

//atanan objelerin (name, yas gibi) sonuna nokta koyduğumzuda önerileri görürürüz. eğer primitive data ise methot önerisi sunmaz.
// non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
// ancak primitive data turlerinin boyle bir ozelligi yoktur
// primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
//Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
// olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
// ara çözüm imkanı sunmuştur.

        //TASK-> id ve string değerlerinin toplamını print eden code yazınız. wrapper class oluşturacağız...

        String tc = "1234455";
        String id="98765";

        int yenitc = Integer.valueOf(tc);
        //tc stringinin değerini int e çevirir.. sonra yenitc'ye çevirir.
        // önce Integer yazıp nokta koyuyoruz. sonra method seçiyoruz. valueOf methotu seçiyoruz.
        //böylelikle int olmuş oluyor. bu int değeri atamamız lazım. önüne int yenitc yazarak atamayı gerçekleştiriyoruz.

        int yeniid= Integer.valueOf(id);
        //id stringinin değerini int e çevirir

        System.out.println(tc+id);// 123445598765.. yanyana yapıştırdı. toplama işlemi yapmadı.
        //toplama işlemi yapması için int değeri atanan dataları kullanmalıyız.
        System.out.println(yeniid+yenitc);//1333220

        System.out.println("yeniid = " + yeniid);//yeniid = 98765

     /*   String okulNo="23454a";
        int yeniokulNo= Integer.valueOf(okulNo);//run time exception hatası.. çünkü son rakam a harfi
        System.out.println("yeniokulNo = " + yeniokulNo);
        System.out.println("madem geldin dünyaya otur çalış javaya");*/

        //TASK-> byte short int max ve min değerlerini print eden kod yazınız..
        byte mxbytedeg = Byte.MAX_VALUE;
        byte mnbytedeg = Byte.MIN_VALUE;
        System.out.println(mnbytedeg);
        System.out.println(mxbytedeg);

        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;

        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

//istersem değeri direkt yazdırabilirim. herhangi bir dataya atamama gerek kalmaz.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);


//istersem değeri direkt yazdırabilirim. herhangi bir dataya atamama gerek kalmaz.
        int a=5;
        System.out.println(a);// 5
        System.out.println(5);// 5



    }
}
