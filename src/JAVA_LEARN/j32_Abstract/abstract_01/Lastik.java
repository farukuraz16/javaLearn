package JAVA_LEARN.j32_Abstract.abstract_01;

public abstract class Lastik extends Honda{
//7- Parent child ilşkisi olan abstarct class'lar abs method'ları implement etmek zorunda değil

    public  abstract  void lastikEbat();//abs method

    public void kısLastik(){//concerete method
        System.out.println("agam pis cezası var ihmal etme :)");
    }

}
