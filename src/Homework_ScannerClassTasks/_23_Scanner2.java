package Homework_ScannerClassTasks;

import java.util.Scanner;

public class _23_Scanner2 {
    public static void main(String[] args) {
    /*   kullanıcının yasını print eden code create ediniz  */

        Scanner input= new Scanner(System.in);
        System.out.print("Yaşınız?: ");
        int yaş= input.nextInt();
        System.out.println("Yaşınız: " + yaş);


    }
}
