package Homework_ScannerClassTasks;

import java.util.Scanner;

public class _28_Scanner7 {
    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */



        Scanner input = new Scanner(System.in);
        System.out.println("Bir banka hesabınız var mı?(evet/hayır): ");
        String hesap = input.nextLine();
        String y = "evet", n = "hayır";
        boolean a = true;
        boolean b = false;
        if(hesap.equals(y))  {System.out.println(a);}
        else                 {System.out.println(b);}

        //if(hesap.equals(n))  {System.out.println(b);}

        /*
        int num1=40;
        int num2=20;
        boolean b1=true;
        boolean b2=false;
        if(num1<num2)
        System.out.println(b1);
        else
        System.out.println(b2);

*/

    }
}
