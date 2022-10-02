package Homework_ScannerClassTasks;

import java.util.Scanner;

public class _25_Scanner4 {
    public static void main(String[] args) {
    /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */

        Scanner input= new Scanner(System.in);
        System.out.println("arabanızın modeli nedir?");
        String model= input.nextLine();

        System.out.println("arabanız kaç kapılı?");
        int kapı= input.nextInt();

        System.out.println("arabanın modeli: "+model+"\nkapı sayısı: " + kapı);




    }
}


