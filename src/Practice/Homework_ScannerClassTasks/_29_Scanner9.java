package Practice.Homework_ScannerClassTasks;
import java.util.Scanner;
public class _29_Scanner9 {
    public static void main(String[] args) {

    /*   kullanıcının boyunu
          Float print eden code create ediniz   */

        Scanner input = new Scanner(System.in);
        System.out.print("boy? (cm): ");
        float b= input.nextFloat();
        System.out.print("boy : " + b/100+" m");


    }


}
