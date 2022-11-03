package Practice.Homework_ScannerClassTasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Günde kaç saat uyuyorsunuz?: ");
        int u = input.nextInt();
        System.out.println("Ayda: " + (u*30) +"\nYılda: "+ (u*30*12) + "\n40 yılda: "+(u*30*12*40)+"\nsaat uyursunuz.");
    }
}
