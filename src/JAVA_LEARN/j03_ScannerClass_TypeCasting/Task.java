package JAVA_LEARN.j03_ScannerClass_TypeCasting;

public class Task {
    public static void main(String[] args) {

        int k = 5;
        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);
    }
}
