package JAVA_LEARN.j32_Abstract.abstract_01;

public class Civic extends Lastik{//lastik ebatı için Hondaya değil lastik'e extends yaptık.
    // yani en üstte HONDA-->LASTİK-->CIVIC...

    //public class Civic extends Honda{ ---

    /*
 extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
 java CTE verdi
 çözüm:
 a) Unımplemented (uyarlanmamış) method implement edilmeli
 b)parent Hond class'dan abstarct keyword kaldırılmalı
 c)concrete olan child Civic class abstract tanımlanmalı
  */

    // concerete class'da abstract method tanımlanır mı?

    // public  abstract void absMethod();// ya class abs olmalı yada method concrete body olmalı..

    // TRİCK -> child concrete class parent abstract class'ın abstract methodlarını mutlaka implement override etmeli

    //Civic cv = new Civic();


    @Override
    public void motor() {
        System.out.println("1.6 eco motor");

    }

    @Override
    void koltuk() {
        System.out.println("ucuz olsun diye kumaş koltuk.");
    }

    @Override
    void kapı() {
        System.out.println("4 kapılı");

    }
    public int vites (){//concreate child class method
        return 5;
    }

    @Override
    public void lastikEbat() {
        System.out.println("kış lastiği");

    }

    // Honda obj = new Civic();//honda oğlu civic
    // Civic obj1 = new Civic();//civic oğlu civic

}
