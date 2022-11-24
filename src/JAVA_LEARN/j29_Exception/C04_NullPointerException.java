package JAVA_LEARN.j29_Exception;

public class C04_NullPointerException {
    public static void main(String[] args) {
        // NullPointerException -> null ataması yapılan bir String'de length() method run edildiğnde oluşan RTE exception
        String str="";
        System.out.println("str.length() = " + str.length());
        //String str1=null;
        //System.out.println("str1.length() = " + str1.length());//NullPointerException

try {
    String str1=null;
    System.out.println("str1.length() = " + str1.length());//NullPointerException

}catch (NullPointerException e){
    System.out.println("stringe Null yazmışsın kardaşım.. ne yazdıriieeem...");
}

        System.out.println("kod sorunsuz çalıştı.. devam ettti...");


    }
}
