package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
    //StringBuilder obj create etme..-->>>
    //1. yol..

        StringBuilder sb1 = new StringBuilder();//default capacity 16 bit olan value olmayan boş
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());



        sb1.append("javacan");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());


        System.out.println(sb1.append("ali").append("oley").append(true).append(5).append("kot"));
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.indexOf(\"y\") = " + sb1.indexOf("y"));
        System.out.println("sb1.insert(2, \"r\") = " + sb1.insert(2, "r"));
        sb1.deleteCharAt(4);
        System.out.println(sb1);
        sb1.replace(5, 19, "okokok");
        System.out.println(sb1);

    }//main
}