package Homework_ScannerClassTasks;
import java.util.Scanner;
public class _22_Scanner1 {
    public static void main(String[] args) {
    /*    kullanıcının ismini print eden code create ediniz */

        Scanner input= new Scanner(System.in);
        System.out.print("ad soyad giriniz: ");
        String ad= input.nextLine();
        System.out.print("ad soyad: " + ad);


    }
}
