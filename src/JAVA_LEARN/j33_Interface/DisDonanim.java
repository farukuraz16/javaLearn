package JAVA_LEARN.j33_Interface;

public interface DisDonanim {

    public void kapi();//abs. method

    void kaporta();//abs. method

    String RENK = "opak kırmızı";//public static final variable.. başına "public static final" yazsak da olur yazmasak da..

    public default String sisLamp() {//default concrete method

        return "sisli havalar için...";
    }

    static void anten() {//static concrete method
        System.out.println("agam aten kunten işler");
    }

    //public static default void sorunMethod(){//CTE..-->> static key word aynı anda kullanılamaz.

// }

    //DisDonanim obj = new DisDonanim();//'DisDonanim' is abstract; cannot be instantiated.. obje olamaz

    //public static void main(String[] args) {///bad practice --> bir projede tek bir main method ve main class kullanılmalı
    //    System.out.println("RENK = " + RENK);
    //   aga();//static method call

    //}
}