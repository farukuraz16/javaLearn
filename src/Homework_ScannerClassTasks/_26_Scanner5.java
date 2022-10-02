package Homework_ScannerClassTasks;

import java.util.Scanner;

public class _26_Scanner5 {
    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

        Scanner input= new Scanner(System.in);
        System.out.print("10 sene önce yaşadığınız şehri yazınız: ");
        String şehir= input.nextLine();
        System.out.println("10 sene önce yaşadığım şehir,"+şehir+"\'dir.");

    }
}
