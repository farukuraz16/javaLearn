package j14_Scope;

public class C03_Scope {
    public static void main(String[] args) {
        C01_InstanceVariable kus= new C01_InstanceVariable();//istediğim Class'dan kus obj cretae edildi
        kus.name="HÜMA";
        kus.developerMı=false;

        System.out.println("kus.name = " + kus.name);//hüma
        C01_InstanceVariable.staticMethod();//class name ile static method call
        kus.non_staticMethod();//obj ile non-satatic method call

        System.out.println();

        C01_InstanceVariable araba = new C01_InstanceVariable();//
        araba.name ="ople";
        araba.yas=2018;
        System.out.println("araba.name = " + araba.name);
        C01_InstanceVariable.staticMethod();
        araba.non_staticMethod();
    }
}
