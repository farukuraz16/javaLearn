package JAVA_LEARN.j18_Constructor;

public class C06_OgrcRunner {
    public static void main(String[] args) {
    C06_Ogrc tlb = new C06_Ogrc("saliha h",21);

        System.out.println("tlb.isim = " + tlb.isim);
        System.out.println("tlb.yas = " + tlb.yas);//neden 21 gelmedi???
        System.out.println("tlb.age = " + tlb.age);
        System.out.println("tlb.name = " + tlb.name);


    }
}