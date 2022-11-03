package Practice.Homework_ScannerClassTasks;

import java.util.Scanner;

public class _27_Scanner6 {
    public static void main(String[] args) {
    /*    kullanıcının
          Doğum gününü print eden code create ediniz */

        Scanner input= new Scanner(System.in);
        System.out.println("doğum gününüzü gün/ay/yıl olarak yazınız:");
        String date= input.nextLine();
        System.out.println("doğum tarihi: " + date);

    }
}
