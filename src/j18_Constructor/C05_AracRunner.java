package j18_Constructor;

public class C05_AracRunner {
    public static void main(String[] args) {
        C05_Arac arc1=new C05_Arac(210);
        System.out.println("arc1.maxHız = " + arc1.maxHız);//210
        System.out.println("arc1.model = " + arc1.model);// hacıMurat


        C05_Arac arc2 = new C05_Arac(220,"BMW");
        System.out.println("arc2 = " + arc2);
        System.out.println("arc1 = " + arc1);

    }
}
