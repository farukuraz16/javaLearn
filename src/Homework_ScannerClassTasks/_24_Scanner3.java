package Homework_ScannerClassTasks;

import java.util.Scanner;

public class _24_Scanner3 {
    public static void main(String[] args) {
     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */
        Scanner input= new Scanner(System.in);
        System.out.println("En sevdiğiniz meyveyi yazınız:");
        String meyve= input.nextLine();
        System.out.println("En sevdiğiniz meyve: " + meyve);



    }
}
